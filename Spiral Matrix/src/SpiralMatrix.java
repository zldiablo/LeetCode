import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] t = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		Solution s = new Solution();
		List<Integer> result = s.spiralOrder(t);
		System.out.println(result);
		
		int[][] t2 = { { 3 }, { 2 } };
		List<Integer> result2 = s.spiralOrder(t2);
		System.out.println(result2);
	}

}
