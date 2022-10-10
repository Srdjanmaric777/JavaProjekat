package services.AbsractFactory.impl;

import services.AbsractFactory.IShape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
