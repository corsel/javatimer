import java.util.*;
import java.lang.Void;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class TWTimer extends Task<Void> {
	VBox vbox = new VBox(10);
	Button startButton = new Button("Start");
	Button resetButton = new Button("Reset");
	Label label = new Label("01 : 23 : 45");
	
	Date startTime = new Date();
	Date setTime = new Date();
	
	@Override
	protected Void call() throws Exception {
		return null;
	}
	
	public void reset() {
		startTime = Calendar.getInstance().getTime();
		setTime = Calendar.getInstance().getTime();
	}
	
	public VBox getWidget() {
		label.setFont(Font.font("OCR A Extended", FontWeight.BOLD, 32));
		
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10, 20, 10, 20));
		hbox.setHgrow(startButton, Priority.ALWAYS);
		hbox.setHgrow(resetButton, Priority.ALWAYS);
		startButton.setMaxWidth(Double.MAX_VALUE);
		resetButton.setMaxWidth(Double.MAX_VALUE);
		hbox.getChildren().addAll(startButton, resetButton);
		
		vbox.getChildren().addAll(
			label,
			hbox);
		
		return vbox;
	}
	/*
	public static void main(String args[]) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Timer expired.\n");
			}
		}, 2000);
		System.out.println("Fin.");
	}
	*/
}