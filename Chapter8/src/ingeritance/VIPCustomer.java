package ingeritance;

public class VIPCustomer extends Customer{
	
	 private int agentID;
	 double salesRatio;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1; 
	// System.out.println("VIPCustomer(int, String) ȣ��");	
	}	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,  customerName);
	 	customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1; 
		this.agentID = agentID;
	// stem.out.println("VIPCustomer(int, String) ȣ��");	
	}
	
	public int calPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price * salesRatio);
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
	
