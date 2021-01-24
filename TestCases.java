import java.util.ArrayList;

public class TestCases {
	/**
	 * Design a restaurant where there are robots that take orders from incoming customers, 
	 * deliver orders to the chef. Robots also bring back the food and are tasked with keeping
	 *  a tab and generating checks. Your solution should be written in Java. 
	 */

	public static void main(String []args) { 
		//menu 
		int order1=1; 
		int order2=2;
		int order3=3;
		double one = 21.54;
		double two = 22.54; 
		double three= 6.70; 
		
		RESTURANT r= new RESTURANT();
		ROBOTOrders ro= new ROBOTOrders();
		ROBOTDeliver rd= new ROBOTDeliver();
		CHEF chef= new CHEF();
		
		CUSTOMER c= new CUSTOMER();
		CUSTOMER c2= new CUSTOMER();
		CUSTOMER c3= new CUSTOMER();
		
		ro.assignTab(c);
		c.placeOrder(c,order1,ro);
		ro.keepTab(c,one);
		
		ro.assignTab(c2);
		c.placeOrder(c2,order2,ro);	
		ro.keepTab(c2,two);
		
		ro.assignTab(c3);
		c.placeOrder(c3,order3,ro);
		ro.keepTab(c3,three);
		
		rd.getOrdersFromRO(ro);
		
		System.out.println(ro.orders); //1,2,3 
		System.out.println(ro.check); 
		
		System.out.println(rd.orders); //1,2,3 
		rd.deliveredPlate();
		System.out.println(rd.orders);
		
		c3.callForCheck(c3, ro);
		c.callForCheck(c, ro);
		
		c.PAID(c3, r, ro);
		System.out.println(ro.orders); //2,3 
		System.out.println(ro.check); 
		

		
		
		
		
	}
}
