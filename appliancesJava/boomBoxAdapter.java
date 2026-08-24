package appliancesJava;

public class boomBoxAdapter implements rcFunctions{

private boomBox bbox;

public boomBoxAdapter(boomBox bbox){this.bbox = bbox;}

@Override
    public String turnOff(){bbox.boomBoxOff();}
@Override
    public String turnOn(){bbox.boomBoxOn();}

@Override
    public String minusButton(){bbox.boomboxVolDown();}
@Override
    public String plusButton(){bbox.boomboxVolUp();}

@Override
    public String nextButton(){bbox.boomboxNext();}
@Override
    public String previousButton(){bbox.boomboxPrevious();}

}