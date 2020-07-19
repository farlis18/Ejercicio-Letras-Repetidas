
import java.util.*;

public class Fase3 {
	public static void main(String[] args) {
		char[] name = { 'f', 'a', 'r', 'l', 'e', 'y' };
		List<Character> listName = new ArrayList<>();
		Map <String, Integer> mapaLetrasRepetidas = new HashMap<String, Integer>();

		for (int i = 0; i < name.length; i++) {
			listName.add(name[i]);
		}

		Iterator<Character> it = listName.iterator();
		while (it.hasNext()) {
			String aux = it.next().toString();
			letrasRepetidas(aux, mapaLetrasRepetidas);
		}
		System.out.println(mapaLetrasRepetidas);
	}

	public static void letrasRepetidas(String letra, Map<String, Integer> mapaLetrasRepetidas) {
		boolean existKey = mapaLetrasRepetidas.containsKey(letra); 
		Object value = (mapaLetrasRepetidas.get(letra));

		if (existKey) {
			int valor = (Integer) value;
			valor++;
			mapaLetrasRepetidas.put(letra, valor);

		} else {
			mapaLetrasRepetidas.put(letra, 1);
		}
	}
}

