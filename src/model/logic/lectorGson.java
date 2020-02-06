package model.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


import jdk.nashorn.internal.parser.JSONParser;
import model.data_structures.Comparendo;


public class lectorGson {
	
	
Gson gson = new Gson();
String ruta = "./data/comparendos_dei_2018_small.geojson";


public void leerGSON() {
	FileReader lector;
	
	org.json.simple.parser.JSONParser parcero = new org.json.simple.parser.JSONParser();
	
	try {
		lector = new FileReader(ruta);
		Object z;
		z = parcero.parse(lector);
		JSONObject  oSon = (JSONObject) z;
		
		JSONArray aSon = (JSONArray) oSon.get("features");
		
		for (int m = 0 ; m < aSon.size(); m++) {
			JSONObject objActual = (JSONObject) aSon.get(m);
			JSONObject props = (JSONObject) objActual.get("properties");
			
			 Comparendo nuevo = new Comparendo((int) objActual.get("properties"),(Date)objActual.get("FECHA_HORA"),(String)objActual.get("CLASE_VEHI"),
					 (String) objActual.get("TIPO_SERVI"),(String) objActual.get("INFRACCION"),
					 (String) objActual.get("DES_INFRAC"),(String) objActual.get("LOCALIDAD"));
			
		}
		
		
		
		
		
		
		
		
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
