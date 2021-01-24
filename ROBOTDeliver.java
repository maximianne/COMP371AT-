import java.util.ArrayList;

public class ROBOTDeliver {
	ArrayList<Integer> orders ; 
	boolean delivered; 
	boolean pickedUp; 
	
	public ROBOTDeliver() { 
		this.orders= new ArrayList<Integer>();
		this.delivered=false; 
		this.pickedUp=false; 
	}
	
	public ROBOTDeliver(ArrayList<Integer> orders,
			boolean delivered, boolean pickedUp) { 
		this.orders= orders;
		this.delivered=delivered; 
		this.pickedUp=pickedUp; 
	}
	
	//getters
	public ArrayList<Integer> getOrders(){ 
		return this.orders;
	}
	public boolean getDeliveryStatus() { 
		return this.delivered;
	}
	public boolean getPickedUp() { 
		return this.pickedUp;
	}
	
	//setters
	public void setOrders(ArrayList<Integer> orders){ 
		this.orders=orders;
	}
	public void setDeliveryStatus(boolean delivered) { 
		this.delivered=delivered;
	}
	public void setPickedUp(boolean pickedUp) { 
		this.pickedUp=pickedUp;
	}
	//methods
	//a method to get order from robot riders 
	public void getOrdersFromRO(ROBOTOrders ro) { 
		for(int i=0; i<ro.orders.size();i++) { 
			orders.add(ro.orders.get(i));
		}
	}	
	//a method to deliver plate 
	public void deliveredPlate() { 
		orders.remove(0);
	}
}