import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

//import org.testng.Assert;
public class Streamjava {
	public static void main(String[] args)
	{
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Abhi");
		names.add("Don");
		names.add("Abhisek");
		names.add("Aditi");
		names.add("archana");
		
//		long c = names.stream().filter(s -> s.startsWith("A")).count();
//		System.out.println(c);
		
		List<String> newlist = names.stream().filter(s->s.startsWith("A")).sorted().collect(Collectors.toList());
		
		System.out.println(newlist.get(1));
		
		
		List<Integer> values = Arrays.asList(1,3,4,4,2,5,7,7);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
	
		
//	 names.stream().filter(s -> s.length()>3).forEach(s -> System.out.println(s));
	 
//     Stream.of("Abhi","rama","aditi","sankz").filter(s -> s.length() > 3)
//	 .map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
	 
//	 List<String>name2 = Arrays.asList("Roya","Suma","sunny","sun");
//	 
//	 Stream<String> newstream = Stream.concat(names.stream(),name2.stream());
//	 	boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Aditi"));
//	 	
//	 	Assert.assertTrue(flag);
//	 	
	 	
	 	
	 	
	 
	 
	 
	 
	
		}

	
}

