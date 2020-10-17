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
			System.out.println("*	��ҵ�ۺϲ���		*");
			System.out.println("*-------------------------------*");
			System.out.println("*	1.hashset	����	*");
			System.out.println("*	2.treeset	����	*");
			System.out.println("*	3.arraylist	����	*");
			System.out.println("*	4.spilt		����	*");
			System.out.println("*	5.student	����	*");
			System.out.println("*	6.date		����	*");
			System.out.println("*	7.calendar	����	*");
			System.out.println("*	8.�˳�			*");
			System.out.println("*********************************");
			System.out.println("�����룡����");
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
				System.out.println("2109��3��6�ž�����칲"+da.daysBetween("2019-03-06")+"��");break;
			case 7:
				new calendar();break;
			case 8:
				System.out.println("�˳��ɹ�");
				System.exit(0);break;
			}
		}
	}
}
