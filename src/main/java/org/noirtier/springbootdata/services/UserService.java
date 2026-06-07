package org.noirtier.springbootdata.services;

import org.noirtier.springbootdata.entities.User;
import org.noirtier.springbootdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    // TODO: CHANGE DB: ADD EMAIL FIELD. Change User entity, JS code in main.html
    public Optional<User> findUserById(int id){
        return userRepository.findById(id);
    }

    public User save(User user){
        if(user!=null)
            return userRepository.save(user);
        return null; // todo: throw exception or bad response?
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(int id){
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(value -> userRepository.delete(value));
    }
}
