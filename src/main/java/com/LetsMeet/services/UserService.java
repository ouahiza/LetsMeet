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
        Optional<User> user = userRepository.findByEmailAndPassword(email_address,password);
        if(user.isEmpty()){
            throw new ForbiddenException("Username or password incorrect");
        }
        return user.get();

        /*User user = userRepository.findByEmail(email_address).orElseThrow(() -> new ResourceNotFoundException("User not found on :: "));;
        if (user != null) {
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new ForbiddenException("Username or password incorrect");
        */

    }

    public User infoValidation(String email_address, String first_name, String last_name, String password) throws ForbiddenException {
        if(email_address.isEmpty() || first_name.isBlank() || last_name.isBlank() || password.isBlank()) {
            throw new ForbiddenException("user info are not filled correctly");
        }
        User user = new User();
        user.setEmail(email_address);
        user.setFirstName(first_name);
        user.setLastName(last_name);
        user.setPassword(password);

        return userRepository.save(user);
    }
}
