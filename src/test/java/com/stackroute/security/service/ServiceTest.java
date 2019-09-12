//package com.stackroute.security.service;
//
//import com.stackroute.dao.UserDao;
//import com.stackroute.model.UserDTO;
//import com.stackroute.model.Users;
//import com.stackroute.service.JwtUserDetailsService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//public class ServiceTest {
//    @Mock
//    private PasswordEncoder bcryptEncoder;
//
//    //Inject the mocks as dependencies into UserServiceImpl
//    @Mock
//    JwtUserDetailsService jwtUserDetailsService;
//
//    List<UserDTO> list = null;
//
//    @Mock
//    UserDao userDao;
//
//    Users user;
//
//    UserDTO userDTO;
//
//    @Before
//    public void setUp() {
//        //Initialising the mock object
//        MockitoAnnotations.initMocks(this);
//        userDTO = new UserDTO();
//        userDTO.setUsername("John");
//        userDTO.setPassword("uhds");
//
//        user = new Users();
//        user.setUsername("John");
//        user.setPassword("uhds");
//
//        list = new ArrayList<>();
//        list.add(userDTO);
//    }
//
////    @Test
////    public void saveUserTestSuccess() {
////        when(jwtUserDetailsService.loadUserByUsername(userDTO.getUsername())).thenReturn();
////        Assert.assertEquals(user, jwtUserDetailsService.loadUserByUsername(userDTO));
////        //verify here verifies that userRepository save method is only called once
//////        verify(userDao,times(1)).save(daoUser);
////    }
//    @Test
//    public void loadUserByName() {
//        when(userDao.findByUsername(user.getUsername())).thenReturn(user);
//        when(jwtUserDetailsService.loadUserByUsername(any()));
//        System.out.println(jwtUserDetailsService.loadUserByUsername(user.getUsername()));
//        //Assert.assertEquals(new User(daoUser.getUsername(), daoUser.getPassword(), new ArrayList<>()),jwtUserDetailsService.loadUserByUsername(daoUser.getUsername()));
//        //verify here verifies that userRepository save method is only called once
////        verify(userDao,times(1)).save(daoUser);
//    }
//

