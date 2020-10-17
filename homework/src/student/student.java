package student;

public class student {
	private String name;
	private String id;
	private String birthday; 
	private String sex;
	private String department;
	
	public void student_test() {
		student [] stu=new student[5];
		stu[0] = new student();
		stu[1] = new student("小二", "320160666333", "1997-1", "man", "电子信息工程");
		stu[2] = new student("张三", "320160999000", "1998-5", "woman", "信息安全");
		stu[3] = new student("李四", "320160888111", "1999-8", "woman", "电子商务");
		stu[4] = new student("王五", "320160777222", "1997-1", "man", "计算数学");
		for(int i=0;i<stu.length;i++) {
			int min = i;
			for(int j=i;j<stu.length;j++) {
				if(compareStudents(stu[i], stu[j])<0) {
					min=j;
				}
			}
			if(min!=i) {
				swap(stu[i],stu[min]);
			}
		}
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].toString());
		}
	}
	
	public void swap(student s1,student s2) {
		String temp;

		temp = s1.getName();
		s1.setName(s2.getName());
		s2.setName(temp);
		
		temp = s1.getId();
		s1.setId(s2.getId());
		s2.setId(temp);
		
		temp = s1.getBirthday();
		s1.setBirthday(s2.getBirthday());
		s2.setBirthday(temp);
		
		temp = s1.getSex();
		s1.setSex(s2.getSex());
		s2.setSex(temp);
		
		temp = s1.getDepartment();
		s1.setDepartment(s2.getDepartment());
		s2.setDepartment(temp);

	}
	
	public student() {// 默认构造方法
		name = "李攀";
		id = "320160939611";
		birthday = "1998-12";
		sex = "man";
		department = "计算机科学与技术";
	}

	public student(String name, String id, String birthday, String sex, String department) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
		this.sex = sex;
		this.department = department;
	}

	public int compareStudents(student s1,student s2) {
		String name1=s1.getName();
		String name2=s2.getName();
		return name1.compareTo(name2);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", birthday=" + birthday + ", sex=" + sex + ", department=" + department + "]";
	}

}
