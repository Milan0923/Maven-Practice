package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mg")
@Scope("prototype")
public class Megician {
	public void execute() {
		System.out.println("Megician having magic trick.");
	}
}
