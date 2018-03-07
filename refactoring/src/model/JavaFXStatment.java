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
	
	public void addUserName(String userName, String message) {
        Text header = new Text(message+ userName);
        grid.add(header, 0, 0);
	}
	
	public void addRentalStatment(String movieTitle, double pricing) {
        grid2.addRow(index, new Text(movieTitle+ " : " + pricing));
        ++index;
	}
	
	public void addAmountOwned(double totalAmount, String message) {
        col.getChildren().add(new Text(message + totalAmount));
	}
	
	public void addFreqTotalPoints(double freqTotalPoints, String message) {
		col.getChildren().add(new Text(message + freqTotalPoints+ " frequent renter points"));
	}

	public void endStatment() {
		
	}
	
	public Scene getResult() {
		return scene ;
	}
}
