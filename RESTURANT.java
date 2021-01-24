
public class RESTURANT {
	public boolean atCapacity; 
	public int available; 
	public int chef;
	public int currentNum; 
	public int robotsD; 
	public int robotsO;
	
	public RESTURANT() {
		this.atCapacity=false;
		this.available=15;
		this.currentNum=0;
	}
	public RESTURANT(boolean atCapacity, int available, int currentNum) {
		this.atCapacity=atCapacity;
		this.available=available;
		this.currentNum=currentNum;
	}
	
	//getters 
	public int getCapacity() { 
		return this.getCapacity();
	}
	public int getAvailable() { 
		return this.available;
	}
	public int getCurrentNum() { 
		return this.currentNum;
	}

	//setters
	public void setCapacity(boolean atCapacity) { 
		this.atCapacity=atCapacity;
	}
	public void setAvailable(int available) { 
		this.available=available;
	}
	public void setCurrentNum(int currentNum) { 
		this.currentNum=currentNum;
	}
	//methods 
	public boolean hasTableFor(int n) { 
		if(atCapacity==false && this.available-n>0) { 
			return true;
		}
		else { 
			return false;
		}
	}	
}
