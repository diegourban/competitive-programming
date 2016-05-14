function sortNumber(a,b) {
    return a - b;
}

function nextId(ids) {
	ids.sort(sortNumber);
	for (var index = 0; index < ids.length; index++) {
		if(ids[index] !== index) {
			return index;
		}
	}
	return ids.length;
}

function SmallestKata() {

}
SmallestKata.prototype.execute = function(ids) {
	return nextId(ids);
};
