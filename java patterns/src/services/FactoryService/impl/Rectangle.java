package services.FactoryService.impl;

import services.FactoryService.IShape;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
