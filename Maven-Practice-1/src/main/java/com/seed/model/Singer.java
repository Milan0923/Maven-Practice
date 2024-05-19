package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sg")
@Scope("prototype")
public class Singer {
	public void execute() {
		System.out.println("Singer is Singing.");
	}
}
