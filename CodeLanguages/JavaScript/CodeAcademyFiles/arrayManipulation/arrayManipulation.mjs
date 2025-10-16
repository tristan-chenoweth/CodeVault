const groceryList = ['orange juice', 'bananas', 'coffee beans', 'brown rice', 'pasta', 'coconut oil', 'plantains'];

const removedFront = groceryList.shift(); // .shift() removes the first item from the array and is considered destructive as it modifies the original array.
console.log('Item removed from start of list ' + removedFront);
console.log(groceryList);

groceryList.unshift(removedFront); // .unshift()
console.log(groceryList);

console.log(groceryList.slice(1,4));
console.log(groceryList);

const pastaIndex = groceryList.indexOf('pasta');
console.log(pastaIndex);

const removed = groceryList.pop();
console.log('Item removed from end of list ' + removed);
console.log(groceryList);

groceryList.push(removed);
console.log(groceryList);

