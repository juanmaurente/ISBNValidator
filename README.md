# ISBNValidator

- This is part of a of the course Practical Test-Driven Development for Java Programmers on Linkedin. It provides a generic example of how to write JUnit tests for a specific method.
- The method being tested is the checkISBN method of a validator object, which is used to validate International Standard Book Numbers (ISBNs).
The class includes two test methods, checkAnInvalidLengthOfAnISBN and nonNumericISBNAreNotAllowed, which are used to demonstrate how to test whether the checkISBN method correctly handles invalid input.
- The first test method checks whether an ISBN with an invalid length of 12 characters throws a NumberFormatException, while the second test method checks whether non-numeric ISBNs throw a NumberFormatException.
- The class also includes comments on other assertions that can be used in JUnit tests, such as assertNotNull(value), assertEquals(myExpectedResult, myResult), and assertThat(myResult, condition).
- Please note that this class is intended as an example for the TDD course on LinkedIn and can be adapted to other testing scenarios.
