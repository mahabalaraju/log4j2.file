package general.xyz;

import java.util.ArrayList;
import java.util.List;

public class database {
public static List<employee> getemplooyee (){
	List<employee> list=new ArrayList<>();
	list.add(new employee(1,"bala","IT-trainee",50000,26));
	
	list.add(new employee(2,"mahabala","IT-devoloper",70000,26));
	
	list.add(new employee(3,"mahabalaraj","IT-cloud",100000,26));
	
	list.add(new employee(4,"mahabalaraju","IT-solution-architect",500000,27));
	list.add(new employee(5,"H Mahabalaraju","Devops-Enginner",1000000,28));
	return list;
}
}

