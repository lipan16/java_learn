import java.text.ParseException;
import java.util.Scanner;

import calendar.calendar;
import calendar.date;
import student.student;
import arraylist.arraylist_test;
import treeset.treeset_test;
import hashset.hashset_test;

public class main_test {
	public static void main(String[] args) throws ParseException {
		while (true) {
			System.out.println("*********************************");
			System.out.println("*	×÷Òµ×ÛºÏ²âÊÔ		*");
			System.out.println("*-------------------------------*");
			System.out.println("*	1.hashset	²âÊÔ	*");
			System.out.println("*	2.treeset	²âÊÔ	*");
			System.out.println("*	3.arraylist	²âÊÔ	*");
			System.out.println("*	4.spilt		²âÊÔ	*");
			System.out.println("*	5.student	²âÊÔ	*");
			System.out.println("*	6.date		²âÊÔ	*");
			System.out.println("*	7.calendar	²âÊÔ	*");
			System.out.println("*	8.ÍË³ö			*");
			System.out.println("*********************************");
			System.out.println("ÇëÊäÈë£¡£¡£¡");
			@SuppressWarnings("resource")
			int s = new Scanner(System.in).nextInt();
			switch (s) {
			case 1:
				hashset_test hs = new hashset_test();
				hs.hash_test();break;
			case 2:
				treeset_test ts = new treeset_test();
				ts.tree_test();break;
			case 3:
				arraylist_test alt = new arraylist_test();
				alt.list_test();break;
			case 4:
				spilt sp = new spilt();
				sp.spilt_test();break;
			case 5:
				student stu = new student();
				stu.student_test();break;
			case 6:
				date da = new date();
				System.out.println("2109Äê3ÔÂ6ºÅ¾àÀë½ñÌì¹²"+da.daysBetween("2019-03-06")+"Ìì");break;
			case 7:
				new calendar();break;
			case 8:
				System.out.println("ÍË³ö³É¹¦");
				System.exit(0);break;
			}
		}
	}
}
