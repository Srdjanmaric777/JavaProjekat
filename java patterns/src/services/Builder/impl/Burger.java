package services.Builder.impl;

import services.Builder.IItem;
import services.Builder.IPacking;

public abstract class Burger implements IItem {

    @Override
    public IPacking packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
