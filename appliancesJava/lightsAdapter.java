package appliancesJava;

public class lightsAdapter implements powerFunctions{

    private final Light light;

    public lightsAdapter(Light light){ this.light = light;}

    @Override
    public String turnOn(){return light.lightsOn();}

    @Override
    public String turnOff(){return light.lightsOff();}



}