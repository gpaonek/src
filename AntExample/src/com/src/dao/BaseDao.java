package com.src.dao;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class BaseDao {
	

	public static DB getDatabase() throws UnknownHostException, MongoException{
		Mongo mongo = new Mongo("ds039768.mongolab.com", 39768);
		DB db = mongo.getDB("webdb");
		boolean auth = db.authenticate("test", "test".toCharArray());
		if(auth){
			return db;
		}
		else
			return null;
	}
	

}

	
