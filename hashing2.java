import java.util.HashMap;

public class hashing2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();		
				
		//Insertion
		map.put("india", 120);
		map.put("US", 30);
		map.put("china", 150);
				
		System.out.println(map);
		
		map.put("china", 190);
		System.out.println(map);
		
		//Search
		if(map.containsKey("china")) {
			System.out.println("present in the map");
		} else {
			System.out.println("Key is not present in the map");
		}
		
		System.out.println(map.get("china")); //key exists
		System.out.println(map.get("Indonesia")); //key doesn't exists
	}
}
	      

