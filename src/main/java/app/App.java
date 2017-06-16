package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloWorld;
import config.SpringConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
		//helloWorld.setName("Dinesh");
		helloWorld.printHello();
	}
}
