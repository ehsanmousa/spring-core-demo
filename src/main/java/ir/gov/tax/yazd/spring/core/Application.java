package ir.gov.tax.yazd.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		try (var appCtx = new ClassPathXmlApplicationContext("application-context.xml")) {
			System.out.println(appCtx);
		}
	}
}
