package services.DecoratorService;

import services.DecoratorService.impl.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(IShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(IShape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
