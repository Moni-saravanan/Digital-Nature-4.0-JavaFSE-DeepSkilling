package com.example.springtestingdemo.service;

import com.example.springtestingdemo.model.User;
import com.example.springtestingdemo.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService();
        User user = new User();
        user.setId(1L);
        user.setName("Alice");

        when(mockRepo.findById(1L)).thenReturn(Optional.of(user));

        // Manually inject mock (for simplicity)
        try {
            var field = UserService.class.getDeclaredField("userRepository");
            field.setAccessible(true);
            field.set(userService, mockRepo);
        } catch (Exception ignored) {}

        User result = userService.getUserById(1L);
        assertEquals("Alice", result.getName());
    }
}
