package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton penRadio;

    @FXML
    private RadioButton eraserRadio;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        // Kiểm tra xem tọa độ chuột có nằm trong vùng vẽ không để tránh vẽ ra ngoài Pane
        if (event.getX() >= 0 && event.getX() <= drawingAreaPane.getWidth() &&
            event.getY() >= 0 && event.getY() <= drawingAreaPane.getHeight()) {
            
            // Nếu chọn Eraser thì dùng màu trắng (trùng màu nền), ngược lại dùng màu đen [cite: 3349]
            Color inkColor = eraserRadio.isSelected() ? Color.WHITE : Color.BLACK;
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, inkColor);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}