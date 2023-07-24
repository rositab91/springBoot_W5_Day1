package rositabongiovanni.java_W5_Day1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Toppings extends Food {
	public enum toppings {
		Cheese, Ham, Mushrooms, Olives, Onions, Pineapple, Tomato
	};

	toppings toppings;

	@Override
	public String toString() {
		return this.getToppings() + " Cal " + this.getCal() + " Price " + this.getPrice();
	}

}

