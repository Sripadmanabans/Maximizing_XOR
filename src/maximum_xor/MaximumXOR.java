package maximum_xor;

import java.util.Scanner;

public class MaximumXOR 
{
	public static int maxXor(int l, int r) 
	{
		int res = l^r;
		for(int i = l; i < r; i++)
		{
			for(int j = i; j < r; j++)
			{
				if(res < (i^j))
				{
					res = i^j;
				}
			}
		}
		return res;
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int l, r;
		l = Integer.parseInt(sr.nextLine());
		r = Integer.parseInt(sr.nextLine());
		int res = maxXor(l,r);
		System.out.println(res);
		sr.close();
	}
	
	
}
