package services.AbsractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        IShape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        IShape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        IShape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        IShape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}
