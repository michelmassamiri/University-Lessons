package model;

public class Main {

	public static void main(String[] args) {
		Movie rougueOne = new Movie("Rogue One", Movie.NEW_RELEASE) ;
		Movie reineDesNeiges = new Movie("Reine des neiges", Movie.CHILDRENS) ;
		Movie starWarsIII = new Movie("Star Wars III", Movie.REGULAR) ;
		
		Rental rental_1 = new Rental(rougueOne, 5);
		Rental rental_2 = new Rental(reineDesNeiges, 7);
		Rental rental_3 = new Rental(starWarsIII, 4);
		
		Customer customer = new Customer("bob");
		customer.addRental(rental_1);
		customer.addRental(rental_2);
		customer.addRental(rental_3);
		
		TextStatment textBuilder = new TextStatment();
		customer.statement(textBuilder);
		
		System.out.println(textBuilder.getResult());
		
	}

}
