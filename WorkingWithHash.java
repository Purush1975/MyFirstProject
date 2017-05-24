package com.orangehrm.utility;

import java.util.HashMap;
import java.util.Map;


public class WorkingWithHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Map<String, String> m1 = new HashMap<String, String>();
    m1.put("Purush", "42");
    m1.put("Reka", "35");
    m1.put("Sabarina", "8");
    
    System.out.println(m1.get("Sabarina"));
    System.out.println(m1.get("Purush"));
    System.out.println(m1.get("Reka"));

	}

}
