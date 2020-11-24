/* zad 1

var a = 2;
var b = 3;
var c = 4;
var name = "Szczepan";
alert(a * b);
alert(name);
*/

/* ćwiczenie 1
function myFunction(a,b) {
var result = a + b;
return result;
}
var x = myFunction(2, 8);
alert(x);

var y = myFunction(5,9);
alert(y);
*/

/* ćwiczenie 2
var price = 230;
if (price > 200){
alert("Cena wyższa niż 200. Otrzymujesz rabat");
}
else{
alert("Cena jest równa lub niższa aniżeli 200zł, nie otrzymujesz rabatu");
}
*/

/* ćwiczenie 3
for(var i = 1; i<=10; i++){
    alert(i);
    }
*/

/* zadanie 2
var myArray = [ 20, 34, "ok", true, 102, "test" ];
for (var i = 0; i < myArray.length; i++){
    alert(myArray[i]);
    
}

alert(myArray[2]);
*/

/* zadanie 3

const numbers = [2, 5, 7, 10, 34, 16, 879, 1]
function evenNumbers(arr){
return arr.filter(item => item %2 ===0);
}
console.log(`Parzyste liczby: ${ evenNumbers(numbers) }`);
*/

/* zadanie 4
function gwiazdki (){
    let str = "";
    for (let i = 0; i < 6; i++){
        for (let j = 0; j < 6; j++){
           str += "*"; 
        }
        str += "\n";
    }
    console.log(str);
    return console.log;
}
*/
/* ćwiczenie 4
var person = {
    name: 'Jan Kowalski',
    age: 34,
    email: 'jk@wp.pl',
    sayHello: function() {
    alert('Witaj: ' + this.name)
}
}

person.sayHello();
*/

/*
window.onload = function() {
	var top = document.getElementById('top');
	top.innerHTML = '<h2>to jest nowa zawartość Top</h2>';
	top.style.color = 'red';
	var paragraphs = document.getElementsByTagName('p');
	console.log('Na stronie znajduję ' + paragraphs.length + ' akapity.');
}   
    */

let shoppingList = ["potatoes","oranges","soap","shampoo"]
let l = shoppingList.length

for (i = 3; i > l; i--){
    console.log(shoppingList[i])
}

