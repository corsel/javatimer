import java.util.*;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class TWClock {
	VBox vbox = new VBox(10);
	Label label = new Label("01 : 23 : 45");
	
	public VBox getWidget() {
		label.setFont(Font.font("OCR A Extended", FontWeight.BOLD, 32));
		
		
		vbox.getChildren().add(label);
		vbox.setMargin(label, new Insets(10, 10, 10, 10));
		
		return vbox;
	}
}