class xiti2_13 
{
	public static void main(String[] args) 
	{
	    double a[]=new double[100],sum=0.0;
        a[0]=100;sum=a[0];
        for(int i=1;i<10;i++){
           a[i]=a[i-1]/2.0;
           sum+=a[i];
        }
        System.out.print("sum="+sum);      
	}
}
