import java.util.ArrayList;
import java.util.Scanner;
class Student {
	// 学号
	private String id;
	// 姓名
	private String name;
	// 年龄
	private String age;
	// 居住地
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
		// 创建集合对象，用于存储学生数据
		ArrayList<Student> list = new ArrayList<Student>();

		// 为了让程序能够回到这里来，我们使用循环
		while (true) {
			// 这是学生管理系统的主界面
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择：");
			// 创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			// 用switch语句实现选择
			switch (choiceString) {
			case "1":
				// 查看所有学生
				findAllStudent(list);
				break;
			case "2":
				// 添加学生
				addStudent(list);
				break;
			case "3":
				// 删除学生
				deleteStudent(list);
				break;
			case "4":
				// 修改学生
				updateStudent(list);
				break;
			case "5":
				// 退出
				// System.out.println("谢谢你的使用");
				// break;
			default:
				System.out.println("谢谢你的使用");
				System.exit(0); // JVM退出
				break;
			}
		}
	}

	/*
	 * 修改学生的方法 修改学生的思路：键盘录入一个学号，到集合中去查找，看是否有学生使用的是该学号，如果有就修改该学生
	 */

	public static void updateStudent(ArrayList<Student> list) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号：");
		String id = sc.nextLine();

		// 定义一个索引
		int index = -1;

		// 遍历集合
		for (int x = 0; x < list.size(); x++) {
			// 获取每一个学生对象
			Student s = list.get(x);
			// 拿学生对象的学号和键盘录入的学号进行比较
			if (s.getId().equals(id)) {
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("不好意思,你要修改的学号对应的学生信息不存在,请回去重新你的选择");
		} else {
			System.out.println("请输入学生新姓名：");
			String name = sc.nextLine();
			System.out.println("请输入学生新年龄：");
			String age = sc.nextLine();
			System.out.println("请输入学生新居住地：");
			String address = sc.nextLine();

			// 创建学生对象
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			// 修改集合中的学生对象
			list.set(index, s);

			// 给出提示
			System.out.println("修改学生成功");
		}
	}

	/*
	 * 删除学生的方法 删除学生的思路：键盘录入一个学号，到集合中去查找，看是否有学生使用的是该学号，如果有就删除该学生
	 */
	public static void deleteStudent(ArrayList<Student> list) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学生的学号：");
		String id = sc.nextLine();

		// 我们必须给出学号不存在的时候的提示
		// 定义一个索引
		int index = -1;

		// 遍历集合
		for (int x = 0; x < list.size(); x++) {
			// 获取到每一个学生对象
			Student s = list.get(x);
			// 拿这个学生对象的学号和键盘录入的学号进行比较
			if (s.getId().equals(id)) {
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("不好意思,你要删除的学号对应的学生信息不存在,请回去重新你的选择");
		} else {
			list.remove(index);
			System.out.println("删除学生成功");
		}
	}

	// 添加学生的方法
	public static void addStudent(ArrayList<Student> list) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 为了让id能够被访问到，我们就把id定义在了循环的外面
		String id;

		// 为了让代码能够回到这里，用循环
		while (true) {
			System.out.println("请输入学生学号：");
			// String id = sc.nextLine();
			id = sc.nextLine();

			// 判断学号有没有被人占用
			// 定义标记
			boolean flag = false;
			// 遍历集合，得到每一个学生
			for (int x = 0; x < list.size(); x++) {
				Student s = list.get(x);
				// 获取该学生的学号，和键盘录入的学号进行比较
				if (s.getId().equals(id)) {
					flag = true; // 说明学号被占用了
					break;
				}
			}

			if (flag) {
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break; // 结束循环
			}
		}

		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();

		// 创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// 把学生对象作为元素添加到集合
		list.add(s);

		// 给出提示
		System.out.println("添加学生成功");
	}

	// 查看所有学生
	public static void findAllStudent(ArrayList<Student> list) {
		// 首先来判断集合中是否有数据，如果没有数据，就给出提示，并让该方法不继续往下执行
		if (list.size() == 0) {
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
			return;
		}

		// \t 其实就是一个tab键的位置
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for (int x = 0; x < list.size(); x++) {
			Student s = list.get(x);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}
	}
}

