function loseWeight(gender, weight, duration){
  if(gender != 'F' && gender != 'M') {
    return 'Invalid gender';
  }
  
  if(weight <= 0) {
    return 'Invalid weight';
  }
  
  if(duration <= 0) {
    return 'Invalid duration';
  }
  
  for(let i = 1; i <= duration; i++) {
      weight = weight - weight * (gender === 'M' ? 0.015 : 0.012);
  } 
  
  return Math.round(weight * 10) / 10;

}