import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class TWInterface extends Application {
	private TWTimer timer = new TWTimer();
	private TWClock clock = new TWClock();
	
	@Override
	public void start(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root, 324, 200);
		
		VBox vbox = new VBox(10);
		vbox.getChildren().addAll(
			timer.getWidget(), 
			clock.getWidget());
			
		new Thread(timer).start();
		new Thread(clock).start();
			
		root.getChildren().add(vbox);
		stage.setTitle("Deneme");		
		stage.setScene(scene);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setX(1600);
		stage.setY(850);
		stage.show();
		
		System.out.println("Fin.\n");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}