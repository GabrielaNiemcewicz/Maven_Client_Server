//package com.journaldev.jackson.json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.FileReader;
import java.util.Iterator;



//import com.journaldev.jackson.model.Address;
//import com.journaldev.jackson.model.Employee;
public class JSONActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 URL url = new URL("https://graph.facebook.com/search?q=java&type=post");
		  try (InputStream is = url.openStream();
		       JsonReader rdr = Json.createReader(is)) {
		 
		      JsonObject obj = rdr.readObject();
		      JsonArray results = obj.getJsonArray("data");
		      for (JsonObject result : results.getValuesAs(JsonObject.class)) {
		          System.out.print(result.getJsonObject("from").getString("name"));
		          System.out.print(": ");
		         System.out.println(result.getString("message", ""));
		         System.out.println("-----------");
		     }
		 }
	}
//missess a possiblity to add import javax.json.Json, and the alike
}
