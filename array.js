let numbers = [];
for (let i = 0; i < 10; i++) {
    numbers.push(Math.floor(Math.random() * 1000) + 1);
}

let sum = numbers.reduce((a, b) => a + b, 0);

numbers.forEach(num => console.log(num));
console.log("Sum of array:", sum);
