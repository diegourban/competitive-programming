function sortNumber(a,b) {
    return a - b;
}

function differenceInAges(ages){
	ages.sort(sortNumber);
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
