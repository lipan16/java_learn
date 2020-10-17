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
						return -1;// ���շ����˳���������
					else
						return 1;// ���շ����˳���������
				} else if (f1 > f2) {
					return -1;
				} else {
					return 1;
				}
			}
		});

		ts.add(new student());
		ts.add(new student("С��", "320160666333", "������Ϣ����", 60, 70, 85));
		ts.add(new student("����", "320160999000", "��Ϣ��ȫ", 80, 83, 77));
		ts.add(new student("����", "320160888111", "��������", 78, 72, 90));
		ts.add(new student("����", "320160777222", "������ѧ", 88, 90, 86));

		for (student s : ts) {
			System.out.println(s.toString());
		}
	}
}
