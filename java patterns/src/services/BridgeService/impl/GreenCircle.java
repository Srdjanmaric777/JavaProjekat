package services.BridgeService.impl;

import services.BridgeService.IDrawAPI;

public class GreenCircle implements IDrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
