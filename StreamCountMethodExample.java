package streamAPI;
import java.util.ArrayList;
import java.util.List;

public class StreamCountMethodExample {
	
	  public static void main(String[] args) {
		  
		  List <String> NameList= new ArrayList<>();
		  NameList.add("india");
		  NameList.add("russia");
		  NameList.add("america");
		  NameList.add("shrilanka");
		  
		  
		 Long count=NameList.stream().filter(s -> s.length() >5).count();
		 System.out.println("total name with more than 5 length is"+count);
	  }
}