import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.utility.BaseProperty;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static com.mongodb.client.model.Filters.lt;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.gt;




public class testsample extends BaseProperty {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {

		File file = new File("C:\\Users\\admin\\eclipse-workspace\\VPISO_Core_QA_23\\VPISO_Core_QA_2\\MessageSamples\\MT103.txt");

		String content = FileUtils.readFileToString(file, "UTF-8");

		// System.out.println(content);



		//To process payment and get volbase ID
		//		Response response = RestAssured.given().body(content).post("http://10.50.76.235:8080/translator/transport/ausoutgoingmt");
		//		String body = response.getBody().asString();
		//	System.out.println(body);

		//to get the response
//		Response response1 = RestAssured.given().get("http://10.50.76.232:8080/rest/rest/rcvdinstruction/VOLBASE0000000202/incidence?ordCls=-IsseTmstmp&start=0&count=20");
//		String body1 = response1.getBody().asString();
//		System.out.println(body1);
		
		//String value2="";

		MongoClient mongoClient = new MongoClient( "10.50.36.7" , 27017 );
		MongoDatabase database = mongoClient.getDatabase("volpayreaddb");
		MongoCollection<Document> collection = database.getCollection("UserSession");
		
	
	//}}
		   //FindIterable<Document> iterDoc = collection.find(); 
		   
		   
		  // String value1  = collection.find().projection(Projections.include("UsrId")).first().getString("UsrId");
		   
		 //  String value1  = collection.find().projection(Projections.include("SsnTkn")).first().getString("SsnTkn");
		   
		//   System.out.println(value1);
		   
//		  int i = 1;
//		   // Getting the iterator 
//		  Iterator it = iterDoc.iterator(); 
//		   while (it.hasNext()) { 
//			   
//		// String next = it.next().toString();
//			   Object next = it.next();
//				
//			  System.out.println("kk ="+next);
//		  i++; 
		 // String value3  = collection.find().projection(Projections.include("UsrId")).
		 // if (value3.contains("adminuser")) {
		//  value2  = collection.find().projection(Projections.include("SsnId")).first().getString("SsnId");
		//break;
	//}
			  
		   FindIterable<Document> iterDoc = collection.find(); 
		   int i = 1;
		   // Getting the iterator 
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
		  Object next = it.next();
		  System.out.println(i+"  "+next);
		  DBObject dbo = (DBObject) collection.find();
		  String name = dbo.get("UsrId").toString();
		  String age = dbo.get("SsnTkn").toString();
		  System.out.println(name);
		  System.out.println(age);
		   i++; 
		   } }}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	//  }
		
//System.out.println(" a  "+value2);
	
	//}}
//		
		







//		String fit = collection.find(and(lt("UsrId","refdataapprover"),
//                gt("Sts", "ACTIVE"))).projection(Projections.include("UsrId")).first().getString("UsrId");
//		
//		System.out.println(fit);}}
		//System.out.println(value1);
		
		
		
		
//		public class RetrievingAllDocuments { 
//			   public static void main( String args[] ) { 
				   
//					MongoClient mongoClient = new MongoClient( "10.50.36.7" , 27017 );
//					MongoDatabase database = mongoClient.getDatabase("volpayreaddb");
//					MongoCollection<Document> collection = database.getCollection("UserSession");
					
					
//			   // Creating a Mongo client 
//			   MongoClient mongo = new MongoClient( "localhost" , 27017 );
//			   // Creating Credentials 
//			   MongoCredential credential;
//			   credential = MongoCredential.createCredential("examplesUser",    "examplesDb", 
//			   "password".toCharArray()); 
//			   System.out.println("Connected to the database successfully"); 
//			   // Accessing the database 
//			   MongoDatabase database = mongo.getDatabase("examplesDb"); 
//			   // Retrieving a collection 
//			   MongoCollection<Document> collection =    database.getCollection("examplesCollection");
//			   System.out.println("Collection examplesCollection selected successfully");
			   // Getting the iterable object 
					//
//			   FindIterable<Document> iterDoc = collection.find(); 
//			   int i = 1;
//			   // Getting the iterator 
//			   Iterator it = iterDoc.iterator(); 
//			   while (it.hasNext()) { 
//				public String aa = it.next().toString();
//			 //  System.out.println(aa); 
//			   i++; 
//			   }
//			  System.out.println(aa);
					
					
					
//					
//				 FindIterable fit = collection.find(and(lt("UsrId","refdataapprover"),
//			                    gt("Sts", "ACTIVE")));
////
//			            ArrayList<Document> docs = new ArrayList<Document>();
//
//			            fit.into(docs);
//			            System.out.println(docs);
//			            for (Document doc : docs) {
//
//			                System.out.println(doc);
//		            }
//			            
//			            System.out.println("over");
//		        }
		   
					
					
					
					
			//  } 
		
		
		
		
		
		
		
		

	


