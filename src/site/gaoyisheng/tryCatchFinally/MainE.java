package site.gaoyisheng.tryCatchFinally;

public class MainE {

	public static void main() {
		int[] no= {1,1,2,2,3,4,4};
		System.out.println(fun(no));;
	}
	
	public static int fun(int[] no) {
		int i = 1;
		int num = no[0];
		
		for(;i<no.length;i+=2) {
			if(num == no[i]) {
				num = no[i+1];
				
			}else {
				break;
			}
		}
		
		
		
		return num;
	}
}
