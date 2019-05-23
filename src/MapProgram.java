import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled, high-level, object-oriented, platform-independent language"); //put~add, needs key and definition
		languages.put("Python", "an interpreted, object-orinted, high-level programming language with dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		languages.put("BASIC", "Beginners All Purposes Instruction Code");
		languages.put("Lisp", "Therein lies madness");
		
		System.out.println(languages.get("Java"));
		
	}
}
