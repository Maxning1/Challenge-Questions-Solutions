import hsa.*;
public class ChallengeQuestionBallBounce {
    public static int reflectionAngle(int i, int s) {
	int r = 0;
	i = i % 360;
	if (s == 0 || s == 2) {
	    r = 360 - i;
	}
	else if (s == 1 || s == 3) {
	    r = (540 - i) % 360;
	}
	else {
	    System.out.println("invalid surface");
	    r = -1;
	}
	return r;
    }
    public static int fastRA(int i, int s) {
	int r  = ((180 * s - i) + 360) % 360;
	return r;
    }
    public static void main (String[] args) {
	int i = Stdin.readInt();
	int s = Stdin.readInt();
	System.out.println(fastRA(i,s));
    }
}
