import java.util.*;


public class Triangle {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(6);
		l3.add(5);
		l3.add(7);
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(4);
		l4.add(1);
		l4.add(8);
		l4.add(3);
		
		List<List<Integer>> request = new ArrayList<List<Integer>>();
		request.add(l1);
		request.add(l2);
		request.add(l3);
		request.add(l4);
		
		Solution s = new Solution();
		int r = s.minimumTotal(request);
		System.out.println(r);
		
		List<Integer> l11 = new ArrayList<Integer>();
		l11.add(1);
		List<Integer> l21 = new ArrayList<Integer>();
		l21.add(-5);
		l21.add(-2);
		List<Integer> l31 = new ArrayList<Integer>();
		l31.add(3);
		l31.add(6);
		l31.add(1);
		List<Integer> l41 = new ArrayList<Integer>();
		l41.add(-1);
		l41.add(2);
		l41.add(4);
		l41.add(-3);
		
		List<List<Integer>> request1 = new ArrayList<List<Integer>>();
		request1.add(l11);
		request1.add(l21);
		request1.add(l31);
		request1.add(l41);
		
		int r1 = s.minimumTotal(request1);
		System.out.println(r1);
	}

}
