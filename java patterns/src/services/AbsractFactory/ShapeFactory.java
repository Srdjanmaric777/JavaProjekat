package services.AbsractFactory;

import services.AbsractFactory.impl.Rectangle;
import services.AbsractFactory.impl.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public IShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
