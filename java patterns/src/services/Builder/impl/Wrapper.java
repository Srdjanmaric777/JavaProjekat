package services.Builder.impl;

import services.Builder.IPacking;

public class Wrapper implements IPacking {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
