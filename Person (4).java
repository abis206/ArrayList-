import java.util.*;
import java.io.*;

/**
* Programming Project 1B- ArrayLists
* 
*
* Abas Hersi
*
*/

/**
* Represents a person - first, last, email
* Implemented Comparable<Person> interface for comparing emails of Person class
*
*/
public class Person implements Comparable<Person>{
private String firstName;
private String lastName;
private String email;

public Person(String firstName, String lastName, String email) {
this.firstName = firstName;
this.lastName = lastName;
this.email = email;
}

/**
* @return the firstName
*/
public String getFirstName() {
return this.firstName;
}

/**
* @param firstName the firstName to set
*/
public void setFirstName(String firstName) {
this.firstName = firstName;
}

/**
* @return the lastName
*/
public String getLastName() {
return this.lastName;
}

/**
* @param lastName the lastName to set
*/
public void setLastName(String lastName) {
this.lastName = lastName;
}

/**
* @return the email
*/
public String getEmail() {
return this.email;
}

/**
* @param email the email to set
*/
public void setEmail(String email) {
this.email = email;
}

/**
* Print out the name
*/

public String toString() {
return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + "]";
}


/**
*
* @param `person` object
* @return integer value by comparing person object email with existing value
*/
@Override
public int compareTo(Person o) {
int last = this.email.compareTo(o.email);
//Sorting by first name if last name is same d
return last == 0 ? this.email.compareTo(o.email) : last;
}
}