package authentication.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import authentication.demo.interfaces.UserDataAccess;
import authentication.demo.models.Database;
import authentication.demo.repositories.InMemoryDataAccess;
import authentication.demo.repositories.JpaDataAccess;

@Configuration
public class DatabaseConfiguration {
    @Bean
    UserDataAccess userDataAccess(AppConfiguration appConfig,
                                 InMemoryDataAccess inMemory,
                                 JpaDataAccess userRepository) {

        Database database = appConfig.getDatabaseConfiguration();

        if (database == Database.MYSQL) {
            return userRepository;
        }

        return inMemory;
    }
}
