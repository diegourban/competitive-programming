function NoOddsKata() {

}
NoOddsKata.prototype.execute = function(num) {
	return noOdds(num);
};

function noOdds(values) {
	var noOddsArr = [];
	values.forEach(function(i){
		if(i % 2 == 0) {
			noOddsArr.push(i);
		}
	});
	return noOddsArr;
}