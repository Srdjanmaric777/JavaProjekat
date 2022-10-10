package services.Builder.impl;

import services.Builder.IItem;
import services.Builder.IPacking;

public abstract class ColdDrink implements IItem {
    @Override
    public IPacking packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
