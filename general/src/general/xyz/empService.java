package general.xyz;

import java.util.List;
import java.util.stream.Collectors;

public class empService {

	static database Dao=new database();
	
	public static List<employee> evaluatetaxpayers(){
	return	Dao.getemplooyee().stream().filter(emp->emp.getSalary()>500000
				).collect(Collectors.toList()
						);
		
	}
	public static void main(String[] args) {
		System.out.println(evaluatetaxpayers());
		
	}
}
