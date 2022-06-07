package streamAPI;
import java.util.ArrayList;
import java.util.List;

public class MinMaxUsingStream {
	  public static void main(String[] args) {
		  
		  List<Integer> numbers = new ArrayList<>();
		  numbers.add(26);
		  numbers.add(62);
		  numbers.add(72);
		  numbers.add(28);
		  numbers.add(82);
		  numbers.add(32);
		  numbers.add(97);
		  numbers.add(100);
		  
		  System.out.println("numbers");
		  
		  Integer minNum = numbers.stream().min(s1,s2) -> s1.compareTo(s2)).get();
		  System.out.println("Minimum number in the list is :" +minNum);
		  
		  Integer maxNum = numbers.stream().max(s1,s2) -> s1.compareTo(s2)).get();
		  System.out.println("Maximum number in the list is :" +maxNum);    
	  }
}