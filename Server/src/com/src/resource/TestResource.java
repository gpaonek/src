package com.src.resource;

import java.net.UnknownHostException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;
import com.src.dao.BaseDao;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)

public class TestResource extends BaseDao {
	@GET
	public String getMsg() {
		System.out.println("in GET");
		String output="";
			DB db = null;
			try {
				db = getDatabase();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MongoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DBCollection coll = db.getCollection("test");
			DBCursor cursor = coll.find();
			try {
			   while(cursor.hasNext()) {
				   output += cursor.next();
			   }
			} finally {
			   cursor.close();
			}
			Gson gson = new Gson();
			output = gson.toJson(output);
			return output;
		
		
 
	}

}
