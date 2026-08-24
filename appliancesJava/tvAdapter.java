package appliancesJava;

public class tvAdapter implements rcFunctions{

    private tv tv;

    public tvAdapter(tv tv){this.tv = tv;}

    @Override
    public String turnOff(){tv.tvOff();}

    @Override
    public String turnOn(){tv.tvOn();}

    @Override
    public String minusButton(){tv.tvVolDown();}

    @Override
    public String plusButton(){tv.tvVolUp();}

    @Override
    public String nextButton(){tv.tvNext();}

    @Override
    public String previousButton(){tv.tvPrevious();}

}