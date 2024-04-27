// Write a Java program to find the element that appears only once in an array where every other element appears twice
public class SingleNonRepeatingElementArray{
	public static int findSingleXor(int[] givenArr){
		int uniqueElement = 0;
		for(int i: givenArr){
			uniqueElement ^= i;
		}
		
		return uniqueElement;
	}
	
	public static int findSingle(int[] givenArr){
		for(int i=0; i<givenArr.length; i++){
			boolean isUnique = true;
			for(int j=0; j<givenArr.length; j++){
				if(i != j && givenArr[i] == givenArr[j]){
					isUnique = false;
					break;
				}
			}
			if(isUnique){
				return givenArr[i];
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,3,2,1,5,4,5};
		System.out.println("Single Element is: " + findSingleBrute(arr));
		System.out.println("Single Element is: " + findSingleXor(arr));
	}
}