package estd;

public class bigDiff {

	public int bigDiff(int[] nums) {

		int maximo = nums[0];
		int minimo = nums[0];
		int result = 0;

		for (int i = 0; i < nums.length; i++) {

			// Minimo.
			if (minimo > nums[i]) {
				minimo = nums[i];
			}
			
			// Maximo.
			if (maximo < nums[i]) {
				maximo = nums[i];
			}

		}

		result = maximo - minimo;
		return result;

	}

}
