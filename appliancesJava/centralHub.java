package appliancesJava;

public class centralHub{

    public static void main(String[] args){

        lights light = new lights();
        thermoStat tStat = new thermoStat();
        tv tv = new tv();
        boomBox bbox = new boomBox();

        rcFunctions rcLights = new lightsAdapter(light);
        rcFunctions rcTStats = new thermostatAdapter(tStat);
        rcFunctions rcTv = new tvAdapter(tv);
        rcFunctions rcBbox = new boomBoxAdapter(bbox);


        //turn on the appliances
        System.out.println(rcLights.turnOn);
        System.out.println(rcTStats.turnOn);
        System.out.println(rcTv.turnOn);
        System.out.println(rcBbox.turnOn);
       

    }
}