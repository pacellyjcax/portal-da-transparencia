package br.com.millercs.system;

import java.util.HashMap;

public class ListSource {
	
	private static HashMap<String, Object> DataList = new HashMap<>();
	
	public static void saveList(String key, Object value) {
		DataList.put(key, value);

	}
	
	public static Object getList(String key) {
		return DataList.get(key);

	}
	
	

}
