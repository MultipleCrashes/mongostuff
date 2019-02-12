

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClient;
import com.mongodb.*;
import com.mongodb.MongoCredential;

class Connector{


public static void main(String args[])
{
	
	try {
// create mongo client
		MongoClient mongo = new MongoClient("localhost",27017);
	// creating credentials 
		
		System.out.println("Connected to the datase successfully");
		// Accessing the database 
		//MongoDatabase database = mongo.getDB("sampleDb");
		//MongoDatabase database = mongo.getDB("harishDb");	
	}
	catch(Exception e) {
		System.out.println("exception found while connecting to client");
	}
}
}
