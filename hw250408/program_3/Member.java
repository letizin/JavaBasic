package hw250408.program_3;

public class Member {
	
	private String name;
	private String id;
	private String pass;
	private int age;
	
	public Member() {
		
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "[name=" + name + ", id=" + id + ", pass=" + pass + ", age=" + age + "]";
	}
	
	
}
