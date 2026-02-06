package authentication.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import authentication.demo.models.Database;

@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfiguration {

    private Database database = Database.IN_MEMORY;

    public Database getDatabaseConfiguration(){
        return this.database;
    }

    public void setDatabaseConfiguration(Database database) {
        this.database = database;
    }

}
