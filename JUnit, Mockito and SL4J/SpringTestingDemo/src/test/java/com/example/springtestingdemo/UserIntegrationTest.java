package com.example.springtestingdemo;

import com.example.springtestingdemo.model.User;
import com.example.springtestingdemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveAndFindUser() {
        User user = new User();
        user.setId(3L);
        user.setName("John");

        userRepository.save(user);

        User result = userRepository.findById(3L).orElse(null);
        assertNotNull(result);
        assertEquals("John", result.getName());
    }
}
