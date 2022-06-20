package colorcoder;

public class Main {

	public static void main(String[] args) {
		TestPair.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		TestPair.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		TestPair.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		TestPair.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		printColorPair();
	}

	public static void printColorPair() {
		int index = 0;
		for (int i = 0; i < ColorPair.totalMajorColors; i++) {
			for (int j = 0; j < ColorPair.totalMinorColors; j++) {
				index++;
				System.out.println(index + ":" + MajorColor.fromIndex(i) + ".." + MinorColor.fromIndex(j));
			}
		}
	}
}
