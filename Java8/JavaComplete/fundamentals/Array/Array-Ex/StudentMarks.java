class StudentMarks{
public static void main(String []a){
int[] marks = {35,36,37,38,39,40};
	int total_Marks = 0;
	for(int i=0; i<=marks.length-1; i=i+1){
		total_Marks = total_Marks + marks[i];
	}
System.out.println(total_Marks);
}
}