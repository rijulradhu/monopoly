package group0;

import java.util.ArrayList;

public class Player {

	private int id;
	private int turns;
	private String name;
	private int money;
	private int position;
	private int numOfJailFree;  
	private boolean inQuarantine;
	private boolean isBankrupt;
	private boolean didPassGo;
	private int countJail;
	private ArrayList <Tile> properties;  // Add parameter <Tile>

	public Player(String name){
		this.name = name;
		this.money = 1500;
		this.position = 0;
		this.numOfJailFree = 0;
		this.inQuarantine = false;
		this.isBankrupt = false;
		properties = new ArrayList<>();
		turns = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPosition() {
		return position;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getNumOfJailFree() {
		return numOfJailFree;
	}

	public int getTurns(){
		return turns;
	}

	public void setTurns(){
		turns++;
	}

	public boolean isDidPassGo(){
		return didPassGo;
	}

	public int getCountJail(){
		return countJail;
	}

	public void setCountJail(int inc){
		countJail+= inc;
	};

	public void setNotInJail(){
		countJail = 0;
	}

	public void notPassGo(){
		didPassGo = false;
	}

	public void setDidPassGo(){
		didPassGo = true;
	}
	
	public boolean getInQuarantine() {
		return inQuarantine;
	}
	
	public void addMoney(int update ) {
		this.money = this.money + update;
	}
	
	public void substractMoney(int update ) {
		this.money = this.money - update;
	}
	
	public void move(int noOfPlaces) {
		this.position = this.position + noOfPlaces;
		if(this.position >= 40){
			this.position = this.position - 40;
			this.addMoney(200);
			didPassGo = true;
		}
	}
	
	public void moveto(int new_position) {
		this.position = new_position;
		if(this.position == 40){
			this.position = 0;
			this.addMoney(200);
			didPassGo = true;
		}
	}
	
	// We couldn't figure out how to code in buy and sell property
	
	public void toQuarantine() {
		this.inQuarantine = true;              // check this
	}

	public void leaveQuarantine() {
		this.inQuarantine = false;              // check this
	}
	
	public void addHostelFreeCard() {
		this.numOfJailFree = this.numOfJailFree + 1;
	}
	
	public void useHostelFreeCard() {
		if(this.numOfJailFree > 0 )
			this.numOfJailFree = this.numOfJailFree - 1;
			this.inQuarantine = false;
	}
	
	public int getTotalValue() {
		int total = this.money;
		for(Tile prop: properties){
			total += prop.getCost();
		}
		total += numOfJailFree + 10*properties.size();
		return total;
	}

	
	public boolean getIsBankrupt() {
		return isBankrupt;
	}
	
	public void setBankrupt() {
		this.isBankrupt = true;
	}

	public void buyProperty(Tile property) {
		if (property.isOwnable() && !property.isOwned() && (this.money > property.cost)) {
			this.substractMoney(property.cost);
			properties.add(property);

			property.setOwned();
			property.owner = this;
			} else {
				property.owner = null;
			}
		}

	public void sellProperty(Tile property, Player buyer)
	{
		if(this.properties.contains(property) && (buyer.money > property.cost))
		{

			this.addMoney(property.cost);
			this.properties.remove(property);

			buyer.substractMoney(property.cost);
			buyer.properties.add(property);
			property.owner = buyer;
		}
	}



	public ArrayList<Tile> getProperties(){
		return properties;
	}
	
}
