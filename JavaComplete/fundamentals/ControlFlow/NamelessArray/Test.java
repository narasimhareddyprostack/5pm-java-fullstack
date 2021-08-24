class Test{
	public static void main(String args[]){
	System.out.println("I am in main method");
	getOrder(new int[10]{35,36,37});
	}
	public static void getOrder(int[] x){
	System.out.println("Calculating Marks: " + (x[0]+x[1]));
	System.out.println(x.length);
	
	}
}

/*
Array Declaration
Array Creation
Array Initilization

Ananoumous Array/ Nameless Array - instance use.
Note: Array creation and initilization not possible
*/