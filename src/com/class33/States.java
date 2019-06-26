package com.class33;

import java.util.*;

public class States {

	public static void main(String[] args) {
		Map<String, String> st=new HashMap<>();
		st.put("NY", "New York");
		st.put("NJ", "New Jersey");
		st.put("CT", "Connecticut");
		st.put("FL", "Florida");
		st.put("Tx", "Texas");
		
		System.out.println(st);
		
		for (Map.Entry<String, String> state : st.entrySet()) {
			System.out.println(state.getKey() + ":" + state.getValue());
		}
		System.out.println("----------Using Iterator----------");
		Iterator<Map.Entry <String, String>> it=st.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> stt=it.next();
			System.out.println(stt.getKey()+"="+stt.getValue());
		}

	}

}
