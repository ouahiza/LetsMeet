package com.LetsMeet.services;

import com.LetsMeet.exceptions.ForbiddenException;
import com.LetsMeet.exceptions.ResourceNotFoundException;
import com.LetsMeet.models.User;
import com.LetsMeet.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService{
    @Autowired
    private UserRepository userRepository;

    public User findByEmailAndPassword(String email_address, String password) throws ForbiddenException, ResourceNotFoundException {
        Optional<User> user1 = userRepository.findByEmailAndPassword(email_address,password);
        if(user1.isEmpty()){
            throw new ForbiddenException("Username or password incorrect");
        }
        return user1.get();

        /*User user = userRepository.findByEmail(email_address).orElseThrow(() -> new ResourceNotFoundException("User not found on :: "));;
        if (user != null) {
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new ForbiddenException("Username or password incorrect");
        */

    }
}
