/**
 * 
 */
package com.consultadd.task7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author siddharthnaik
 *
 */
public class QuestionEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuestionEleven q11 = new QuestionEleven();
		Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        System.out.println(q11.key(hmap));
        System.out.println(q11.value(hmap));
        
	}
	
	Map<Integer, String> key(Map<Integer, String> m) {
		//Set<Integer> keys = m.keySet();
		Integer [] key = m.keySet().toArray(new Integer[0]);
		//Collection<String> values = m.values();
		String [] value = m.values().toArray(new String[0]);
		Map<Integer, String> newMap = new LinkedHashMap<Integer, String>();
		for(int i=0;i<m.size()-1;i++) {
			for(int j=i+1;j<m.size();j++) {
				if(key[i]>key[j]) {
					int k = key[i];
					key[i] = key[j];
					key[j] = k;
					
					String st = value[i];
					value[i] = value[j];
					value[j] = st;
				}
			}
		}
		for(int i=0;i<m.size();i++) {
			newMap.put(key[i], value[i]);
		}
		return newMap;
	}
	
	Map<Integer, String> value(Map<Integer, String> m) {
		//Set<Integer> keys = m.keySet();
		Integer [] key = m.keySet().toArray(new Integer[0]);
		//Collection<String> values = m.values();
		String [] value = m.values().toArray(new String[0]);
		Map<Integer, String> newMap = new LinkedHashMap<Integer, String>();
		for(int i=0;i<m.size()-1;i++) {
			for(int j=i+1;j<m.size();j++) {
				if(value[i].toCharArray()[0]>value[j].toCharArray()[0]) {
					int k = key[i];
					key[i] = key[j];
					key[j] = k;
					
					String st = value[i];
					value[i] = value[j];
					value[j] = st;
				}
			}
		}
		for(int i=0;i<m.size();i++) {
			newMap.put(key[i], value[i]);
		}
		return newMap;
	}

}
