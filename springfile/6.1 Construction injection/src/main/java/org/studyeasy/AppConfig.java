package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.specs.EngineType;

@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {
	
	@Bean("myCorolla")
	public Corolla corolla() {
		return new Corolla(new EngineType("V8"));
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8");
	}

}
