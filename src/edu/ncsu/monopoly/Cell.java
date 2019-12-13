package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player propietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	@Override
	public Player getOwner() {
		return propietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setOwner(Player owner) {
		this.propietary = owner;
	}
    
    public String toString() {
        return name;
    }
}
