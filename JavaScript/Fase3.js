function funcionFase3(){

	const name = ['f','a','r','l','e', 'y'];
	const vocal = "aeiouAEIOU";
	const num = "0123456789";

	var  mapaLetrasRepetidas = new Map();

	for (var i = 0; i < name.length; i++) {
 		letrasRepetidas(name[i], mapaLetrasRepetidas);
	}

	function letrasRepetidas(letter, map) {
  		if (map.has(letter)) {
   			var actualValue = map.get(letter) + 1;
   	 		map.set(letter, actualValue);
  		} else {
  	  		map.set(letter, 1);
  		}
	}

	for (var [clave, valor] of mapaLetrasRepetidas.entries()) {
 		 console.log(clave + " = " + valor);
	}
}