import java.util.ArrayList;

public class CHEF {
	public ArrayList<Integer> orders; 
	public boolean atCapacity; 
	public boolean doneWithOrder; 
	public int max=3;
	
	public CHEF() { 
		this.orders= new ArrayList<Integer>();
		this.atCapacity=false; 
		this.doneWithOrder=false; 
	}
	
	public CHEF(ArrayList<Integer> orders,boolean atCapacity, 
	boolean doneWithOrder) { 
		this.orders= orders;
		this.atCapacity=atCapacity; 
		this.doneWithOrder=doneWithOrder; 
	}
	
	//getters
	public ArrayList<Integer> getOrders(){ 
		return this.orders;
	}
	public boolean getAtCapacity() { 
		return this.atCapacity;
	}
	public boolean getDoneWithOrder() { 
		return this.doneWithOrder;
	}
	
	//setters
	public void setOrders(ArrayList<Integer> orders){ 
		this.orders=orders;
	}
	public void setAtCapacity(boolean atCapacity) { 
		this.atCapacity=atCapacity;
	}
	public void setDoneWithOrder(boolean doneWithOrder) { 
		this.doneWithOrder=doneWithOrder;
	}
	
	//method that takes the orders from the robot orders 
	//and adds them all into a single array list 
	public void getOrdersRD(ROBOTDeliver rd) { 
		for(int i=0; i<rd.orders.size();i++) { 
			orders.add(rd.orders.get(i));
		}
	}
	//once it is done, call robot delivery to take to table 
	public void finished() { 
		orders.remove(0);
	}
}
