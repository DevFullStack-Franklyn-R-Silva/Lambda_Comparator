package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Tablet", 450.0));
		list.add(new Product("Notebook", 1200.0));

//		Comparator<Product> comp = (p1 , p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		}; 
		
		// melhorando mais o codigo
		//Comparator<Product> comp = (p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		// melhorando mais o codigo
		list.sort((p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		/* Muito verboso
		Comparator<Product> comp = new Comparator<Product>() { 

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		*/
		
		
		
		// list.sort(new MyComparator()); // Usando a class MyComparator

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
