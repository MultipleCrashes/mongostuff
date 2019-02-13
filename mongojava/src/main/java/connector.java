

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClient;
import com.mongodb.*;
import com.mongodb.MongoCredential;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.*;
import java.lang.*;
import com.mongodb.Cursor;

import java.awt.*;

class Connector{

public static void main(String args[])
{
	
	try {
// create mongo client
		MongoClient mongo = new MongoClient("localhost",27017);
	// creating credentials 
		
		System.out.println("Connected to the datase successfully");
		// Accessing the database 
		Connector obj = new Connector();
		obj.bulkInsertion(mongo);
		String dbName;
		String collectionName;
		obj.iterateCollection(mongo, dbName="ndb", collectionName="collection1");
		//obj.dbOperations(mongo);
		//obj.insertRow(mongo);  // passing Db handler 
	}
	catch(Exception e) {
		System.out.println("exception found while connecting to client");
	}
}


public void bulkInsertion(MongoClient mongo) {
	DB dbh = mongo.getDB("ndb");
	DBCollection dbc = dbh.getCollection("collection1");
	for(int x=1; x<100000; x++) {		
		BasicDBObject document = new BasicDBObject();
		document.put("fname", x);
		dbc.insert(document);
		System.out.println("Inserting element in db : " +x );
	}
	
}

public void iterateCollection(MongoClient mongo, String dbName, String collectionName)
{
	DB dbh = mongo.getDB(dbName);
	DBCollection dbc = dbh.getCollection(collectionName);
	dbc.find();
	DBCursor dbcur = dbc.find();
	while(dbcur.hasNext()) {
		System.out.println("Fetched value from db" + dbcur.next());
	}
}
}
