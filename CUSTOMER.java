
public class CUSTOMER {
	public boolean callRobot; 
	public double orderNum; 
	public boolean inResturant; 
	public boolean finishedEating; 
	public int tabNum;
	
	public CUSTOMER () { 
		this.callRobot= true; 
		this.orderNum= 0;
		this.finishedEating=false;
		this.inResturant=true;
		this.tabNum=0;
	}
	public CUSTOMER(boolean callRobot, double orderNum, 
			boolean inResturant, boolean finishedEating, int tabNum) {
		this.callRobot= callRobot; 
		this.orderNum = orderNum; 
		this.inResturant= inResturant; 
		this.finishedEating= finishedEating; 
		this.tabNum=tabNum;
	}
	//getter
	public boolean getCallRobot() { 
		return this.callRobot;
	}
	public double getOrderNum() { 
		return this.orderNum;
	}
	public boolean getInResturant() { 
		return this.inResturant;
	}
	public boolean getFinishedEating() { 
		return this.finishedEating;
	}
	public int getTabNum() { 
		return this.tabNum;
	}

	//setter
	public void setCallRobot(boolean callRobot) { 
		this.callRobot=callRobot;
	}
	public void setOrderNum(double orderNum) { 
		this.orderNum= orderNum;
	}
	public void setInResturant(boolean inResturant) { 
		this.inResturant= inResturant;
	}
	public void setFinishedEating(boolean finishedEating) { 
		this.finishedEating= finishedEating;
	}
	public void setTabNum(int tabNum) { 
		this.tabNum=tabNum;
	}
	//methods
	public void placeOrder(CUSTOMER c, int order, ROBOTOrders ro) { 
		ro.orders.add(order);
	}
	//call robot to get their check 
	public void callForCheck(CUSTOMER c, ROBOTOrders ro) { 
		System.out.println("Your Total is:" + ro.check.get(c.tabNum));
	}
	//once they've paid, leave and clear 
	public void PAID(CUSTOMER c, RESTURANT r, ROBOTOrders ro) { 
		r.available+= 1;
		ro.check.remove(c.tabNum);
		ro.orders.remove(c.tabNum);
	}
}
