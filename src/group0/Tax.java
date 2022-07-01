package group0;

public class Tax extends Tile
{
    public Tax(String name, int position, int cost)
    {
        this.name = name;
        this.position = position;
        this.cost = cost;
        owned = true;
        mortgaged = false;
        ownable = false;
        owner = null;
    }

    public int rent() // same as return tax
    {
        return cost;
    }
}
