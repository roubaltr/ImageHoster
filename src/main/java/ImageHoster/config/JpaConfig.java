package ImageHoster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class JpaConfig {
// make two object 
    @Bean
    public EntityManagerFactory entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
        emfb.afterPropertiesSet();
        return emfb.getObject();
    }
// here you can add Drive Manager object
    @Bean
    public DataSource dataSource() {
        //hihhjdvchg
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/imageHoster");
         ds.setUsername("postgres");
         ds.setPassword("postgres");
        return ds;
    }
}

