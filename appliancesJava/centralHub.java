package appliancesJava;

public class centralHub {

    public void turnOn(powerFunctions device){
        System.out.println(device.turnOn());
    }

    public void turnOff(powerFunctions device){
        System.out.println(device.turnOff());
    }

    public void plusButton(adjustFunctions device){
        System.out.println(device.plusButton());
    }

    public void minusButton(adjustFunctions device){
        System.out.println(device.minusButton());
    }

    public void nextButton(navFunctions device){
        System.out.println(device.nextButton());
    }

    public void previousButton(navFunctions device){
        System.out.println(device.previousButton());
    }
}
