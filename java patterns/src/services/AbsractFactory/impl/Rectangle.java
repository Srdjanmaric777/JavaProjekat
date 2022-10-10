package services.AbsractFactory.impl;

import services.AbsractFactory.IShape;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
