package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("myCorolla")
public class Corolla implements Car {
    @Autowired
    Engine engine;

	
	public String specs() {
		String specs = "Sedan from Toyota with engine type as "+engine.type;
		return specs;
	}

}