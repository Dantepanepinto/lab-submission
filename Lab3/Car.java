class Car{
	
	private double gallons = 0;
	private double Milespergallon = 0;
	private double distance = 0;
	private double Total_gallons_used =  0;
	
	public void miles_driven(int miles){
		distance += miles;
		public int number = 0;
		while(number < miles){
			number += 1;
			if (miles = Milespergallon){
				number = 0;
				Total_gallons_used += 1;
				gallons = gallons - 1;}
		System.out.print("you have driven ");
		System.out.print(miles);
		system.out.print(" miles");
		
	}
	
	public void add_gas(int gas){
		gallons = gallons + gas;
		
		
	}
	
	public void current_distance_fuel(){
		System.out.print("Your current distance is: ");
		System.out.print(distance);
		System.out.print("/n");
		System.out.print("You currently have");
		System.out.print(gallons);
		System.out.print(" gallons");
	}
	
	public void total_gallons_used(){
		System.out.print("Your total gas usage is: ");
		System.out.print(Total_gallons_used);
		
	}
	
	
	
	public static void main(){
		Car newcar = new Car()
		Milespergallon = 5;
		System.out.println("you currently are at 5 miles per gallon.");
		newcar.add_gas(50);
		
		newcar.miles_driven(30);
		
		
}