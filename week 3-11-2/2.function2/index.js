function palindrome(message){
  var i=0,j=message.length-1;
  while(i<=j){
  	if(message.charAt(i)!=message.charAt(j)){
  		console.log(false)
  		return false;
  	}
  	i++;
  	j--;
  }
  console.log(true)
  return true;
}
palindrome('hello');
palindrome('abcba');