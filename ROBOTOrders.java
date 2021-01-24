import java.util.ArrayList;

public class ROBOTOrders {
	
	//public ArrayList <ArrayList <Integer>> orders; 
	public ArrayList<Double> check; 
	public ArrayList<Integer> orders;
	
	public ROBOTOrders() {
		this.orders=new ArrayList<Integer>();
		this.check=new ArrayList<Double>();
	}
	public ROBOTOrders( ArrayList<Double> check, ArrayList<Integer> orders) {
		this.orders=orders;
		this.check=check;
	}

	//getters

	public ArrayList<Double> getCheck(){ 
		return this.check;
	}
	public ArrayList<Integer> getOrders(){ 
		return this.orders;
	}
	//setters
	public void setCheck(ArrayList<Double> check){ 
		this.check=check;
	}
	public void setOrders(ArrayList <Integer> orders){ 
		this.orders=orders;
	}
	
	public void keepTab(CUSTOMER c, double price) { 
		double cur=check.get(c.tabNum);
		check.set(c.tabNum,cur+price);
	}
	//customer, assign their number and keep track
	public void assignTab(CUSTOMER c) { 
		check.add(0.0);
		c.tabNum=check.size()-1;
	}
	
	public void setCustToOrder(CUSTOMER c) { 
		while (c.inResturant==true) { 
			c.tabNum= getCheck().size()+1; 
			}
		}
}

