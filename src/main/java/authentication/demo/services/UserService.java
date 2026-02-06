package authentication.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import authentication.demo.interfaces.UserDataAccess;
import authentication.demo.models.User;

@Service
public class UserService {

    private final UserDataAccess userDataAccess;

    public UserService(UserDataAccess userDataAccess) {
        this.userDataAccess = userDataAccess;
    }

    public List<User> getAllUsers() {
        return userDataAccess.findAll();
    }

}
