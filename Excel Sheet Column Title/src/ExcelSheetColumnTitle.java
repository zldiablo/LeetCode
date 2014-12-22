public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		Solution s = new Solution();

		for (int i = 1; i < 256; i++) {
			System.out.println(s.convertToTitle(i));
		}

	}

}
