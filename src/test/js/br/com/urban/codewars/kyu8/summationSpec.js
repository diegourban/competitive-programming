describe("Summation", function() {
	var kata;
	
	beforeEach(function() {
		kata = new SummationKata();
	});


	it("Expect 1 to be 1", function() {
		expect(kata.execute(1)).toBe(1);
	});
  
	it("Expect 8 to be 36", function() {
		expect(kata.execute(8)).toBe(36);
	});
});