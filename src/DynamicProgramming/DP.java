package DynamicProgramming;

public class DP {
	
	public DP() {
		System.out.println(fibo_dp(10));
		
		
	}
	
	public int fibo_dp(int num) {
		int[] cache = new int[num+1];
		cache[0]=0;
		cache[1]=1;
		
		for(int i=2; i<num+1; i++) {
			cache[i]= cache[i-1]+cache[i-2];
		}
		return cache[num];
	}
	
	

	
	public static void main(String[] args) {
		new DP();
	}

}