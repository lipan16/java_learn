import java.util.ArrayList;
import java.util.Scanner;
class Student {
	// ѧ��
	private String id;
	// ����
	private String name;
	// ����
	private String age;
	// ��ס��
	private String address;

	public Student() {

	}

	public Student(String id, String name, String age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class StudentAdmin {
	public static void main(String[] args) {
		// �������϶������ڴ洢ѧ������
		ArrayList<Student> list = new ArrayList<Student>();

		// Ϊ���ó����ܹ��ص�������������ʹ��ѭ��
		while (true) {
			// ����ѧ������ϵͳ��������
			System.out.println("--------��ӭ����ѧ������ϵͳ--------");
			System.out.println("1 �鿴����ѧ��");
			System.out.println("2 ���ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �޸�ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");
			// ��������¼�����
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			// ��switch���ʵ��ѡ��
			switch (choiceString) {
			case "1":
				// �鿴����ѧ��
				findAllStudent(list);
				break;
			case "2":
				// ���ѧ��
				addStudent(list);
				break;
			case "3":
				// ɾ��ѧ��
				deleteStudent(list);
				break;
			case "4":
				// �޸�ѧ��
				updateStudent(list);
				break;
			case "5":
				// �˳�
				// System.out.println("лл���ʹ��");
				// break;
			default:
				System.out.println("лл���ʹ��");
				System.exit(0); // JVM�˳�
				break;
			}
		}
	}

	/*
	 * �޸�ѧ���ķ��� �޸�ѧ����˼·������¼��һ��ѧ�ţ���������ȥ���ң����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о��޸ĸ�ѧ��
	 */

	public static void updateStudent(ArrayList<Student> list) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
		String id = sc.nextLine();

		// ����һ������
		int index = -1;

		// ��������
		for (int x = 0; x < list.size(); x++) {
			// ��ȡÿһ��ѧ������
			Student s = list.get(x);
			// ��ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if (s.getId().equals(id)) {
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		} else {
			System.out.println("������ѧ����������");
			String name = sc.nextLine();
			System.out.println("������ѧ�������䣺");
			String age = sc.nextLine();
			System.out.println("������ѧ���¾�ס�أ�");
			String address = sc.nextLine();

			// ����ѧ������
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			// �޸ļ����е�ѧ������
			list.set(index, s);

			// ������ʾ
			System.out.println("�޸�ѧ���ɹ�");
		}
	}

	/*
	 * ɾ��ѧ���ķ��� ɾ��ѧ����˼·������¼��һ��ѧ�ţ���������ȥ���ң����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о�ɾ����ѧ��
	 */
	public static void deleteStudent(ArrayList<Student> list) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");
		String id = sc.nextLine();

		// ���Ǳ������ѧ�Ų����ڵ�ʱ�����ʾ
		// ����һ������
		int index = -1;

		// ��������
		for (int x = 0; x < list.size(); x++) {
			// ��ȡ��ÿһ��ѧ������
			Student s = list.get(x);
			// �����ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if (s.getId().equals(id)) {
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("������˼,��Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		} else {
			list.remove(index);
			System.out.println("ɾ��ѧ���ɹ�");
		}
	}

	// ���ѧ���ķ���
	public static void addStudent(ArrayList<Student> list) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// Ϊ����id�ܹ������ʵ������ǾͰ�id��������ѭ��������
		String id;

		// Ϊ���ô����ܹ��ص������ѭ��
		while (true) {
			System.out.println("������ѧ��ѧ�ţ�");
			// String id = sc.nextLine();
			id = sc.nextLine();

			// �ж�ѧ����û�б���ռ��
			// ������
			boolean flag = false;
			// �������ϣ��õ�ÿһ��ѧ��
			for (int x = 0; x < list.size(); x++) {
				Student s = list.get(x);
				// ��ȡ��ѧ����ѧ�ţ��ͼ���¼���ѧ�Ž��бȽ�
				if (s.getId().equals(id)) {
					flag = true; // ˵��ѧ�ű�ռ����
					break;
				}
			}

			if (flag) {
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break; // ����ѭ��
			}
		}

		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();

		// ����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// ��ѧ��������ΪԪ����ӵ�����
		list.add(s);

		// ������ʾ
		System.out.println("���ѧ���ɹ�");
	}

	// �鿴����ѧ��
	public static void findAllStudent(ArrayList<Student> list) {
		// �������жϼ������Ƿ������ݣ����û�����ݣ��͸�����ʾ�����ø÷�������������ִ��
		if (list.size() == 0) {
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
			return;
		}

		// \t ��ʵ����һ��tab����λ��
		System.out.println("ѧ��\t\t����\t����\t��ס��");
		for (int x = 0; x < list.size(); x++) {
			Student s = list.get(x);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}
	}
}

