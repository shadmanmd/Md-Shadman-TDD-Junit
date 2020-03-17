import java.util.Scanner;

class RemoveA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		int i;
		if(s.charAt(0)=='A') {
			if(s.charAt(1)=='A') {
				for(i=2; i<s.length(); i++)
					res+=s.charAt(i);
			}
			else {
				for(i=1; i<s.length(); i++)
					res+=s.charAt(i);
			}
		}
		else if(s.charAt(1)=='A') {
			res+=s.charAt(0);
			for(i=2; i<s.length(); i++)
					res+=s.charAt(i);
		}
		else
			res=s;
		System.out.println(res);
	}
}