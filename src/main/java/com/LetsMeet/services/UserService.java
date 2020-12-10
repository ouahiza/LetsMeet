package com.LetsMeet.services;

import com.LetsMeet.exceptions.ForbiddenException;
import com.LetsMeet.exceptions.ResourceNotFoundException;
import com.LetsMeet.models.User;
import com.LetsMeet.models.UserRepository;

public class UserService{
    private UserRepository userRepository;

    public User findByEmailAndPassword(String email_address, String password) throws ForbiddenException, ResourceNotFoundException {

        User user = userRepository.findByEmail(email_address).orElseThrow(() -> new ResourceNotFoundException("User not found on :: "));;
        if (user != null) {
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new ForbiddenException("Username or password incorrect");
    }
}
