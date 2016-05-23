function uniTotal(chars){
  var total = 0;
  for(var i = 0; i < chars.length; i++) {
    total += chars.charCodeAt(i);
  }
  return total;
}
