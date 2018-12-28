package com.example.sample.config;
 
import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@Component("GuildConfig")
public class GuildConfig implements Config {
    private DataSource dataSource = createDataSource();

    private Dialect dialect = new MysqlDialect();

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    protected static DataSource createDataSource() {
	      SimpleDataSource datasource = new SimpleDataSource();
	      datasource.setUrl("jdbc:postgresql://*****");
	      datasource.setUser("*****");
	      datasource.setPassword("*****");
		  System.out.println("GUILD");
	      return new TransactionAwareDataSourceProxy(datasource);
    }
		  
}
