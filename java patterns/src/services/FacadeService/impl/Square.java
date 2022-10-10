package services.FacadeService.impl;

import services.FacadeService.IShape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
