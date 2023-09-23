package general.xyz;
 
public class firstcode {
public static void main(String[] args) {
	Stringparser sp=new Stringparser();
	String str="mahabala";
	myprinter mp=new myprinter();
//	mp.print(str,(str->Stringparser.Stringconvert(s)));
}
}

class Stringparser{
	public static String Stringconvert(String s) {
		if (s.length()<=8)
			s.toUpperCase();
		else
			s.toLowerCase();
		return s;
	}
}
interface parser{
	String parse(String s);
}
class myprinter{
	public void print(String str, parser p) {
		str=p.parse(str);
		System.out.println(str);
	}
}