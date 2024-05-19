package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jb")
@Scope("prototype")
public class Juggler {
	public void execute() {
		System.out.println("Juggler juggling beanbags.");
	}
}
