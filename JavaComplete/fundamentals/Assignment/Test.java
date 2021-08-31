class Test{
public static void main(String[] args){
		for(int i=0; i<=args.length -1; i++){
		if(Integer.parseInt(args[i]) % 2 == 0){
			System.out.println(args[i]);
		}
	}
}
}