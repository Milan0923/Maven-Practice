package com.seed.MavenLab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.config.config;
//import com.seed.model.Address;
import com.seed.model.Customer;

public class App {
    public static void main( String[] args ){
    	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Customer c = (Customer) context.getBean("cust",111,"Ayush",context.getBean("custAdd","Laxmi Chowk","Pune","MH","India",411057L));
		System.out.println(c);
//		Address ad = (Address) context.getBean("addr","Laxmi Chowk","Pune","India",411057);
//		System.out.println(ad);
    }
}


