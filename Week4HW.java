import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Week4 HW StringBuilder, Lists, Sets, Maps
		//Question 1
		List<String> employeeNames = new ArrayList<String>();
		
		//Question 2
		Set<Integer> ids = new HashSet<Integer>();
		
		//Question 3
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//Question 4
		employeeNames.add("Corie");
		employeeNames.add("Jimie");
		employeeNames.add("Kaedyn");
		employeeNames.add("Cody");
		employeeNames.add("Diego");
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		//Question 5
		int i = 0;
		for(int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		//Question 6
		Set<Integer> employeeKey = employeeMap.keySet();
		for(int key : employeeKey) {
		System.out.println(key + " " + employeeMap.get(key));
		}
		
		//Question 7
		StringBuilder idsBuilder = new StringBuilder();
		//Question 8
		for(int id : ids) {
			idsBuilder.append(id + "-");
		}//Question 9
		System.out.println(idsBuilder.toString());
		
		//Question 10
		StringBuilder namesBuilder = new StringBuilder();
		//Question 11
		for(String employee : employeeNames) {
			namesBuilder.append(employee + " ");
		}//Question 12
		System.out.println(namesBuilder.toString());
	}

}
