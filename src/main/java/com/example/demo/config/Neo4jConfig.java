package com.example.demo.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;

//@Configuration
public class Neo4jConfig {
//    @Autowired
//    Environment environment;
//    @Bean
//    public org.neo4j.ogm.config.Configuration getConfiguration(){
//        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder().uri(environment.getProperty("spring.data.neo4j.uri")).
//        connectionPoolSize(100).credentials(environment.getProperty("spring.data.neo4j.username"), environment.getProperty("spring.data.neo4j.password")).build();
//        return configuration;
//    }
//
//    @Bean
//    public SessionFactory sessionFactory(){
//        return new SessionFactory(getConfiguration());
//    }
//
//    @Bean("neo4jTransaction")
//    public Neo4jTransactionManager neo4jTransactionManager(SessionFactory sessionFactory){
//        return new Neo4jTransactionManager(sessionFactory);
//    }
}
