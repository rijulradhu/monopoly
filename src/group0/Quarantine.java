package group0;

public class Quarantine extends Tile
{   
    boolean inQuarantine ;
    public Quarantine()
    {
        owned = false ;
        name = "Quarantine";
        this.position = 10 ;
        inQuarantine = false ;
        this.cost = 0;
        owned = true;
        mortgaged = false;
        ownable = false;
        mortgage = 0;
        owner = null;
    }
    public boolean isInQuarantine()
    {
        return inQuarantine ;
    }
    public int rent()
    {
        return 0;
    }
}
