import java.util.*;

public class Fase4 {
	public static void main(String[] args) {
		char[] name = { 'f', 'a', 'r', 'l', 'e', 'y' };
		List<Character> listName = new ArrayList<>();
		
		Map<String, Integer> mapaLetrasRepetidas = new HashMap<String, Integer>();
		
		char[] surname = {'f', 'o', 'n', 's', 'e', 'c', 'a'};
		List<Character> listSurname = new ArrayList<>();

		List<Character> fullNameList = new ArrayList<>();
		
		for (int i = 0; i < name.length; i++) {
			listName.add(name[i]);
		}
		
		for (int i = 0; i < surname.length; i++) {
			listSurname.add(surname[i]);
		}

		Iterator<Character> it = listName.iterator();
		while (it.hasNext()) {
			String aux = it.next().toString();
			letresRepetidas(aux, mapaLetrasRepetidas);
		}
		
		System.out.println(mapaLetrasRepetidas);
		
		fullNameList.addAll(listName);
		fullNameList.add(' ');
		fullNameList.addAll(listSurname);
		
		System.out.println(fullNameList);
		
	}

	public static void letresRepetidas(String letra, Map<String, Integer> mapaLetrasRepetidas) {
		boolean existKey = mapaLetrasRepetidas.containsKey(letra); //
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

