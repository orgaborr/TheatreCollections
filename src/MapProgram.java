import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled, high-level, object-oriented, platform-independent language"); //put~add, needs key and value
		languages.put("Python", "an interpreted, object-orinted, high-level programming language with dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		System.out.println(languages.put("BASIC", "Beginners All Purposes Instruction Code"));
		System.out.println(languages.put("Lisp", "Therein lies madness"));
		
//		System.out.println(languages.put("Java", "this course is about Java")); //overwrites value, displays the overwritten value at this moment
//		System.out.println(languages.get("Java")); //displays the new value of the key
		
		
		//use the containsKey method to check and not overwrite the value of the key
		if(languages.containsKey("Java")) {
			System.out.println("Java is already in the map");
		} else {
			languages.put("Java", "this course is about Java");
		}
		
		System.out.println("============================================");
		
		for(String key : languages.keySet()) { //goes through all keys, more in Sets section, doesn'T return them in the correct order wit hash map
			System.out.println(key + " : " + languages.get(key));
		}
		
	}
}
