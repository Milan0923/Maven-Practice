package com.seed.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AdminAspect {
	@Before("execution(public void execute())")
	public void LightsOn() {
		System.out.println("Lights on!!");
	}
	@After("execution(public void execute())")
	public void LightsOff() {
		System.out.println("LightsOff!!");
	}
	@After("execution(public void execute())")
	public void Audience() {
		System.out.println("Audience clapping!!");
	}
}
