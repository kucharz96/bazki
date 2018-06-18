package baza;

//Import Funkcji mongodb
import com.mongodb.*;
import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Elo");
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB database = mongoClient.getDB("baza");
		mongoClient.getDatabaseNames().forEach(System.out::println);
		DBCollection collection = database.getCollection("Pacjenci");
		DBObject person = new BasicDBObject("_id", "jo");
		collection.insert(person);
		
	}

}
