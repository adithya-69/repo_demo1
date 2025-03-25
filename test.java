class test
{
public static void main(String args[])
{
int a=5;
int b=5;
int x,y;
try
{
x=(a+b)/(a-b);
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero error");
}
y=(a-b)/(a+b);
System.out.println("y="+y);
}
}