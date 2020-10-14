package com.example.springdemo.services.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.bean.Employeebean;
import com.example.springdemo.bean.jpa.Employeepojo;
import com.example.springdemo.services.Travelservices;
import com.example.springdemo.services.Travelservices1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 

@Service
public class Traveljsoncompareservice implements Travelservices1 {

	@Autowired
	private static ModelMapper mapper;
	
	
	
	public void jsoncompare(List<Employeebean> emp) {
	
	
	       
	        String json2 = "  [" +
	        "  {\"name\":\"John\",\r\n" +
	        "  \"age\":30,\r\n" +
	        "  \"org\":\"HCL\"},\r\n" +
	        "    {\"name\":\"John2\",\r\n" +
	        "  \"age\":30,\r\n" +
	        "  \"org\":\"TCS\"}\r\n" +
	        "  ]";
	        ObjectMapper mapper = new ObjectMapper();
	        List<Map<String, Object>> data ;
	        try
	        {
	        data = mapper.readValue(json2, new TypeReference<List<Map<String, Object>>>(){});
	           int i =1;
	           HashMap<String, Object> hmap = new HashMap<>();
	        for (Map<String, Object> mapObj : data) {
	        hmap.put("obj"+i, mapObj);
	        i++;
	}
	        if(hmap.get("obj1").equals("obj2")) {
	        System.out.println("Both objects are equal");
	       
	        }else {
	        System.out.println("differed values ");
	        HashMap<String, Object> hm1 = (HashMap<String, Object>) hmap.get("obj1");
	        HashMap<String, Object> hm2 = (HashMap<String, Object>) hmap.get("obj2");
	        if(!hm1.get("name").equals(hm2.get("name"))) {
	        System.out.println(hm1.get("name")+":::"+hm2.get("name"));
	        }
	        if (!hm1.get("age").equals(hm2.get("age"))) {
	        System.out.println(hm1.get("age")+":::"+hm2.get("age"));
	}
	        if (!hm1.get("org").equals(hm2.get("org"))) {
	        System.out.println(hm1.get("org")+":::"+hm2.get("org"));
	}
	        }
	        }
	        catch (JsonGenerationException e) {
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }



	@Override
	public void jsoncompare() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Object jsonCompare(List<Employeebean> emp) {
		// TODO Auto-generated method stub
		return null;
	}
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
