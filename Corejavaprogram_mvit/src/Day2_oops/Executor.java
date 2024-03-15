//Driver program for the customer entity class
package Day2_oops;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Customer c1=new Customer();
	c1.setcid(112);
	c1.setCname("sudhan");
	c1.setAddress("puducherry");
	
	System.out.println("Customer id:"+c1.getcid()+" Customer name:"+c1.getCname()+"Customer Address:"+c1.getAddress());
	
	Customer c2=new Customer();
	c2.setcid(112);
	c2.setCname("sudhan");
	c2.setAddress("puducherry");
	System.out.println(c2);//calling the tostring method
	
	Customer c3=new Customer();//invoke explict defalut constructor
	System.out.println(c3);
	Customer c4=new Customer(114,"divya","chennai");//invoke parameterized constructor
	System.out.print(c4);
	
   }

}
