package services.FacadeService.impl;

import services.FacadeService.IShape;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
