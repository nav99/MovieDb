package application.configuration;

import java.util.Properties;

import javax.sql.DataSource;
import java.sql.SQLException;

import org.h2.server.web.WebServlet;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "application.configuration" })
@PropertySource(value = { "classpath:application-aws.properties" })
public class HibernateConfiguration {
	
	 @Autowired
	    private Environment environment;
	 
	 @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(getDataSource());
	        sessionFactory.setPackagesToScan("application.model");
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	     }
	 
	 @Bean
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName(environment.getRequiredProperty("spring.datasource.driverClassName"));
			dataSource.setUrl(environment.getRequiredProperty("spring.datasource.url"));
			dataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));
			dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));
			return dataSource;
		}
	 
	 private Properties hibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", environment.getRequiredProperty("spring.jpa.properties.hibernate.dialect"));
	        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
	        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
	        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("spring.jpa.hibernate.ddl-auto"));
	        return properties;
	    }

		/*
		 * private Properties hibernateProperties1() { Properties properties = new
		 * Properties(); properties.put("hibernate.dialect",
		 * environment.getRequiredProperty("hibernate.dialect"));
		 * properties.put("hibernate.show_sql",
		 * environment.getRequiredProperty("hibernate.show_sql"));
		 * properties.put("hibernate.format_sql",
		 * environment.getRequiredProperty("hibernate.format_sql"));
		 * properties.put("hibernate.hbm2ddl.auto",
		 * environment.getRequiredProperty("hibernate.hbm2ddl.auto")); return
		 * properties; }
		 */

	    @Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory s) {
	        HibernateTransactionManager txManager = new HibernateTransactionManager();
	        txManager.setSessionFactory(s);
	        return txManager;
	    }
	    
	    @Bean
	    ServletRegistrationBean h2ServletRegistrationBean() {
	    	ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
	    	registrationBean.addUrlMappings("/h2-console/*");
	    	return registrationBean;
	    }
	 @Bean(initMethod="start",destroyMethod="stop")
		public org.h2.tools.Server h2WebConsoleServer () throws SQLException {
   	 	return org.h2.tools.Server.createWebServer("-web","-webAllowOthers","-webDaemon","-webPort", "8080");
}
}
