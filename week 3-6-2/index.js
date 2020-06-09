// The writer determines whether the following variables are of type array.
var a = '[a, b, c, d]';
var b = [1, 2, 3, 4];
//TODO
console.log("a is Array?  "+ (a instanceof Array))
console.log("b is Array?  "+ (b instanceof Array))

// Write a program that multiplies each entry in the following array by 2。
var a = [1, 2, 3, 4, 5];
// TODO should output [2,4,6,8,10]
for(var i=0;i<a.length;i++){
	a[i]*=2;
}
console.log(a)

// Write the program, according to the following requirements output results.
var colors = ["Red", "Green", "White", "Black"];
//TODO case 1 output: 'Red Green White Black'
// case 2 output: 'Red+Green+White+Black'
// case 3 output: 'Red,Green,White,Black'
console.log("case 1: "+colors.join(" "))
console.log("case 2: "+colors.join("+"))
console.log("case 3: "+colors.join(","))


// Write a program to sort the Numbers in the following array from largest to smallest.
var a = [5, 1, 8, 10, 4];
//TODO should output: [10,8,5,4,1]
for(var i=0;i<a.length;i++){
	for(var j=0;j<a.length;j++){
		if(a[j]<a[j+1]){
			var temp = a[j];
			a[j] = a[j+1];
			a[j+1] = temp;
		}
	}
}
console.log(a)

// Program to find the most frequent element in the following array.
var a = [3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3];
//TODO should output: 'a'
obj = {};
var times = 0,mos = '';
for(var i=0;i<a.length;i++){
	if(!(a[i] in obj))
		obj[a[i]] = 1;
	else
		obj[a[i]]++;
}
for(var o in obj){
	if(obj[o]>times){
		mos = o;
		times = obj[o];
	}
}
console.log(mos)