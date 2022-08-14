package CorePackage;
public class Assignment_2 {
	public int sum(int a, int b)
   {
	int c;
	c= a+b;
		System.out.println("Sum result is: " +c);
		return c;
	}
public int sub(int e, int f)
    {
	int g;
	g= e-f;
		System.out.println("Sub result is: " +g);
		return g;
	}
public int multi(int h, int i)
    {
	int j;
	j= h*i;
		System.out.println("Multi result is: " +j);
		return j;
	}
public int div(int k, int l)
    {
	int m;
	m= k/l;
		System.out.println("Div result is: " +m);
		return m;
	}

	public static void main(String[] args) 
	    {
		Assignment_2 deep = new Assignment_2();
		int smrslt = deep.sum(10, 2);
		int smrsltt =deep.sum(smrslt, 2);
		int sbrslt = deep.sub(smrsltt, 2);
		int mltrslt =deep.multi(sbrslt, 2);
		int dvrslt = deep.div(mltrslt, 2);
	    System.out.println("Final result is: " +dvrslt);
		
		}
}
