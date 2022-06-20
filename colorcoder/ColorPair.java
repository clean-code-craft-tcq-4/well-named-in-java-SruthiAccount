package colorcoder;

public class ColorPair {
	final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
	final static int totalMajorColors = MajorColorNames.length;
	final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
	final static int totalMinorColors = MinorColorNames.length;
	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	String ToString() {
		String colorPairStr = MajorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += MinorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}

}
