public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] gas = {2,3,1};
		// int[] cost = {3,1,2};
		int[] gas = { 6, 1, 4, 3, 5 };
		int[] cost = { 3, 8, 2, 4, 2 };
		Solution s = new Solution();
		int index = s.canCompleteCircuit(gas, cost);
		System.out.println(index);
	}

}
