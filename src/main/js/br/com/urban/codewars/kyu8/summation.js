function SummationKata() {
	
}
SummationKata.prototype.execute = function(num) {
  return summation(num);
};

var summation = function (num) {
	var total = 0;
	for(var i = 0; i <= num; i++) {
		total += i;
	}
	return total;
}