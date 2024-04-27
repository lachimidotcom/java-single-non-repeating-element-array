public class SecondLargest{
	public static void main(String[] args){
		int[] arr = {1,8,3,6,5,4,7,2,9};
		int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
		
		for(int i: arr){
			if(i > first){
				second = first;
				first = i;
			}else if(i > second && i < first){
				second = i;
			}
		}
		
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
	}
}