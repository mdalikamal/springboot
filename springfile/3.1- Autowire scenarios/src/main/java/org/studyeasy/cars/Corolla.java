package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("myCorolla")
public class Corolla implements Car {
	
	@Autowired
	Engine engine;
    
	
	public void setEngine(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
	
	//Autowire constructor is optional
	public Corolla(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}


	public String specs() {
		String specs = "Sedan from Toyota with engine type " + engine.type;
		return specs;
	}



}
