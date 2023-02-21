class Car{
	
	private static int gallons = 0;
	private static int Milespergallon = 0;
	private static int distance = 0;
	private static int Total_gallons_used =  0;
	
	public void miles_driven(int miles){
		distance += miles;
		int number = 0;
		for (int i = 0; i < miles; i++){
			number += 1;
			if (number == Milespergallon){
				number = 0;
				Total_gallons_used += 1;
				gallons = gallons - 1;}
		}
		System.out.print("you have driven ");
		System.out.print(miles);
		System.out.print(" miles");
		
	
	}
	
	public void add_gas(int gas){
		gallons = gallons + gas;
		System.out.println("You have added gas to your car!");
		
		
	}
	
	public void current_distance_fuel(){
		System.out.println("");
		System.out.print("Your current distance is: ");
		System.out.print(distance);
		System.out.print(" miles");
		System.out.println("");
		System.out.print("You currently have ");
		System.out.print(gallons);
		System.out.print(" gallons");
	}
	
	public void total_gallons_used(){
		System.out.print("Your total gas usage is: ");
		System.out.print(Total_gallons_used);
		System.out.print(" gallons");
		System.out.println("");
		
	}
	
	
	
	public static void main(String[] args){
		Car newcar = new Car();
		Milespergallon = 5;
		
		System.out.println("you currently are at 5 miles per gallon.");
		
		newcar.add_gas(50);
		
		newcar.miles_driven(30);
		
		newcar.current_distance_fuel();
		System.out.println("");
		newcar.total_gallons_used();
		
		
		newcar.miles_driven(100);
		
		newcar.current_distance_fuel();
		System.out.println("");
		newcar.total_gallons_used();
		
		newcar.add_gas(34);
		
		newcar.miles_driven(150);
		
		newcar.current_distance_fuel();
		System.out.println("");
		newcar.total_gallons_used();
		
}
	}