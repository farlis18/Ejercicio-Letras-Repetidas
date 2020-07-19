
function funcionFase2(){
			
	const name = ['f','a','r','l','e', 'y','0'];
	const vocal = 'aeiouAEIOU';
	const num = '0123456789';

	for (var i = 0; i < name.length; i++) {
		if(vocal.indexOf(name[i]) != -1){
		console.log("Vocal");
		} else if(num.indexOf(name[i]) != -1){
		console.log("Els noms de persones no contenen números!");
		} else{
		console.log("Consonante");
		}
	}
}



    
