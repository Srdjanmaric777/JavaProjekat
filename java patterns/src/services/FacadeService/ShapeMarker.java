package services.FacadeService;

import services.FacadeService.impl.Circle;
import services.FacadeService.impl.Rectangle;
import services.FacadeService.impl.Square;

public class ShapeMarker {
    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeMarker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
}
