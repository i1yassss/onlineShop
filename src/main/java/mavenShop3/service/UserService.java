package mavenShop3.service;

import mavenShop3.model.User;

import java.util.List;


public interface UserService {

    boolean authorize(String name, String password);

    boolean deleteUser(Integer id);

    boolean edit(User u);

    User find(Integer id);

    List<User> findAll();

    User findByName(String name);
    
    List<User> findByNames(String name);
    
    int Add(User u);    
}
