package group0;

public class FoodOutlet extends Tile
{
    private int totalOwned;
    private int rent;
    public FoodOutlet(String name, int position, int cost, int rent)
    {
        this.name = name;
        this.position = position;
        this.cost = cost;
        owned = false;
        ownable = true;
        owner = null;
        this.rent = rent;
    }

    public void updateOwned()
    {
        setOwned();
        totalOwned++;
    }
    public int rent()
    {
        return 0;
    }
}

