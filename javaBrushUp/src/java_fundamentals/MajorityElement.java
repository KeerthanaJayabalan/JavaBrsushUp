package java_fundamentals;

import java.util.HashMap;

public class MajorityElement {
	public static Integer findMajorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : nums) {
			if (map.get(num) > n / 2) {
				return num;
			}
		}

		return null; // No majority element found
	}

	public static void main(String[] args) {
		int[] nums = {2,1};
		Integer majorityElement = findMajorityElement(nums);

		if (majorityElement != null) {
			System.out.println("Majority Element: " + majorityElement);
		} else {
			System.out.println("No majority element found.");
		}
	}
}
