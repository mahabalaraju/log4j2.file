package general.xyz;

public class employee {
private int id;
private String name;
private String Department;
private double salary;
private int age;
public employee(int id, String name, String department, double salary, int age) {
	super();
	this.id = id;
	this.name = name;
	Department = department;
	this.salary = salary;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}