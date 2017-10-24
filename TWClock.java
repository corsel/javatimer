import java.util.*;
import java.lang.Void;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class TWClock extends Task<Void> {
	VBox vbox = new VBox(10);
	Label label = new Label("01 : 23 : 45");
	
	@Override
	protected Void call() throws Exception {
		while(true) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					Calendar cal = Calendar.getInstance();
					int hour = cal.get(Calendar.HOUR_OF_DAY);
					int minute = cal.get(Calendar.MINUTE);
					int second = cal.get(Calendar.SECOND);
					label.setText(Integer.toString(hour) + " : " + Integer.toString(minute) + " : " + Integer.toString(second));
				}
			});
			Thread.sleep(500);
		}
	}
	
	public VBox getWidget() {
		label.setFont(Font.font("OCR A Extended", FontWeight.BOLD, 22));		
		vbox.getChildren().add(label);
		vbox.setMargin(label, new Insets(10, 10, 10, 10));		
		return vbox;
	}
}