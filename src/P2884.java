import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(0<=h && h<=23 && 0<=m && m<=59) {
			if(0<h && m<45)
				System.out.println((h-1) +" "+ (m+15));
			else if(0==h && m<45)
				System.out.println((h+23) +" "+ (m+15));
			else if(0<h && 45<m)
				System.out.println((h) +" "+ (m-45));
			else
				System.out.println((h) + " " + (m-45));
		}

	}

}