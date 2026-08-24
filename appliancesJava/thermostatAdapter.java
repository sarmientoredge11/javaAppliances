package appliancesJava;

public class thermostatAdapter implements rcFunctions{

private thermoStat tStat;

public thermostatAdapter(thermoStat tStat){this.tStat = tStat;}


@Override
    public String turnOff(){tStat.tsOff();}

@Override
    public String turnOn(){tStat.tsOn();}
    
@Override
    public String minusButton(){tStat.tsDown();}

@Override
    public String plusButton(){tStat.tsUp();}



}