package example.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class dvdrentalConfig {

   /* @Primary
    @Bean
    public DataSource customDataSource()
    {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("custom.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("custom.datasource.url"));
        dataSource.setUsername(env.getProperty("custom.datasource.postgres"));
        dataSource.setPassword(env.getProperty("custom.datasource.postgres"));

        return dataSource;

    }*/
    @Bean(name = "dvdrental")
    @ConfigurationProperties(prefix = "spring.datasource.dsdvdrental")
    public DataSource userDbMaria()
    {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mariaJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("dvdrental") DataSource dvdrental) {
        return new JdbcTemplate(dvdrental);
    }
}