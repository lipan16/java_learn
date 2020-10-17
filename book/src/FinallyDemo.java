class FinallyDemo {
int no1,no2;
FinallyDemo(String args[]){
try{
no1 = Integer.parseInt(args[0]);
no2 = Integer.parseInt(args[1]);
System.out.println("相除结果为 "+no1/no2);
}
catch(ArithmeticException i) 
{
System.out.println("不能除以 0");
}
catch(ArrayIndexOutOfBoundsException e1)
 {
        System.out.println("此程序要输入两个参数！");
     }
     catch(NumberFormatException e2)
     {
       System.out.println("必须输入数字! ");
     }
finally {
System.out.println("Finally 已执行,用来做清理工作！");	
}//最多有一个fnally块，当代码中有return语句被执行时，finally块还会执行	
}
public static void main(String args[]) {
new FinallyDemo(args); 
} 
}