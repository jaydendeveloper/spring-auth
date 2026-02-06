package authentication.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import authentication.demo.interfaces.UserDataAccess;
import authentication.demo.models.User;

@Repository
public class InMemoryDataAccess implements UserDataAccess {
    private final List<User> users = new ArrayList<>();

    public InMemoryDataAccess() {
        users.add(new User("johndoe", "Password123", "john@example.com", "USER"));
        users.add(new User("janesmith", "Password123", "jane@example.com", "USER"));
    }

    @Override
    public List<User> findAll(){
        return this.users;
    }
}
