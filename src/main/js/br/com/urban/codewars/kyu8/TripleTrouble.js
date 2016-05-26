function tripleTrouble(one, two, three){
	var result = "";
	for (let i = 0; i < one.length; i++) {
		result += one.charAt(i) + two.charAt(i) + three.charAt(i);
	}
	return result;
 }