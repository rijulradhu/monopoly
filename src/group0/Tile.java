package group0;

abstract class Tile
{

    protected String name;
    protected int position;
    protected int cost;
    public boolean owned;
    protected boolean mortgaged;
    // new variable - mortgage - for getMortgageCost
    protected int mortgage;
    // new variable - ownable - for isOwnable method
    protected boolean ownable;
    // Player not implemented yet
    protected Player owner; 

    /**
	 * @return name of the Tile
	 */
    public String getName()
    {
        return name;
    }

    /**
     * @return position of the Tile
     */
    public int getPosition()
    {
        return position;
    }

    /**
     * @return true if the Tile can be owned
     */
    public boolean isOwnable()
    {
        return ownable;
    }

    /**
     * @return true if the Tile is already owned, else false
     * Tiles like community/chance, gotofreeparking, getquarantined have owned set as true.
     */
    public boolean isOwned()
    {
        return owned;
    }

    /**
     * Sets the field owned to true
     * will be called in buyProperty method of Player class
     */
    public void setOwned()
    {
        owned = true;
    }

    /**
     * @return true if Tile is mortgaged, else return false
     */
    public boolean isMortgaged()
    {
        return mortgaged;
    }

    /**
     * @return cost of the Tile
     */
    public int getCost()
    {
        return cost;
    }

    // there is no need to write purchase method here as it is already defined in player class
    // buyProperty(Tile) exists in Player class

    /**
     * @return owner of Tile
     */
    public Player getOwner()
    {
        return owner;
    }

    public void setOwner(Player player){
        owner = player;
    }

    /**
     * @return mortgage cost of the Tile
     */
    public int getMortgageCost()
    {
        return mortgage;
    }

    /**
     * rent() is an abstract function
     * It returns the rent of the Tile
     * If Tile is a Property then rent increases with respect to the number of houses
     * If Tile is a Transport then rent increases with respect to number of Transports owned
     * If Tile is a Card or Community/Chance or Quarantine or GoToParking then there is no rent
     * If Tile is Tax then rent is the value of Tax
     */
    public abstract int rent();

    public void setOwnerToNull(){
        owner = null;
        owned = false;
    }
}
