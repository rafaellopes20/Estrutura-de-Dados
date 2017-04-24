package estd;

public class Q1 {

	public boolean q1(int nums[]) {
		boolean result = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				result = true;
				if (nums[i] == nums[nums.length - 1]) {
					result = false;
				}
			}

		}

		return result;
	}

}
