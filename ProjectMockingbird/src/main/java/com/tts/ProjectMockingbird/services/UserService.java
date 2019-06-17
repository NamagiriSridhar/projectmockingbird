package com.tts.ProjectMockingbird.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tts.ProjectMockingbird.models.Role;
import com.tts.ProjectMockingbird.models.User;
import com.tts.ProjectMockingbird.repositories.RoleRepository;
import com.tts.ProjectMockingbird.repositories.UserRepository;

@Service
public class UserService 
{

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, 
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) 
    {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
        
    public List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }
        
    public void save(User user) {
        userRepository.save(user);
    }
    
    public User saveNewUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        roleRepository.findByRole("USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }
    
}