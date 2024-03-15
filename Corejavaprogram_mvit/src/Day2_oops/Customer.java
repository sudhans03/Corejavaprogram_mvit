//program to demonstrate the customer entity
package Day2_oops;

public class Customer {
	private int cid;
	private String cname;
	private String address;
	//default constructor
	public Customer() {
		this.cid=02;
		this.cname="unknown";
		this.address="somewhere";
	
	}
	public Customer(int cid,String cname,String address){
		this.cid=cid;
		this.cname="cname";
		this.address="adderss";
		
	}
	
	//getter and setter
	public void setcid(int cid){
		this.cid=cid;
		
	}
	
	public int getcid() {
		return cid;
	}
     	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}	

}
