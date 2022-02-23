package company;

public class LineItem {

    private final String name;
    private final double value;

    public LineItem(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return this.name;
    }

    public double getValue()
    {
        return this.value;
    }

    @Override
    public String toString()
    {
        return this.name + " $ " + this.getValue();
    }
}
