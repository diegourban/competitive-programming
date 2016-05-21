function bloodAlcoholContent(drinks, weight, sex, time){
	var totalAlcoholConsumed = drinks.ounces * drinks.abv;
	var sexRatio = (sex === 'male' ? 0.73 : 0.66);
	return (totalAlcoholConsumed × 5.14 / weight × sexRatio) - .015 × time;
}

function BloodAlcoholKata() {
	
}
BloodAlcoholKata.prototype.execute = function(drinks, weight, sex, time) {
  return bloodAlcoholContent(drinks, weight, sex, time);
};
