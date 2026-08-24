package appliancesJava;

public class centralHub{

    public static void main(String[] args){

        Light light = new Light();
        thermoStat tStat = new thermoStat();
        tv tv = new tv();
        boomBox bbox = new boomBox();

        powerFunctions pfLight = new lightsAdapter(light);
        powerFunctions pfTStat = new thermostatAdapter(tStat);
        powerFunctions pfTv = new tvAdapter(tv);
        powerFunctions pfBoomBox = new boomBoxAdapter(bbox);

        minpluFunctions mpTStat = new thermostatAdapter(tStat);
        minpluFunctions mpTv = new tvAdapter(tv);
        minpluFunctions mpBoomBox = new boomBoxAdapter(bbox);

        prvnxtFunctions pnTv = new tvAdapter(tv);
        prvnxtFunctions pnBoomBox = new boomBoxAdapter(bbox);


        //turn on the appliances
        System.out.println(pfLight.turnOn());
        System.out.println(pfTStat.turnOn());
        System.out.println(pfTv.turnOn());
        System.out.println(pfBoomBox.turnOn());
        System.out.println("\n");

        //increase temperature of thermostat and volumes of tv and boombox
        System.out.println(mpTStat.plusButton());
        System.out.println(mpTv.plusButton());
        System.out.println(mpBoomBox.plusButton());
        System.out.println("\n");

        //decrease temperature of thermostat and volumes of tv and boombox
        System.out.println(mpTStat.minusButton());
        System.out.println(mpTv.minusButton());
        System.out.println(mpBoomBox.minusButton());
        System.out.println("\n");


        //next channel for tv and next music for boombox
        System.out.println(pnTv.nextButton());
        System.out.println(pnBoomBox.nextButton());
        System.out.println("\n");

        //previous channel for tv and previous music for boombox
        System.out.println(pnTv.previousButton());
        System.out.println(pnBoomBox.previousButton());
        System.out.println("\n");

        //turn off the appliances
        System.out.println(pfLight.turnOff());
        System.out.println(pfTStat.turnOff());
        System.out.println(pfTv.turnOff());
        System.out.println(pfBoomBox.turnOff());
        System.out.println("\n");

    }
}