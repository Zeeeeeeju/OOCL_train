// Create a null object and set its variable name as user;
var user = {}
console.log(user)
// Add a name attribute and set its value as John;
user['name'] = 'John'
console.log(user)
// Add a surname attribute and set its value as Mike;
user['surname'] = 'Mike'
console.log(user)
// Modify the value of name attribute as Peter;
user['name'] = 'Peter'
console.log(user)
// Delete name attribute of user.
delete user.name
console.log(user)