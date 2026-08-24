package appliancesJava;

public class mainCenter {

    public static void main(String[] args){

       centralHub cHub = new centralHub();

       Light light = new Light();
       boomBox bbox = new boomBox();
       tv tv = new tv();
       thermoStat thermoStat = new thermoStat();

       lightsAdapter lightsAdapter = new lightsAdapter(light);
       thermostatAdapter thermostatAdapter = new thermostatAdapter(thermoStat);
       boomBoxAdapter boomBoxAdapter = new boomBoxAdapter(bbox);
       tvAdapter tvAdapter = new tvAdapter(tv);

       //Turn on appliances
        cHub.turnOn(lightsAdapter);
        cHub.turnOn(tvAdapter);
        cHub.turnOn(boomBoxAdapter);
        cHub.turnOn(thermostatAdapter);
        System.out.println();

        //Increasingly adjust supported appliances
        cHub.plusButton(tvAdapter);
        cHub.plusButton(boomBoxAdapter);
        cHub.plusButton(thermostatAdapter);
        System.out.println();

        //Decreasingly adjust supported appliances
        cHub.minusButton(tvAdapter);
        cHub.minusButton(boomBoxAdapter);
        cHub.minusButton(thermostatAdapter);
        System.out.println();

        //Navigate to the next with supported appliances
        cHub.nextButton(tvAdapter);
        cHub.nextButton(boomBoxAdapter);
        System.out.println();

        //Navigate to the previous with supported appliances
        cHub.previousButton(tvAdapter);
        cHub.previousButton(boomBoxAdapter);
        System.out.println();

        //Turn off appliances
        cHub.turnOff(lightsAdapter);
        cHub.turnOff(tvAdapter);
        cHub.turnOff(boomBoxAdapter);
        cHub.turnOff(thermostatAdapter);
        System.out.println();
    }
}