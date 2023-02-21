class Point{

	private final double x,y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void translate(double first, double second){
		this.x = x + first;
		this.y = y + second;
	}
	
	public void scale(double number){
		x = x / number;
		y = y / number;
	}
	
	
	public void prettyPrint(){
	System.out.println("This is your curretnt point: (" + x + "," + y + ")");
	}
	
	
	public void main(){
		
		Point first = new Point(1,3);
		first.translate(6,3);
		first.scale(.2);
		first.prettyPoint();
}	
}