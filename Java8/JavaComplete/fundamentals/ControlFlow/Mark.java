class Mark{
public static void main(String args[]){
int marks = 40;
switch(marks){
	case 35:
		System.out.println("Pass");
		break;
	case 34:
	    System.out.println("Fail");
	case 'n':
	    System.out.println("Result not Declared");
	default :
		 System.out.println("Waiting");
	}
}
}