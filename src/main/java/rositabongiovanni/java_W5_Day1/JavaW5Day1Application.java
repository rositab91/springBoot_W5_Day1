package rositabongiovanni.java_W5_Day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configBean.ConfigBean;
import rositabongiovanni.java_W5_Day1.Toppings.toppings;

@SpringBootApplication
public class JavaW5Day1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaW5Day1Application.class, args);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigBean.class);

		Pizza margherita = (Pizza) appContext.getBean("margherita");
		margherita.setCal(1124);
		margherita.setPrice(7.50);

		Pizza hawaian = (Pizza) appContext.getBean("hawaian");
		hawaian.setCal(1045);
		hawaian.setPrice(10.00);

		Pizza capricciosa = (Pizza) appContext.getBean("capricciosa");
		capricciosa.setCal(1170);
		capricciosa.setPrice(8.75);

		Drinks water = (Drinks) appContext.getBean("water");
		Drinks coke = (Drinks) appContext.getBean("coke");
		Drinks beer = (Drinks) appContext.getBean("beer");

		Merch notebook = (Merch) appContext.getBean("notebook");
		Merch skirt = (Merch) appContext.getBean("skirt");

		System.out.println("\n ---Pizzas---");
		margherita.showPizza();
		hawaian.showPizza();
		capricciosa.showPizza();
		
		System.out.println("\n ---Toppings---");
		for (toppings t : toppings.values()) {
			Toppings toppings = new Toppings(t);
			toppings.setCal(55);
			toppings.setPrice(0.80);
			System.out.println(toppings);
		}

		System.out.println("\n ---Drinks---");
		water.showDrinks();
		coke.showDrinks();
		beer.showDrinks();
	                                        
	
		
		System.out.println("\n ---Franchise---");
		notebook.showMerch();
		skirt.showMerch();

		appContext.close();
	}
}
