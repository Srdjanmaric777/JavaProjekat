package services.FacadeService.impl;

import services.FacadeService.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
