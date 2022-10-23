package com.example.serverspring;

import com.mongodb.ClientSessionOptions;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootApplication
public class ServerSpringApplication {
//    @Bean
//    MongoDatabaseFactory createMonggoDatabaseFactory() {
//        return new MongoDatabaseFactory() {
//            @Override
//            public MongoDatabase getMongoDatabase() throws DataAccessException {
//                return null;
//            }
//
//            @Override
//            public MongoDatabase getMongoDatabase(String dbName) throws DataAccessException {
//                return null;
//            }
//
//            @Override
//            public PersistenceExceptionTranslator getExceptionTranslator() {
//                return null;
//            }
//
//            @Override
//            public ClientSession getSession(ClientSessionOptions options) {
//                return null;
//            }
//
//            @Override
//            public MongoDatabaseFactory withSession(ClientSession session) {
//                return null;
//            }
//        };
//    }
//    @Bean
//    MongoMappingContext CreateMongoMappingContext() {
//        return new MongoMappingContext();
//    }
    public static void main(String[] args) {
        SpringApplication.run(ServerSpringApplication.class, args);
    }

}
