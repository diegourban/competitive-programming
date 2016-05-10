describe("Smallest Unused Id", function() {
	var kata;
	
	beforeEach(function() {
		kata = new SmallestKata();
	});


	it("Expect to be in the middle", function() {
		expect(kata.execute([0,1,2,3,5])).toBe(4);
	});
	
	it("Expect to be the last", function() {
		expect(kata.execute([0,1,2,3,4,5])).toBe(6);
	});
	
	it("Expect to be the last", function() {
		expect(kata.execute([0,1,2,3,4,5,6,7,8,9,10])).toBe(11);
	});
  
	
});