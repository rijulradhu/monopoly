package group0;

public class Start extends Tile{
    public Start(){
        this.name = "Start";
        position = 0;
        cost = 0;
        owned = true;
        mortgaged = false;
        ownable = false;
        mortgage = 0;
        owner = null;
    }
    @Override
    public int rent() {
        return 0;
    }
}
