package Week_13.FifthTask;

import javax.swing.*;
import java.util.concurrent.TransferQueue;

interface TrafficLightState
{
    void transitionToRed();
    void transitionToYellow();
    void transitionToGreen();
}
class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed(){

    }
    @Override
    public void transitionToYellow(){

    }
    @Override
    public void transitionToGreen(){

    }

}
class YellowLightState implements TrafficLightState
{
    @Override
    public void transitionToRed(){

    }
    @Override
    public void transitionToYellow(){

    }
    @Override
    public void transitionToGreen(){

    }

}
class GreenLightState implements TrafficLightState
{
    @Override
    public void transitionToRed(){

    }
    @Override
    public void transitionToYellow(){

    }
    @Override
    public void transitionToGreen(){

    }

}
class TrafficLigthContext{
    private TrafficLightState state;
    public TrafficLigthContext(){
        this.state = new RedLightState();
    }
    public void setState(TrafficLightState newState){
        this.state = newState;
    }
    public void transitionToRed(){
        state.transitionToRed();
    }
    public void transitionToGreen(){
        state.transitionToGreen();
    }
    public void transitionToYellow(){
        state.transitionToYellow();
    }
}
class TrafficLightController{
    public static void main(String[] args) {
        TrafficLigthContext trafficLigthContext = new TrafficLigthContext();
        trafficLigthContext.transitionToGreen();
        trafficLigthContext.transitionToRed();
        trafficLigthContext.transitionToYellow();

    }
}

