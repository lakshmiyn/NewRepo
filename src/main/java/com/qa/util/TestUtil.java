package com.qa.util;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class TestUtil {

	public static String getValueByJPath(JSONObject responsejson, String jpath){
		
		Object obj = responsejson;
		for(String s : jpath.split("/")) 
			if(!s.isEmpty()) 
				if(!(s.contains("[") || s.contains("]")))
					obj = ((JSONObject) obj).get(s);
					
						
				else if(s.contains("[") || s.contains("]"))
					obj = ((JSONArray) ((JSONObject) obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));

				
		return obj.toString();
	
	
	
	//{"per_page":6,"total":12,"data":[{"last_name":"Bluth","id":1,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg","first_name":"George","email":"george.bluth@reqres.in"},{"last_name":"Weaver","id":2,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg","first_name":"Janet","email":"janet.weaver@reqres.in"},{"last_name":"Wong","id":3,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg","first_name":"Emma","email":"emma.wong@reqres.in"},{"last_name":"Holt","id":4,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg","first_name":"Eve","email":"eve.holt@reqres.in"},{"last_name":"Morris","id":5,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg","first_name":"Charles","email":"charles.morris@reqres.in"},{"last_name
	


}
}