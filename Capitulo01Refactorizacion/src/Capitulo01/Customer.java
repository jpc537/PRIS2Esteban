package Capitulo01;

import java.util.Vector;

public class Customer {
	private String _name;
	 private Vector _rentals = new Vector();
	 public Customer (String name){
	 _name = name;
	 };
	 public void addRental(Rental arg) {
	 _rentals.addElement(arg);
	 }
	 public String getName (){
	 return _name;
	 };
}
