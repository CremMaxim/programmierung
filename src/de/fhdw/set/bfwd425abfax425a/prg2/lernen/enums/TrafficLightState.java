package de.fhdw.set.bfwd425abfax425a.prg2.lernen.enums;

public enum TrafficLightState {
    RED("REDYELLOW"), REDYELLOW("GREEN"), GREEN("YELLOW"), YELLOW("RED");
    
    private String mNextState;

    TrafficLightState(String nextState) {
        mNextState = nextState;
    }

    public TrafficLightState getNextState(){
        return TrafficLightState.valueOf(mNextState);
    }
}
