package com.demo.serviceUnitTests;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceUnitTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    public void shouldReturnOkWhenSaveValidUser(){
        User user = new User("name", "name@email.com", "password");
        UserService userService = new UserService(userRepository);

        Mockito.when(userRepository.save(user)).thenReturn(user);
        User userExpected = userService.save(user);

        Assert.assertEquals(user.getName(), userExpected.getName());
        Assert.assertEquals(user.getEmail(), userExpected.getEmail());
        Assert.assertEquals(user.getPassword(), userExpected.getPassword());
    }
}
