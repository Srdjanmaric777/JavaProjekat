package services.DecoratorService.impl;

import services.DecoratorService.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {

        System.out.println("Shape: Circle");
    }
}
