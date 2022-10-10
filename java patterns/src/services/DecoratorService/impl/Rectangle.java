package services.DecoratorService.impl;

import services.DecoratorService.IShape;

public class Rectangle implements IShape {
    @Override
    public void draw() {

        System.out.println("Shape: Rectangle");
    }
}
