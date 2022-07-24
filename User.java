package core;

public class User {
	private int uid;
	private String name;
	private int age;
	

	public User(int uid,String name,int age) {
		uid=this.uid;
		name=this.name;
		age=this.age;
	}
	public int getUid(){
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
		
}
