

public class KadaneAlgorithm {

	public static void main(String args[]) {
		KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(kadaneAlgorithm.subArraySum(array));
		kadaneAlgorithm.maxSubArray(array);

	}

	int subArraySum(int[] array) {
		int max_ending = 0;
		int max_so_far = Integer.MIN_VALUE;

		for(int i=0; i < array.length; i++) {
			max_ending = max_ending + array[i];
			if(max_ending < 0) {
				max_ending = 0;
			}
			if(max_so_far < max_ending) {
				max_so_far = max_ending;
			}
		}
		return max_so_far;
	}

	void maxSubArray(int[] array) {
		int max_ending = 0;
		int max_so_far = 0;
		int start = 0, end = 0, s = 0;

		for(int i=0; i < array.length; i++) {
			max_ending = max_ending + array[i];
			if(max_ending < 0) {
				max_ending = 0;
				s = i + 1;
			}
			if(max_so_far < max_ending) {
				max_so_far = max_ending;
				start = s;
				end = i;
			}
		}
		for(int i = start; i <= end ; i++) {
			System.out.print(array[i]+" ");
		}
	}
}

