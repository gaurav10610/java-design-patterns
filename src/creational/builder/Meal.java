package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> list = new ArrayList<Item>();

	public void addItem(Item item) {
		list.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : list) {
			cost = cost + item.getPrice();
		}
		return cost;
	}

	public void showItems() {
		int count = 1;
		for (Item item : list) {
			System.out.println("Item: " + count);
			System.out.println("Name: " + item.getName());
			System.out.println("Packing: " + item.getPacking().pack());
			System.out.println("Price: " + item.getPrice());
			count++;
		}
	}
}
