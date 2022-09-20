package com.example.demo.aspect;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.data.transaction.ChainedTransactionManager;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

import javax.sql.DataSource;


/**
 * @author ljn at 2019-05-31
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
//@Aspect
//@Configuration
//@DependsOn("sessionFactory")
//@ConditionalOnBean(annotation = EnableNeo4j.class)
//@EnableTransactionManagement
public class TransactionAspect {

//    ThreadLocal<TransactionStatus> transactionStatusThreadLocal = new ThreadLocal<>();
//
//    /**
//     * 定义mysql事务管理器，必须有transactionManager作为默认事务管理器
//     *
//     * @param dataSource
//     * @return
//     */
//    @Bean("transactionManager")
//    @Primary
//    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    /**
//     * 定义neo4j事务管理器
//     *
//     * @param sessionFactory
//     * @return
//     */
//    @Bean("neo4jTransactionManager")
//    public Neo4jTransactionManager neo4jTransactionManager(SessionFactory sessionFactory) {
//        return new Neo4jTransactionManager(sessionFactory);
//    }
//
//    @Autowired
//    @Bean(name = "multiTransactionManager")
//    public PlatformTransactionManager multiTransactionManager(
//            Neo4jTransactionManager neo4jTransactionManager,
//            DataSourceTransactionManager mysqlTransactionManager) {
//        return new ChainedTransactionManager(
//                neo4jTransactionManager, mysqlTransactionManager);
//    }

}



