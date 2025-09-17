package dsaclass;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n);

		System.out.println();
		System.out.println();
		
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				System.out.println(i);
				System.out.println(n/i);
			}
		}
		
		System.out.println();
		System.out.println();
		
		int m=25;
		for(int i=1; i<Math.sqrt(m); i++) {
			if(m%i==0) {
				System.out.println(i);
			}
		}
		for(int i=(int) Math.sqrt(m); i>=1; i--) {
			if(m%i==0) {
				System.out.println(m/i);
			}
		}
	}

}
