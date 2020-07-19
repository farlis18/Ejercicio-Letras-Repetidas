
import java.util.*;

public class Fase2 {
	public static void main(String[] args) {
		char[] name = { 'f','a','r','l','e','y', '0' };

		List<Character> listName = new ArrayList<>();

		for (int i = 0; i < name.length; i++) {
			listName.add(name[i]);
		}

		Iterator<Character> it = listName.iterator();

		while (it.hasNext()) {
			Object aux = it.next();
			if ("AEIOUaeiou".contains(aux.toString())) {
				System.out.println("Vocal");
			} else if ("0123456789".contains(aux.toString())) {
				System.out.println("Els noms de persones no contenen números!");
			} else {
				System.out.println("Consonante");
			}
		}
	}
}

    

