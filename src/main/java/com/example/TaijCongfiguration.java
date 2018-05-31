package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties(FooProperties.class)
public class TaijCongfiguration {
	
	@Autowired
	FooProperties fooProperties;
	
	public String foo() {
		return fooProperties.toString();
	}

}
