package model.data_structures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


public class lectorGson {
	
	
Gson gson = new Gson();
String ruta = "./data/comparendos_dei_2018_small.geojson";
JsonReader lector;
public void leerGson() {
	try {
	
		lector = new JsonReader(new FileReader(ruta));
	
		String[] lista = gson.fromJson(lector, String[].class);
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}


}
