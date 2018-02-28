package model;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class JavaFXStatment implements StatmentBuilder{
	
	private GridPane grid, grid2;
	private VBox col;
	private Scene scene;
	private int index;
	
	public JavaFXStatment() {
		grid = new GridPane();
		grid2 = new GridPane();
		col = new VBox();
		scene = new Scene(col, 200, 200);
		
		grid.setGridLinesVisible(true);
		grid2.setGridLinesVisible(true);
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(0, 10, 0, 10));
        
        col.setAlignment(Pos.CENTER);
        col.getChildren().add(grid);
        col.getChildren().add(grid2);

	}
	
	public void beginStatment() {
		
	}
	
	public void addUserName(String userName) {
        Text header = new Text("Rental Record for "+ userName);
        grid.add(header, 0, 0);
	}
	
	public void addRentalStatment(String movieTitle, double pricing) {
        grid2.addRow(index, new Text(movieTitle+ " : " + pricing));
        ++index;
	}
	
	public void addAmountOwned(double totalAmount) {
        col.getChildren().add(new Text("Amount owned is "+ totalAmount));
	}
	
	public void addFreqTotalPoints(double freqTotalPoints) {
		col.getChildren().add(new Text("You earned "+ freqTotalPoints+ " frequent renter points"));
	}

	public void endStatment() {
		
	}
	
	public Scene getResult() {
		return scene ;
	}
}
