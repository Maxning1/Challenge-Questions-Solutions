public class ChallengeQuestionBitwise {
    public static int equal(int x, int y){
	x = x^y;
	x = x|x >> 16;
	x = x|x >> 8;
	x = x|x >> 4;
	x = x|x >> 2;
	x = x|x >> 1;
	return x&1;
    }
    public static void main (String[] args) {
	int b = 4;
	int a = 6;
	System.out.println(equal(4,6));
    }  
}
