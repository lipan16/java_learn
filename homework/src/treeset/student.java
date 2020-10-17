package treeset;

public class student {
	private String name;
	private String id;
	private String major;
	private float math_score;
	private float english_score;
	private float javaee_score;

	public student() {// 默认构造方法
		name = "李攀";
		id = "320160939611";
		major = "计算机科学与技术";
		math_score = 90;
		english_score = 87;
		javaee_score = 90;
	}

	public student(String name, String id, String major, float math_score, float english_score, float javaee_score) {
		this.name = name;
		this.id = id;
		this.major = major;
		this.math_score = math_score;
		this.english_score = english_score;
		this.javaee_score = javaee_score;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", major=" + major + ", math_score=" + math_score
				+ ", english_score=" + english_score + ", javaee_score=" + javaee_score + "]";
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public float getMath_score() {
		return math_score;
	}

	public void setMath_score(float math_score) {
		this.math_score = math_score;
	}

	public float getEnglish_score() {
		return english_score;
	}

	public void setEnglish_score(float english_score) {
		this.english_score = english_score;
	}

	public float getJavaee_score() {
		return javaee_score;
	}

	public void setJavaee_score(float javaee_score) {
		this.javaee_score = javaee_score;
	}
}
