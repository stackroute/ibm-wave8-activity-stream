package com.stackroute.security.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.App;
import com.stackroute.config.JwtTokenUtil;
import com.stackroute.controller.JwtAuthenticationController;
import com.stackroute.model.UserDTO;
import com.stackroute.model.Users;
import com.stackroute.service.JwtUserDetailsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
@ContextConfiguration(classes = App.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //    @Autowired
    private Users user;

    @Mock
    private AuthenticationManager authenticationManager;

    @MockBean
    private JwtUserDetailsService jwtUserDetailsService;

    @InjectMocks
    private JwtAuthenticationController jwtAuthenticationController;

    @Mock
    private JwtTokenUtil jwtTokenUtil;

    private List<Users> list = null;

    private UserDTO userDTO;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(jwtAuthenticationController).build();
        user = new Users();
        user.setEmail("ascv");
        user.setPassword("Jonny");

        list = new ArrayList();
        list.add(user);

        userDTO = new UserDTO();
        userDTO.setUsername("ascv");
        userDTO.setPassword("Jonny");
       }

    @Test
    public void saveUser() throws Exception {
        when(jwtUserDetailsService.loadUserByUsername(userDTO.getUsername())).thenReturn(new User(user.getUsername(), user.getPassword(), new ArrayList<>()));
        when(jwtTokenUtil.generateToken(new User(user.getUsername(), user.getPassword(), new ArrayList<>()))).thenReturn("Hello");
        mockMvc.perform(post("/authenticate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(userDTO)))
                .andExpect(status().isOk());
    }

//    @Test
//    public void createAuthenticationToken() throws Exception {
//        when(jwtAuthenticationController.authenticate(any(), any())).thenReturn(daouser);
//        mockMvc.perform(MockMvcRequestBuilders.post("/")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(daouser)))
//                .andExpect(status().isOk())
//                .andDo(MockMvcResultHandlers.print());
//    }

    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
