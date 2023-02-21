class Point{

	private double x,y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void translate(double first, double second){
		this.x = this.x + first;
		this.y = this.y + second;
	}
	
	public void scale(double number){
		this.x = this.x * number;
		this.y = this.y * number;
	}
	
	
	public void prettyPrint(){
	System.out.println("This is your curretnt point: (" + x + "," + y + ")");
	}
	
	
	public static void main(String[] args){
		System.out.println("instance1");
		Point first = new Point(1,3);
		first.translate(6,3);
		first.scale(2);
		first.prettyPrint();
		
		
		
		System.out.println("instance2");
		Point second = new Point(3,36);
		second.translate(14,7);
		second.scale(.1);
		second.prettyPrint();
		
		
		
		System.out.println("instance3");
		Point third = new Point(16,13);
		third.translate(63,13);
		third.scale(5);
		third.prettyPrint();
		
		
		System.out.println("instance4");
		Point fourth = new Point(4,2);
		fourth.translate(6,8);
		fourth.scale(10);
		fourth.prettyPrint();
}	
}