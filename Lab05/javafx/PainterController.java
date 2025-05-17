package hust.soict.hedspi.javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class PainterController {

    @FXML
    private VBox drawingAreaPane;

    @FXML
    void drawingAreaMouseDragged(ActionEvent event) {
    	Circle newCircle = new Circle(event.getX(),
    			event.getY(), 4, COLOR.BLACK);
    	drawingAreaPanel.getChildren().add(newCircle);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPanel.getChildren().clear();
    }

}

