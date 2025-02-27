import java.util.*;
import java.util.stream.*;

class House{

	private int id;
	private String location;
	private double rent;

	House(int id, String location, double rent){

		this.id= id;
		this.location = location;
		this.rent = rent;

	}

	public int getId(){

		return id;
	}

	public String getLocation(){

		return location;
	}

	public double getRent(){

		return rent;
	}

}


class Main{

	public static void main(String args[]){

		ArrayList<House> l = new ArrayList<>();

		l.add(new House(101,"A1",10000));
		l.add(new House(102,"B1",15000));
		l.add(new House(101,"A1",19000));
		l.add(new House(101,"C1",20000));
		l.add(new House(101,"C1",32000));

		
		List<Double> updRent = l.stream().map(x->x.getRent()+x.getRent()*0.05).collect(Collectors.toList());

		
		System.out.println("Updated Rents are " + updRent);

	}

}