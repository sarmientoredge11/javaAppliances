package appliancesJava;

public class thermostatAdapter implements powerFunctions, adjustFunctions {

    private thermoStat tStat;

    public thermostatAdapter(thermoStat tStat){this.tStat = tStat;}


    @Override
    public String turnOff(){return tStat.tsOff();}

    @Override
    public String turnOn(){return tStat.tsOn();}

    @Override
    public String minusButton(){return tStat.tsDown();}

    @Override
    public String plusButton(){return tStat.tsUp();}



}