package week3.concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashMap {


	public static void main(String[] args) {



		Map<String, List<String>> nm = new LinkedHashMap<String, List<String>>();

		List<String> NewList = new ArrayList<String>();
		NewList.add("Rajahmundry");
		NewList.add("Chennai");
		NewList.add("Hyderabad");
		NewList.add("Vizag");

		nm.put("Cities", NewList);
		
		List<String> zipcode = new ArrayList<String>();
		zipcode.add("533103");
		zipcode.add("600089");
		zipcode.add("500042");
		zipcode.add("555105");


		nm.put("Zipcodes", zipcode);

		System.out.println(nm);

		
	}

}