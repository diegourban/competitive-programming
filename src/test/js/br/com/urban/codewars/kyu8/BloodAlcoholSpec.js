describe("Blood Acohol", function() {
	var kata;
	
	beforeEach(function() {
		kata = new BloodAlcoholKata();
	});


	it("Expect 1 to be 1", function() {
		expect(kata.execute({ounces:12.5, abv:0.4}, 190, 'male', 1)).toBe(0.0837);
	});
 
});