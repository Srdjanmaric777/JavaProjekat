package services.AbsractFactory.impl;

import services.AbsractFactory.IShape;

public class RoundedRectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
