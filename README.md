# Kaprekas Constant
6174 (also known as Kaprekas Constant) is the value that when a given four digit number's largest value and it's lowest value is subtracted and repeated. It was named after Indian Mathematician D.R. Kaprekar. The conditions for the four digit number are as follows:
- The number must contain a total of 4 digits (Leading zeros are acceptable).
- Of those 4 digits, there are to be no more than 3 duplicates (cannot be 0000, 1111, 2222, etc.)

**What is this routine?**<br />
```
User input number: 6589
Largest possible value: 9865
Lowest possible value: 5689

9865 - 5689 =  4176
7641 - 1467 = 6174

Therefore, the iteration until Kaprekas Constant for 6589 is 2.
```
<br />
**How to use this application**<br />
```
java KaprekasRoutine
```
<br />
**How to compile**<br />
```
javac KaprekasRoutine.java
```
<br />
**Example Input/Output**<br />
```
Enter any 4 digit number: 6589
```
The above input will result in the following output:
```
KaprekasRoutine(6589) = 2
```
<br />
**Still to do**<br />
- [ ] Support invalid inputs (such as 2 digit numbers)
- [ ] Support for leading zeros with a singular end digit (i.e. 0003)
- [ ] Research and implement a better method for Int to Double conversion (i.e (ArrayList.size() - 1) * 1.0);)
