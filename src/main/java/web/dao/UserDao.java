package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUserByID(long id);

    List<User> getAllUsers();

    void editUsers(User user);

    User getUser(long id);


}
