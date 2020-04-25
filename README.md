# ArrayList-
A program that utlizes ArrayList

Programming Project 2 Part A – ArrayLists

Part A - ArrayLists

The goal of this part of the assignment is to learn about ArrayLists. You will be reading a list of people
from a file. You will then build an ArrayList, remove and add elements, and implement Comparable.
For this part of the assignment you may only use ArrayLists and features taught in Chapter 10. You may
only use Chapter 10 ArrayList functions, not Chapter 11 Iterator/Set/Map classes.

Problem Description
Your program should read and process members from a file to add, remove and sort members.
Implementation Requirements

• Your program should implement and utilize Person ADT. Use the provided Person.java and
Membership_Processor.java as a starter class files, you are welcome to add additional methods
but don’t modify the existing methods, unless you are instructed to do so.

• Your program should load the data from the provided members.csv, removes.csv and adds.csv
text files. The data fields are comma separated. Feel free to open this file and explore to
understand the format of the data. However, don’t edit the names of the files, format or the
contents. Assume that the files in the “current” directory (same location as this project), so as not
to add any drive or path to the filenames.

• Basic Functionality
o Modify readNames() to create an ArrayList of Persons where indicated, and return it at
the end. The readNames function is “hard coded” to read a specific filename. You are to
modify this function to accept a parameter of a String filename, so it can be used for any
filename. Modify its caller so that the function sworks on “members.csv”. Make sure to
update its Javadoc header accordingly.

o Modify readNames() to store each Person where indicated.
o Verify that your code read 450 names.
• Remove Names
o Add a new call to readNames (“removes.csv”). Call this returned ArrayList “removes”.
o Add a print “Read Total of <#> removes” to verify you read 10 removes.

o In the next steps you will take each of the removes, look for it in the membership, and
remove it if found or print an error if not found. For Person class objects, we choose to
use email names to test for equality because these are unique to a Person.

o Run the code. Did you find any of the 10 names to delete?

o Implement the Comparable interface on the Person class. Modify the Person class
declaration to tell Java it will support the Comparable interface. Note this is
“parameterized” which means you need to put the object type in the <> brackets just like
you do for ArrayList. Note the red ‘x’ reminding you that you must now add the
compareTo method to the Person class. You must exactly match the compareTo interface
definition (function name, parameters, return type). Test only the email field and match
the compareTo interface return type definition. Now, replace .equals with .compareTo in
your nested loops written above for removed in the above step.

o Add a print statement “Total of <#> names after removals” and verify you removed 10
Persons and now only have 440 left.

• Add Names

o Add another new call to readNames (“adds.csv”). Call this returned ArrayList “adds”.
o Add a print statement “Read Total of <#> adds” and verify you read 5 adds.

o Write another loop similar to removes. For each member to be added, check for an
existing member with the same last name only, and add it immediately after that
member. Note this is a different criterion than used for the removes. Make sure to only
add each name once. Print a message if you can’t find a name and include the email
name you’re adding.

o Print out “Total of <#> names after adding” and verify it’s 445.

• Sort

o Now that you have implemented Comparable you can sort the list without having to
write almost anything. Write the code to use the Collections class to sort the ArrayList.

• Check your work

o Add a call from partA() to testPartA() to double check your work. This is similar to the
types of tests PracticeIt runs on your code. If you have errors use the debugger to see
where the problem is exactly in your data and work backwards to fix.

o Check the total number of names is correct at each step
o Check your compareTo is sorting based on email names
o Check you are not accidentally insert or removing more than once (there are names to
trip you up if you should not take care of this)

• Use intelligent variable names. Intelligently naming all your variables can make the difference
between readable bug-free code and illegible broken code. By convention, classes should begin
with Uppercase letters, while regular variables should begin with lowercase letters.

• Comment your code. Use Javadoc comments for Class and Method titles. Use line comments (//)
for commenting individual lines of code.

• For submitting, attach your Java file(s) using the assignment submission tool. Datafiles are not
required.

Use the following step-by-step Project Initial Setup instructions as needed.

• Create new Java Project “Person”, and create a new Java Classes “Person” and
“Membership_Processor”

• Download the provided Person.java and Membership_Processor.java files. Open the files in
either Notepad or Eclipse and copy / paste to replace the entire body of the new classes created
in the above step. Note that if you don’t perform these steps Java isn’t going to be able to run
this file because you’ll be working on a disembodied .JAVA file not attached to any project.

• Download the members.CSV file provided. Drop this file into the same directory as this project
folder (Person).

• Run the project to ensure you completed the previous steps correctly. It won’t read any names
yet. If you crash, you likely didn’t place the Members.CSV file into the correct directory. Delete
the data file and repeat the above step and verify that .CSV file is in the same folder as the
project folder
