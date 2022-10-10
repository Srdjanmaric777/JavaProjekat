package services.AbsractFactory.impl;

import services.AbsractFactory.IShape;

public class RoundedSquare implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
