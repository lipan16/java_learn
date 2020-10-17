class niudun{
public static double f(double x){
return (x*x*x-7.6*x*x+19.2*2-15.4);}
public static double fd(double x){
return (3*x*x-15.2*x+19.2);}
public static void main(String[] args){
double x0=1.0;
while(Math.abs(f(x0))>=0.0001){
x0=x0-f(x0)/fd(x0);}
System.out.println("x="+x0);
System.out.println("f(x)="+f(x0));
}}