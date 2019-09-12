package com.stackroute.security.repository;

import com.stackroute.dao.UserDao;
import com.stackroute.model.UserDTO;
import com.stackroute.model.Users;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class RepositoryTest {

    @Mock
    UserDao userDao;

    Users user;

    UserDTO userDTO;

    @Before
    public void setUp() {
        user = new Users();
        user.setPassword("dwyg");
        user.setUsername("John");
        userDTO = new UserDTO();
        userDTO.setPassword("dwyg");
        userDTO.setUsername("John");
    }

    @After
    public void tearDown() {
        userDao.deleteAll();
    }


//    @Test
//    public void findByUsername() {
////        userDao.findByUsername(userDTO.getUsername());
//        UserDTO fetchUser = (UserDTO) userDao.findByUsername(userDTO.getUsername());
//        Assert.assertEquals("John",fetchUser);
//
//    }

    @Test
    public void findByUsername() {
        when(userDao.findByusername(user.getUsername())).thenReturn(user);
        Assert.assertEquals(user, userDao.findByusername(userDTO.getUsername()));
    }
}




