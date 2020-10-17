import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest { 
    public static void main(String[] args) {
        GregorianCalendar d=new GregorianCalendar();
        for(int i=0;i<=Calendar.DECEMBER;i++){
            d.set(Calendar.MONTH, i);
            System.out.println("\t\t\t  "+(d.get(Calendar.MONTH)+1)+"ÔÂ");
            System.out.println("======================================================");
            showMonth(d);
            System.out.println("******************************************************");
        }
    }
    private static void showMonth(GregorianCalendar d)
	{
        int today=d.get(Calendar.DAY_OF_MONTH);
        int month=d.get(Calendar.MONTH); //construct d as current date
        d.set(Calendar.DAY_OF_MONTH, 1);//set d to start date of the month
        int weekday=d.get(Calendar.DAY_OF_WEEK);//get first day of week(Sunday )
        int firstDayOfWeek=d.getFirstDayOfWeek();//determine the required indentation for the first line
        int indenct=0;
        while(weekday!=firstDayOfWeek)
		{
            indenct++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }//print weekday name
        String[] weekdayNames=new DateFormatSymbols().getShortWeekdays();
        do{
            System.out.printf("%4s",weekdayNames[weekday]+"\t");
            d.add(Calendar.DAY_OF_WEEK,1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }while(weekday!=firstDayOfWeek);
        System.out.println();
        for(int i=0;i<indenct;i++)//print space 
		{ 
            System.out.print("\t");
        }
        d.set(Calendar.DAY_OF_MONTH, 1);
        do{
            int day=d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d\t",day);//print day
            d.add(Calendar.DAY_OF_MONTH, 1);//advance d to the next day
            weekday=d.get(Calendar.DAY_OF_WEEK);
            if(weekday==firstDayOfWeek)
			{
                System.out.println();//start a new line at the start of the week
            }
        }while(d.get(Calendar.MONTH)==month);//the loop exists when d id day 1 of the next money
        if(weekday!=firstDayOfWeek)//print final end of line if necessary
		{
            System.out.println();
        }
    }
}
