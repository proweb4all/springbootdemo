package ru.proweb4all.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.proweb4all.springbootdemo.model.User;
import ru.proweb4all.springbootdemo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUser(Long id){
        return userRepository.getOne(id);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
