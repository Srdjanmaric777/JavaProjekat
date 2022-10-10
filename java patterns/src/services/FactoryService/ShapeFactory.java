package services.FactoryService;

import services.FactoryService.impl.Circle;
import services.FactoryService.impl.Rectangle;
import services.FactoryService.impl.Square;

public class ShapeFactory {
    public IShape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
