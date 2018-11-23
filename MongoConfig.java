/*
package com.telstra.shortestpath.main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
// @ConditionalOnExpression("${mongo.use:true}")
public class MongoConfig extends AbstractMongoConfiguration {
	@Value("${spring.data.mongodb.host}")
	private String mongoServer;
	@Value("${spring.data.mongodb.port}")
	private int mongoPort;
	@Value("${spring.data.mongodb.database}")
	private String mongoDBName;
	@Value("${spring.data.mongodb.username}")
	private String mongoDbLogin;
	@Value("${spring.data.mongodb.password}")
	private String mongoDbPassword;

	public MongoConfig() {
		// default constructor
	}

	@Override
	protected String getDatabaseName() {
		return mongoDBName;
	}

	@Bean
	@Primary
	public MongoDbFactory mongoDbFactory() throws Exception {
		try {

			// Set credentials
			MongoCredential credential = MongoCredential.createCredential(mongoDbLogin,mongoDBName,mongoDbPassword.toCharArray());
			ServerAddress serverAddress = new ServerAddress(mongoServer, mongoPort);
			// Mongo Client
			MongoClient mongoClient = new MongoClient(serverAddress, Arrays.asList(credential));
			// Mongo DB Factory
			SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongoClient, mongoDBName);
			return simpleMongoDbFactory;

		} catch (Exception e) {
			throw e;
		}
	}

	@Bean
	@Primary
	public MongoTemplate mongoTemplate() throws Exception {

		try {
			return new MongoTemplate(mongoDbFactory(), mappingMongoConverter());
		} catch (Exception e) {
			throw e;
		}
	}

	

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new Mongo(mongoServer, mongoPort);
	}
}
*/