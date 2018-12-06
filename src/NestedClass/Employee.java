package NestedClass;

public class Employee {
	
	String name;
	Address address;
	
	protected static class Address {
		
		public String city;
		public String address;
		
		public String print(){
            return this.city + ", " + this.address;
		}
	}	
}
