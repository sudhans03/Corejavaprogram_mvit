package singleinheritance;

public class Citizen {

		//program to demonstrate citizen super class
		
			private int cid;
			private String name;
			private int age;
			public Citizen() 
			
			{
				System.out.println("citizen object created");
				
			}
			public Citizen(int cid,String name,int age){
				this.cid=cid;
				this.age=age;
				this.name=name;
			}
			@Override
			public String toString() {
				return "Citizen [cid=" + cid + ", name=" + name + ", age=" + age + "]";
			}
			public int getCid() {
				return cid;
			}
			public void setCid(int cid) {
				this.cid = cid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}


	}

