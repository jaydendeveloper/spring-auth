package authentication.demo.interfaces;

import java.util.List;

import authentication.demo.models.User;

public interface UserDataAccess {
    List<User> findAll();
}
