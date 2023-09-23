package general.xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class list {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,12,33,5,66,67,77,77,66,55,5,5,54,34,2,2,243,42,5,525);
	list.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);

//	Set<Integer> set=list.stream().filter((e->Collections.frequency(list, e)>1))
//			.collect(Collectors.toSet());
//		set.stream().	forEach(System.out::println);
//	
//	Set<Integer> set=new HashSet<>();
//	Set<Integer> set1=list.stream().
//			filter(emp->!set.add(emp)).collect(Collectors.toSet());

//	list.stream().reduce(Integer::max);
//	System.out.println(list);
	
}
}
