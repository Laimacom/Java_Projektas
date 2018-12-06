package NestedClass;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.name = "Petras";
		employee1.address = new Employee.Address();
		employee1.address.city = "Kaunas";
		employee1.address.address = "Geliu g. 5";
		System.out.println(employee1.name + " " + employee1.address.print());
		Employee employee2 = new Employee();
		employee2.name = "Jonas";
		employee2.address = new Employee.Address();
		employee2.address.city = "Kaunas";
		employee2.address.address = "Sodu g. 6";
		System.out.println(employee2.name + " " + employee2.address.print());
		Employee employee3 = new Employee();
		employee3.name = "Kazys";
		employee3.address = new Employee.Address();
		employee3.address.city = "Vilnius";
		employee3.address.address = "Geliu g. 5";
		System.out.println(employee3.name + " " + employee3.address.print());
		
		List<Employee> listCity = new ArrayList<Employee>();
		listCity.add(0, employee1);
		listCity.add(1, employee2);
		listCity.add(2, employee3);
		System.out.println(listCity);
		
	}
}
