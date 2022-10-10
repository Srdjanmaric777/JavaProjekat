package services.FactoryService;

import services.FactoryService.IShape;
import services.FactoryService.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        IShape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        IShape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}