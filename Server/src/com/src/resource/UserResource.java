package com.src.resource;

import java.net.UnknownHostException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;
import com.src.dao.BaseDao;


@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource extends BaseDao{
	
	@GET
	public DBObject getUser() {
		DB db = null;
		try {
			db = getDatabase();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
		DBCollection coll = db.getCollection("users");
		DBObject dbo = coll.findOne(); 
		JSON.serialize(dbo);
		return dbo;
		
	}
	
}