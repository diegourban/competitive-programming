function find(array, element) {
  var indexOf = array.indexOf(element);
  if(indexOf === -1) {
    return "Not found";
  }
  return indexOf;
}
