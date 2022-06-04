package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Counteachchar {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="arvinda";
		Map<Character,Integer> hm=new LinkedHashMap();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch,hm.get(ch)+1);
			}else {
				hm.put(ch,1);
			}
			
		}
		
		System.out.println(hm);
		
		Set<Map.Entry<Character, Integer>> mapkey=hm.entrySet();
		
		for(Map.Entry<Character, Integer> ma:mapkey) {
			if(ma.getValue()>1)
			System.out.println(ma.getKey());
		}
		
		

	}

}
