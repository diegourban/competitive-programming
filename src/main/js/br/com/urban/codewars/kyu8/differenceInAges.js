function differenceInAges(ages){
	ages.sort(function(a, b){return a-b});
	var min = ages[0];
	var max = ages[ages.length-1];
	var diff = max - min;
	return [min, max, diff];
}

function DifferenceKata() {

}
DifferenceKata.prototype.execute = function(ages) {
	return differenceInAges(ages);
};
