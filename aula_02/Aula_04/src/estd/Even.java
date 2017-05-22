package estd;

public class Even {

	public int countEvens(int[] nums) {
		/*for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}*/
		int counter = 0;
		
		for (int num : nums) {
			if (num % 2 == 0){
				counter++;
				// é par
			}
		//	System.out.println(nums);
		}
		return counter;
	}
}
