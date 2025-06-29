package com.example.springmockitodemo.service;

import com.example.springmockitodemo.model.User;
import com.example.springmockitodemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.MockitoAnnotations;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserById() {
        User user = new User();
        user.setId(2L);
        user.setName("Alice");

        when(userRepository.findById(2L)).thenReturn(Optional.of(user));

        User result = userService.getUserById(2L);
        assertEquals("Alice", result.getName());
    }
}
