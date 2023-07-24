package configBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import rositabongiovanni.java_W5_Day1.Drinks;
import rositabongiovanni.java_W5_Day1.Food;
import rositabongiovanni.java_W5_Day1.Merch;
import rositabongiovanni.java_W5_Day1.Pizza;
import rositabongiovanni.java_W5_Day1.Products;
import rositabongiovanni.java_W5_Day1.Toppings.toppings;

@Configuration
public class ConfigBean {
	toppings[] margherita = { toppings.Cheese, toppings.Tomato };
	toppings[] hawaian = { toppings.Cheese, toppings.Tomato, toppings.Ham, toppings.Pineapple };
	toppings[] capricciosa = { toppings.Tomato, toppings.Cheese, toppings.Olives, toppings.Onions };

	@Bean
	public Food margherita() {
		return new Pizza("Margherita", false, margherita);
	}

	@Bean
	public Food hawaian() {
		return new Pizza("Hawaian", false, hawaian);
	}

	@Bean
	public Food capricciosa() {
		return new Pizza("Capricciosa", false, capricciosa);
	}

	@Bean
	public Food water() {
		Drinks water = new Drinks("water");
		water.setCal(0);
		water.setPrice(1.00);
		return water;
	}

	@Bean
	public Food coke() {
		Drinks coke = new Drinks("coke");
		coke.setCal(450);
		coke.setPrice(2.30);
		return coke;
	}

	@Bean
	public Food beer() {
		Drinks beer = new Drinks("beer");
		beer.setCal(345);
		beer.setPrice(5.75);
		return beer;
	}

	@Bean
	public Products notebook() {
		Merch notebook = new Merch("notebook");
		notebook.setPrice(1.25);
		return notebook;
	}

	@Bean
	public Products skirt() {
		Merch skirt = new Merch("skirt");
		skirt.setPrice(14.99);
		return skirt;
	}
}
