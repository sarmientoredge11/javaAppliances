package appliancesJava;

public class boomBoxAdapter implements adjustFunctions, powerFunctions, navFunctions{

    private boomBox bbox;

    public boomBoxAdapter(boomBox bbox){this.bbox = bbox;}

    @Override
    public String turnOff(){return bbox.boomBoxOff();}
    @Override
    public String turnOn(){return bbox.boomBoxOn();}

    @Override
    public String minusButton(){return bbox.boomboxVolDown();}
    @Override
    public String plusButton(){return bbox.boomboxVolUp();}

    @Override
    public String nextButton(){return bbox.boomboxNext();}
    @Override
    public String previousButton(){return bbox.boomboxPrevious();}

}