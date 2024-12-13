package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static boolean sum(int num){
        int sum = 0;
        for (int k = 1; sum < num; k++){
            sum = sum + k;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSquare(int num) {
        return isPerfectSquare(num) && sum(num);
    }

    public static void findSpecialSquares(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            if (isSpecialSquare(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
	
}
