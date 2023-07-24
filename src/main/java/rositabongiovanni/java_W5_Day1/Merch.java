package rositabongiovanni.java_W5_Day1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Merch extends Products {
	String name;

	public void showMerch() {
		System.out.println(this.getName() + " Price " + this.getPrice());

	}
}
