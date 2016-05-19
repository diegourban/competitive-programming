describe("Difference in Ages", function() {
	var kata;
	
	beforeEach(function() {
		kata = new DifferenceKata();
	});


	it("Test 1", function() {
		expect(kata.execute([82, 15, 6, 38, 35])).toEqual([6, 82, 76]);
	});
	
	it("Test 2", function() {
		expect(kata.execute([57, 99, 14, 32])).toEqual([14, 99, 85]);
	});  
	
	it("Test 3", function() {
		expect(kata.execute([1, 1, 3])).toEqual([1, 3, 2]);
	}); 
	
});