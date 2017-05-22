package estd;

public class Q4 {

	public boolean verifica(int[] nums) {
		
		int ultimo = nums.length - 1;
		
		
		if (nums[0] == 5 || nums[ultimo] == 5) {
			return true;
		} else {
			return false;
		}
	}

}
