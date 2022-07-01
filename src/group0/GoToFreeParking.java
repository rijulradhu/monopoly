package group0;

public class GoToFreeParking extends Tile
{
    public GoToFreeParking(String name, int position)
    {
        this.name = name;
        this.position = position;
        cost = 0;
        owned = true;
        mortgaged = false;
        ownable = false;
        mortgage = 0;
        owner = null;
    }   
    
    public int rent()
    {
        return 0;
    }
}
