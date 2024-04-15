import java.util.HashSet;

public class Reee {

	public static void main(String[] args) {
		
		String name = "jaanna";
		StringBuilder store= new StringBuilder();
		HashSet<Character> set =new HashSet<>();
		
		for(char c:name.toCharArray()) {
			if(set.add(c)) {
				store.append(c);
				
			}
			
		}
		System.out.println("String with duplicates removed: " + store.toString());
	}

	}