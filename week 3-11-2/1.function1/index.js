function reverseString(message){
  var str = "";
  for(var i=message.length-1;i>=0;i--){
  	str+=message.charAt(i);
  }
  console.log(str)
  return str;
}
reverseString('hello');