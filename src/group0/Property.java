package group0;

public class Property extends Tile
{
    /**
     * constructor for the Property class which creates a property
     */
    private int rent;
    private int groupRent;
    private final String group ;
    public Property(String name , int position , int cost, int rent , String group)
    {
        this.position = position ;
        this.cost = cost ;
        this.name = name ;
        this.group = group ;
        this.rent = rent ;
        owned = false ;
        ownable = true;
        owner = null ;
    }
    public int rent()
    {
        return rent ;
    }

    public String getGroup(){
        return group;
    }
}
