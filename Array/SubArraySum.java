

public class SubArraySum {

	public static void main(String args[]) {
		SubArraySum arraySum = new SubArraySum();
		int[] array = {10, 2, -2, -20, 10};
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int sum = Integer.parseInt(args[0]);
		int n = array.length;
		arraySum.subArraySum(array, n, sum);
	}

	void subArraySum(int[] array, int n, int sum) {
		int currSum = 0;
		int start =  0;
		for(int i=0; i <= arrA.length; i++) {
			while(currSum > sum) {
				currSum = currSum - arrA[start++];
			}
			if(currSum == sum) {
				System.out.println(Sum+" is found between indexes "+start+);
	}
}

