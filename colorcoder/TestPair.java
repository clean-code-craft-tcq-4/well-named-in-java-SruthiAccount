package colorcoder;
public class TestPair {
	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = colorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = pairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

	static ColorPair colorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.totalMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.totalMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int pairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorPair.totalMinorColors + minor.getIndex() + 1;
	}
}
