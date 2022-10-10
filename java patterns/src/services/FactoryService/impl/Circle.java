package services.FactoryService.impl;

import services.FactoryService.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

