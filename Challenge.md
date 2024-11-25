# 1-Java / 11-Recap-Project-Password-Validation

## Setup: GitHub Project

Today we will write a password validation in Java! There is a lot to do, but let's proceed step by step.

* Create a new Java GitHub project. Choose a suitable name, e.g. 'passwordvalidation'. Don't start coding yet, instead create a project with minimal code (e.g. Hello World) and push it to Github. Then enter the Github URL to your repo here:
  `inputfield`

## Research: Define Signatures

Think about how the methods for password validation should look like. Discuss return values and types of parameters. Define names. However, do not implement the actual code of the individual methods in this step. The following methods are involved:

* A method that ensures a password is at least 8 characters long.
  `inputfield`
* With another method, you want to check if the password contains digits.
  `inputfield`
* Additionally, you want to ensure with a method that both uppercase and lowercase letters are used in the password.
  `inputfield`
* And a method should detect commonly used passwords.
  `inputfield`

## Coding: Password Length

Now we will implement the functions test-driven.

* Write a test for the method with password length.
* Implement the functionality to check the password length.
* Define additional test methods for different passwords. Choose an optimal number of tests from your perspective.

## Coding: Digits

Now we will implement the functions test-driven.

* Here too, first define a test method. It should use the method that checks if a password contains digits.
* Implement the functionality.
* Define additional test methods for different passwords.

## Coding: Uppercase and Lowercase

Now we will implement the functions test-driven.

* Now write test-driven the function to ensure that both uppercase and lowercase letters are found in the password.

## Coding: Commonly Used Passwords

Now we will implement the functions test-driven.

* Now write the test-driven function for checking if the password contains weak passwords like 'Password1' or 'Aa345678'.

## Coding: Bonus Task

If you are already done with the main task, you can try the bonus tasks.

* Extend the password validation to check if the password contains special characters.

## Bonus: Random Password

If you are already done with the main task, you can try the bonus tasks.

* Implement a function that generates a random secure password - which meets the criteria defined in your previously defined methods every time.