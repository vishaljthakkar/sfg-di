package com.springframework.sfgdi;

import com.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) context.getBean("myController");
		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());


		/* NOTE: Bean name is a className but starts with lowercase letter */
		System.out.println("----- Property Injected");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter Injected");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor Injected");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
