package model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static Scene scene;
	
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();		
	}
	

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
		
		//TextStatment textBuilder = new TextStatment();
		JavaFXStatment fxbuilder = new JavaFXStatment();
		customer.statement(fxbuilder);
		
		scene = fxbuilder.getResult();
		launch(args);
	}

}
