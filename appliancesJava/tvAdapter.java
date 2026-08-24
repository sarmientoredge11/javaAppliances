package appliancesJava;

public class tvAdapter implements powerFunctions, adjustFunctions, navFunctions{

    private tv tv;

    public tvAdapter(tv tv){this.tv = tv;}

    @Override
    public String turnOff(){return tv.tvOff();}

    @Override
    public String turnOn(){return tv.tvOn();}

    @Override
    public String minusButton(){return tv.tvVolDown();}

    @Override
    public String plusButton(){return tv.tvVolUp();}

    @Override
    public String nextButton(){return tv.tvNext();}

    @Override
    public String previousButton(){return tv.tvPrevious();}

}