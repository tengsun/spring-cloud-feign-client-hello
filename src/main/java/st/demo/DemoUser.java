package st.demo;

public class DemoUser {

	private String name;
	private Integer age;

	public DemoUser() {
	}

	public DemoUser(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", age = " + age;
	}

}
