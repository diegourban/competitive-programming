describe("NoOdds", function() {
	var kata;
	
	beforeEach(function() {
		kata = new NoOddsKata();
	});


	it("Expect one", function() {
		expect(kata.execute([1,2,3])).toEqual([2]);
	});
	
	it("Expect no one", function() {
		expect(kata.execute([1,3,5])).toEqual([]);
	});
	
	it("Expect all", function() {
		expect(kata.execute([2,4,6])).toEqual([2,4,6]);
	});
  
});