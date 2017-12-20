public class HammingDistance {
    public int hammingDistance(int x, int y) {
	int test = x ^ y;
	int count = 0;
        
        while (test != 0) {
            test &= (test - 1);
            count++;
        }
        return count;
    }
}