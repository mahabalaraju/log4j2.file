package generalqueries;

public class sumofarray {

	public int[] runningarray(int[] num ) {
		int []results=new int[num.length-1];
		results[0]=num[0];
		
		for(int i=1;i<num.length-1;i++) {
		
			results[i]=num[i]+results[i-1];
			
		}
		return results;
		
	}
	public static void main(String[] args) {
		sumofarray a=new sumofarray();
		int num[]= {1,1,1,1,1,11};
		System.out.println(a.runningarray(num));

}
}