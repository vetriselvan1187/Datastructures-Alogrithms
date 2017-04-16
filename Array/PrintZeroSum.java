

public class PrintZeroSum {

	public static void main(String args[]) {
		PrintZeroSum zeroSum = new PrintZeroSum();
		int[] array = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		zeroSum.printAllSubArray(array);
	}

	void printAllSubArray(int[] array) {
		int n = array.length;
		for(int i=0; i < n; i++) {
			int sum = 0;
			for(int j=i; j < n; j++) {
				sum += array[j];
				if(sum == 0) {
					System.out.println("ZeroSum range ["+i+".."+j+"]");
				}
			}
		}

	}
}
