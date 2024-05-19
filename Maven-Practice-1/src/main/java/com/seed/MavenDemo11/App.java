package com.seed.MavenDemo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.config.config;
import com.seed.model.*;

public class App {
    public static void main( String[] args ){
    	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Juggler batch1 = (Juggler) context.getBean("jb");
		Singer batch2=(Singer) context.getBean("sg");
		Megician batch3=(Megician) context.getBean("mg");
		batch1.execute();
		System.out.println("______________________________");
		batch2.execute();
		System.out.println("______________________________");
		batch3.execute();
	}
}
