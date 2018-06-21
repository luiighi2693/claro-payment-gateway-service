package com.gateway.payments.util;

import java.util.UUID;

public class Generate {

	public Generate() {
		// TODO Auto-generated constructor stub
	}
	public static String keyString(int size){
		
		return UUID.randomUUID().toString().replace("-", "").substring(0, size);
		
	}
}
