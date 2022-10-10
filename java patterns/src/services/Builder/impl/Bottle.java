package services.Builder.impl;

import services.Builder.IPacking;

public class Bottle implements IPacking {
    @Override
    public String pack() {
        return "Bottle";
    }
}
