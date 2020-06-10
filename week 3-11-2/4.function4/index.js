function countWords(message){
  var arr = message.split(/[, .]/),count = 0;
  for(a in arr){
  	if(arr[a].length!=0)
  		count++;
  }
  console.log(count);
  return count;
}
countWords('Good morning, I love JavaScript.');