package group0;

public class Utility extends Tile
{
    private int utilities_owned;

    public Utility(String name, int position, int cost)
    {
        this.name = name;
        this. position = position;
        this.cost = cost;
        owner = null;
        owned = false;
        ownable = true;
        mortgaged = false;
    }

    public void setUtilitiesOwned() // It will get called when one player buys a utility
    {
        utilities_owned ++;
    }

    public int rent()
    {
        if (utilities_owned == 1)
        {
            return 4; // * value of dice rolled
        } 
        else if (utilities_owned == 2)
        {
            return 10; // * value of dice rolled
        }
        else 
        {
            return 0;
        }
    }
}
