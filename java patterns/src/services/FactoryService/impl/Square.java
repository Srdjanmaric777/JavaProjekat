package services.FactoryService.impl;

import services.FactoryService.IShape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
