package arraylist;

import java.util.Scanner;

public class person {
	private String pid;
	private String name;
	private String sex;
	private String tel;
	private String address;
	private String email;

	public person() {
	/*	pid = 1;
		name = "java ee";
		sex = "man";
		tel = "1234567";
		address = "兰州";
		email = "139@lzu.edu.cn";*/
		modify();
	}

	public person(String pid, String name, String sex, String tel, String address, String email) {
		this.pid = pid;
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.address = address;
		this.email = email;
	}

	public void modify() {
		String str;
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		System.out.print("请输入联系人信息\n请输入pid：");
		str = keyin.nextLine();
		this.setPid(str);

		System.out.print("请输入name：");
		str = keyin.nextLine();
		this.setName(str);

		System.out.print("请输入sex：");
		str = keyin.nextLine();
		this.setSex(str);

		System.out.print("请输入tel：");
		str = keyin.nextLine();
		this.setTel(str);

		System.out.print("请输入address：");
		str = keyin.nextLine();
		this.setAddress(str);

		System.out.print("请输入email：");
		str = keyin.nextLine();
		this.setEmail(str);

		//keyin.close();
	}
	
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "person [pid=" + pid + ", name=" + name + ", sex=" + sex + ", tel=" + tel + ", address=" + address
				+ ", email=" + email + "]";
	}

}
