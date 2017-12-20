public class SelfDividing {
    public List<Integer> selfDividingNumbers(int left, int right) {
	List<Integer> dividingnumbers = new ArrayList<Integer>();
	for(int i = left; i <= right;i++)
	    {
		int x = i;
		for(;x > 0; x /= 10)
		    {
			if(x % 10 == 0 || i % (x % 10) != 0)
			    {
				break;
			    }
		    }
		if(x == 0)
		    {
			dividingnumbers.add(i);
		    }
	    }
        return dividingnumbers;
    }
}