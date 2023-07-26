package ajith1;

import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class WatherReport {
@Test
	public static void test1() throws JsonProcessingException{
	List<WatherEntery> object= RestAssured.given().get(
			"https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22")
			.jsonPath().getObject("list", new TypeRef<List<WatherEntery>>() {
			});
	
ObjectMapper objectmapper	= new ObjectMapper();

String writeValueString = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(object.get(0));
System.out.println(writeValueString);
}
@Test
public static void test3()
{
Scanner scnner= new Scanner(System.in);
int choice;
do {
	System.out.println("Menu:");
	System.out.println("1.get Temperature");
	System.out.println("2.get Wind Speed");
	System.out.println("3.get pressure");
	System.out.println("0.Exit");
}	
}














