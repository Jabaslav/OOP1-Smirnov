class MyFirstClass 
{
public static void main(String[] s) {
MySecondClass o = new MySecondClass(10, 9);
System.out.println(o.sum());
for (int i = 1; i <= 8; i++) {
	for (int j = 1; j <= 8; j++) {
		o.setArg1(i);
		o.setArg2(j);
		System.out.print(o.sum());
		System.out.print(" ");
	}
	System.out.println();
}

}

class MySecondClass
{
private int arg1;
private int arg2;

MySecondClass(int a1, int a2)
{
arg1 = a1;
arg2 = a2;
}

public void setArg1(int n)
{
arg1 = n;
}

public void setArg2(int n)
{
arg2 = n;
}

public int getArg1()
{
return(arg1);
}

public int getArg2()
{
return(arg2);
}

public int sum()
{
return(arg1+arg2);
}

}

