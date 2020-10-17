public class WeekDaysList{
public static void main(String[] args){
System.out.println("Days of week:");
for(DaysOfTheWeek day:DaysOfTheWeek.values()){
System.out.print(" "+day);
}
System.out.println();
}}
enum DaysOfTheWeek{
MONDAY,TUESDAY,WENDSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
@Override
public String toString(){
String s=super.toString();
return s.substring(0,1)+s.substring(1).toLowerCase();
}}