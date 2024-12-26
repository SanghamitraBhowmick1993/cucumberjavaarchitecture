package com.pages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadJsonFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readDataFromJsonUsingJava11();

	}
	
	public static void readDataFromJsonUsingJava11() throws IOException {
		String json = Files.readString(Paths.get("/Users/sanghamitrabhowmick/Desktop/testjava11.json"));
		
//		Person person = new Gson().fromJson(json, Person.class);

		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Person person = objectMapper.readValue(json, Person.class);
		String name = person.getName();
		System.out.println(name);
		int age = person.getAge();
		System.out.println(age);
		String street = person.getAddress().getStreet();
		System.out.println(street);
		String city = person.getAddress().getCity();
		System.out.println(city);
		String state = person.getAddress().getState();
		System.out.println(state);
		String zip = person.getAddress().getZip();
		System.out.println(zip);


	}

}
