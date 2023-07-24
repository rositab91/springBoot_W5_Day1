package rositabongiovanni.java_W5_Day1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Drinks extends Food {
	String name;

	public void showDrinks() {
		System.out.print(this.getName() + " Cal: " + this.getCal() + " Price " + this.getPrice());
		System.out.println();
	}
}
