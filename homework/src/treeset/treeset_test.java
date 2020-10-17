package treeset;

import java.util.*;

public class treeset_test {
	public void tree_test() {
		TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {
			public int compare(student a, student b) {
				float f1 = a.getMath_score() + a.getEnglish_score() + a.getJavaee_score();
				float f2 = b.getMath_score() + b.getEnglish_score() + b.getJavaee_score();
				if (f1 == f2) {
					if ((a.getId()).compareTo(b.getId()) > 0)
						return -1;// 按照放入的顺序，逆向输出
					else
						return 1;// 按照放入的顺序，依次输出
				} else if (f1 > f2) {
					return -1;
				} else {
					return 1;
				}
			}
		});

		ts.add(new student());
		ts.add(new student("小二", "320160666333", "电子信息工程", 60, 70, 85));
		ts.add(new student("张三", "320160999000", "信息安全", 80, 83, 77));
		ts.add(new student("李四", "320160888111", "电子商务", 78, 72, 90));
		ts.add(new student("王五", "320160777222", "计算数学", 88, 90, 86));

		for (student s : ts) {
			System.out.println(s.toString());
		}
	}
}
