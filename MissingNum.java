public class MissingNum {
	public static int num(int[] nums) {
		int n = nums.length;
		int expectedTotal = (n * (n + 1)) / 2;  //55
		int total = 0; //51
		for (int num : nums) {
			total += num;
		}
		return expectedTotal-total;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 3, 5, 6, 2, 8, 7, 9 };
		int n=MissingNum.num(nums);
		System.out.println(n);
	}
}
