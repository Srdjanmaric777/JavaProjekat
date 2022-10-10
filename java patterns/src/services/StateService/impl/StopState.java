package services.StateService.impl;

import services.StateService.Context;
import services.StateService.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop state";
    }
}
