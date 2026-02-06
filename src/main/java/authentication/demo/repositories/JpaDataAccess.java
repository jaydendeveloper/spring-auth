package authentication.demo.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import authentication.demo.interfaces.UserDataAccess;
import authentication.demo.models.User;

@Repository
@Primary
public interface JpaDataAccess extends JpaRepository<User, Integer>, UserDataAccess {

}
