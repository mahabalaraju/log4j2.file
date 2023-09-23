package general.xyz;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<Integer,String> p=new HashMap<>();
		p.put(1,"mahabala");
		p.put(2,"raju");
		p.put(3,"raj");
		p.entrySet().stream().forEach(obj->System.out.println(obj));
	}


}
