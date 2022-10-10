package services.AbsractFactory;

import services.AbsractFactory.impl.RoundedRectangle;
import services.AbsractFactory.impl.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public IShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
