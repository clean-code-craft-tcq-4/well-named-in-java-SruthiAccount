package colorcoder;
public class Main {

 static ColorPair colorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.totalMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.totalMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    static int pairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorPair.totalMinorColors + minor.getIndex() + 1;
    }

    static void testNumberToPair(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColorPair colorPair =colorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = pairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        printColorPair();
    }
    public static void printColorPair() {
    	int index=0;
    	for(int i=0;i<ColorPair.totalMajorColors;i++)
    	{
    		for(int j=0;j<ColorPair.totalMinorColors;j++)
    		{
    			index++;
    			System.out.println(index+":"+MajorColor.fromIndex(i)+".."+MinorColor.fromIndex(j));
    		}
    	}
    }
}
