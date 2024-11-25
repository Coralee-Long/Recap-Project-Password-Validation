# 1-Java / 11-Recap-Project-Password-Validation

## Setup: GitHub Project

Today we will write a password validation in Java! There is a lot to do, but let's proceed step by step.

* Create a new Java GitHub project. Choose a suitable name, e.g. 'passwordvalidation'. Don't start coding yet, instead create a project with minimal code (e.g. Hello World) and push it to Github. Then enter the Github URL to your repo here:
<br>
   🔗 https://github.com/Coralee-Long/Recap-Project-Password-Validation

## Research: Define Signatures

Think about how the methods for password validation should look like. Discuss return values and types of parameters. Define names. However, do not implement the actual code of the individual methods in this step. The following methods are involved:


* **A method that ensures a password is at least 8 characters long.**
    > - .length() method from String class
    > - Java String classes contain a built-in length() method
    > - Note: length() method includes blanks, spaces and special characters

    <br>
* **With another method, you want to check if the password contains digits.**
    >  - There seems to be a few options, I will decide later which is best
    >      1. Using Regex
    >      2. Using a Loop -> Convert String to char array.toCharArray(), 
             then use Character.isDigit() method to check for numbers
    >      3. Using Streams -> str.chars().anyMatch(Character::isDigit)

    <br>
* **Additionally, you want to ensure with a method that both uppercase and lowercase letters are used in the password.**
  > - .isUpperCase() & .isLowerCase() method from Character class 
  > - Java Character classes contain built-in methods like: isLowerCase() / isLowerCase()

    <br>
* **And a method should detect commonly used passwords.**

    > - After some research, there seem to be a few options:
    >  1. Creating a static list of common passwords
    >       - One person suggested creating an array to iterate through (seems painful)
    >       - Another mentioned loading the list into memory (eg HashSet) -> I need to research this more still
    >       - Found this existing text file: [10k-most-common.txt](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt)
  
    >  2. Using Regex
  
    >  3. Finding a Java Library that can do this
  
    >  4. Using an API (won't do this today since we haven't covered apis yet
  
    >  5. Hash Matching (this seems too complicated)
    >       - Use hashed common passwords and compare the hashed input for efficiency/security 


## Coding: Password Length

Now we will implement the functions test-driven.

- [x] Write a test for the method with password length.
- [x] Implement the functionality to check the password length.
- [x] Define additional test methods for different passwords. Choose an optimal number of tests from your perspective.
  
    ![First Tests](src/main/resources/images/firstTests.png)

## Coding: Digits

Now we will implement the functions test-driven.

- [x] Here too, first define a test method. It should use the method that checks if a password contains digits.
- [x] Implement the functionality.
- [x] Define additional test methods for different passwords.
    ![Second Tests](src/main/resources/images/secondTests.png)

## Coding: Uppercase and Lowercase

Now we will implement the functions test-driven.

- [x] Now write test-driven the function to ensure that both uppercase and lowercase letters are found in the password.
      ![Third Tests](src/main/resources/images/thirdTests.png)

## Coding: Commonly Used Passwords

Now we will implement the functions test-driven.

- [x] Now write the test-driven function for checking if the password contains weak passwords like 'Password1' or 'Aa345678'.
> I tried the static list idea, but it's case-sensitive and the text file I downloaded only has lowercase passwords
> Therefore: "password1" works but not "Password1" doesn't
> Will try something else if I get the time

## Coding: Bonus Task

If you are already done with the main task, you can try the bonus tasks.

- [x] Extend the password validation to check if the password contains special characters.
> regex = "[^a-zA-Z0-9]"

💡 Created extra function that validates password only with regex:
> fullRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*(),.?":{}|<>]).{8,32}$"

Explanation:

- `^`: Ensures the regex applies to the start of the string.
- `(?=.*[a-z])`: Requires at least one lowercase letter.
- `(?=.*[A-Z])`: Requires at least one uppercase letter.
- `(?=.*\d)`: Requires at least one digit.
- `(?=.*[!@#$%^&*(),.?":{}|<>])`: Requires at least one special character.
- `.{8,32}`: Limits the string length to between 8 and 32 characters.
- `$`: Ensures the regex applies to the end of the string.

## Bonus: Random Password

If you are already done with the main task, you can try the bonus tasks.

- [x] Implement a function that generates a random secure password - which meets the criteria defined in your previously defined methods every time.