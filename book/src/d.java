public class d{
public static void main(String[] args){

double[] a=new double[]{1,2,3,4,5};
double[] b=new double[10];
int l=a.length,i;
if(l>10)
	{for(i=0;i<10;i++)
		b[i]=a[l*(int)Math.random()];
	for(i=0;i<10;i++)
		a[i]=b[i];
}
else
	{for(;l<10;l++)
		a[l]=Math.random();}
for(i=0;i<10;i++)
if(a[i]<0)
	a[i]=0;
else
	a[i]=a[i]*a[i];

for(i=0;i<10;i++)
System.out.println("a["+i+"]="+a[i]);
}}