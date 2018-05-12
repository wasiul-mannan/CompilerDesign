import java.util.*;

public class problem_10 {
	public static void main(String[] args){
		char[] gram=new char[100];
		String gram1 = null;
		String[] b=new String[100];
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Line number of grammer : ");
		x=scan.nextInt();
		System.out.println("Enter grammer");
		
		String nextLine =scan.nextLine();
		for(int i=1;i<=x;i++){
			scan.hasNextLine();
			gram1 +=scan.nextLine();
			//b=gram1.split("\\n");
		}
		
	
		for(String w:b){  
		
			System.out.println(w.split("\\n"));  
	}
	
	}

}
