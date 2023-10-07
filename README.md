# TotalNumberA
Checks the Total Number of A's in a String and includes Test cases for all States and all Transitions. for Midterm exam

5.	This question requires you to use the following specification for processing a string that computes the total number of A’s in the string. Note the string may contain any character. You are required to use the following specification when computing the total number of A’s in a string.								[40]
private void incrTotalAs() – increments the total number of A’s
public int getTotalAs() – returns the total of A’s 
public void processString(String) – passes in a string and processes it	 
You may only use the following operations associated with the String type – charAt(int) and length()
State any assumptions you make when answering this question.
(a)	Draw a state machine using the specification above to process the string. Use StarUML to draw your state machine (statechart), copy and paste the state machine into this document. You are required to submit the StarUML file with the state machine along with the answer sheet in a zipped file. 
(b)	Write test cases that satisfy all states and all transitions criteria using the state machine in (a).
(c)	Using the Eclipse IDE (or other IDE), write well-documented code for a class (Q5Class) that processes a String as specified above.
(d)	Write well-documented JUnit test cases in two classes (Q5AllStatesTests – containing only test cases for all states, and Q5AllTransTests – containing only test cases for all transitions) for the test criteria in part (b) in the Eclipse environment (or another environment) and test the class Q5Class. Copy and paste the code for the Q5Class and the associated test classes (Q5AllStatesTests and Q5AllTransTests) into this document. 
(e)	Copy the results after running the Q5AllStatesTests and Q5AllTransTests and place the screenshots showing the results into this document using an appropriate screen capture approach. 
Please label your answers to this question correctly.


All States
Test Name: S2 Processing String
Test Case ID: TotalA-SysTest-01
Purpose: To cover when the list is not empty and processes the list
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“AAB”);
Expected Output: Total = 2

Test Name: S3 Increment Total
Test Case ID: TotalA-SysTest-02
Purpose: To cover when A is found to make sure it increments to the total
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“AAA”);
Expected Output: Total = 3

Test Name: S4 Return Total
Test Case ID: TotalA-SysTest-03
Purpose: To cover that the list processes and returns a correct total
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“ABC”);
Expected Output: Total = 1

All Transitions

Test Name: T1 Setup
Test Case ID: TotalA-SysTest-04
Purpose: To start the process and to be sure that total starts at 0
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“A”);
Expected Output: Total = 1

Test Name: T2 [processString()]
Test Case ID: TotalA-SysTest-05
Purpose: To cover that the process begins with a String found
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“ABC”);
Expected Output: Total = 1

Test Name: T3 [if (charAt(i) == ‘A’ && I < length()]
Test Case ID: TotalA-SysTest-06
Purpose: To cover that the next character in the String is A
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“AABA”);
Expected Output: Total = 3

Test Name: T4 [incrTotalAs()]
Test Case ID: TotalA-SysTest-07
Purpose: To cover that only an A count will increment the total
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“AACAAA”);
Expected Output: Total = 5

Test Name: T5 [if (charAt(i) != ‘A’ && I < length()]
Test Case ID: TotalA-SysTest-08
Purpose: To cover that if the next character in the String is NOT an A then proceed to the following without incrementing to the total
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“BABBC”);
Expected Output: Total = 1




Test Name: T6 [!(i < length)]
Test Case ID: TotalA-SysTest-09
Purpose: To cover that when the String runs out of characters that the process will end to get ready to return the total
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“ABCABC”);
Expected Output: Total = 2

Test Name: T7 [getTotalAs()]
Test Case ID: TotalA-SysTest-10
Purpose: To cover that the process ends successfully returning the total number of As in the list
Test Case Setup: Q5Class q5 = new Q5Class();
Input: q5.processString(“ABACAD”);
Expected Output: Total = 3
