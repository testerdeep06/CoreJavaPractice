package CorePackage;

public class Assignment_3 {
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
	public int div(int k, int l)                         //Assign:2 ((((10-2)+2)-2)*2)/2)
	    {
		int m;
		m= k/l;
			System.out.println("Div result is: " +m);
			return m;
		}
	public static void main(String[] args) {
		Assignment_3 deep = new Assignment_3();
		int sbrslt =deep.sub(10, 2);
		int smrslt = deep.sum(sbrslt, 2);
		int sbrslt1 = deep.sub(smrslt, 2);
		int mltrslt = deep.multi(sbrslt1, 2);
		int divrslt = deep.div(mltrslt, 2);
		System.out.println("Final result is: " +divrslt);

	}
}
