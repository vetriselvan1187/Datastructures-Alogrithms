

public class ReArrangeArray {

	public static void main(String args[]) {
		ReArrangeArray arrayOrder  = new ReArrangeArray();
		int[] array = {9, 6, 8, 3, 7};
		arrayOrder.reArrange(array);
		for(int i=0; i < array.length ; i++) {
			System.out.print(array[i]+" ");
		
		}
	}

	void reArrange(int[] array) {
		int n = array.length;
		for(int i=1; i < array.length; i+= 2) {
			if(array[i-1] > array[i]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
			if(i+1 < n && array[i+1] > array[i]) {
				int temp = array[i+1];
				array[i+1] =  array[i];
				array[i] = temp;
			}
		}
	}
}
