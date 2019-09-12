package com.stackroute.controller;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.stackroute.config.JwtTokenUtil;

import com.stackroute.model.UserDTO;
import com.stackroute.model.Users;
import com.stackroute.service.JwtUserDetailsService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin("*")
@RestController
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody UserDTO user) throws Exception {
        System.out.println(user);
        authenticate(user.getUsername(), user.getPassword());
        final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
        System.out.println(userDetails);
        final String token = jwtTokenUtil.generateToken(userDetails);
        Map<Object,Object> model=new HashMap<>();
        model.put("token",token);
        return ok(model);
    }

    @RequestMapping(value = "/forgot-password", method = RequestMethod.POST)
    public ResponseEntity<?> getEmail(@RequestBody String email) throws Exception {
        System.out.println(email);
        JSONObject jsonObject = new JSONObject(email);
        email = jsonObject.getString("email");
        final String userDetails = userDetailsService.forgotPassword(email);
        return ok(userDetails);

    }
    @RequestMapping(value = "/reset-password", method = RequestMethod.PUT)
    public ResponseEntity<?> getNewPassword(@RequestBody UserDTO userDTO) throws Exception {
        return new ResponseEntity<>(userDetailsService.update(userDTO), HttpStatus.OK);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody Users user) throws Exception {
        return ok(userDetailsService.save(user));
    }

    //authenticating username and password
    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}