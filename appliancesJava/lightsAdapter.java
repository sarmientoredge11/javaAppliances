package appliancesJava;

public class lightsAdapter implements rcFunctions{

private lights light;

public lightsAdapter(lights light){ this.light = light;}

@Override
public String turnOn(){return light.lightsOn();}

@Override
public String turnOff(){return light.lightsOff();}



}