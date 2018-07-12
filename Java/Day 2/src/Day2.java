
public class Day2 {

	public static void main(String[] args) {
		String test1 = "abcdef";
		String test2 = test1
				.concat("ghijk")
				.toUpperCase()
				.concat("!!!");
		System.out.println("test1 String: " + test1);
		System.out.println("test2 String: " + test2);
		System.out.println("abc".toUpperCase());
		
		String test = "abc def ghi lll zzz tttt rrr";
		String toCut = "tttt";
		int index = test.indexOf(toCut);
		System.out.println("index: " + index);
		String result = test.substring(index, index + toCut.length());
		String resultInv = test.substring(0, index)
				+ test.substring(index, toCut.length());
		System.out.println("test: " + test.substring(0));
		System.out.println("test: " + test.substring(0, test.length()));
		System.out.println("cut example: " + result);
		System.out.println("cut example inv: " + resultInv);
		System.out.println("cut example inv with replace: " + test.replace(" zzz ", ""));

	}

}
