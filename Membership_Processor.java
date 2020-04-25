import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Membership_Processor{

	public static void main(String[] args) throws FileNotFoundException {
		PartA();
    }

/**
* This methods reads all of this individuals within members and  remove files. than it removes
* the people within members file who are also in the members list. Than it adds the names of the add to 
* the members list.
* 
*/
public static void PartA() throws FileNotFoundException {
ArrayList<Person> membership = readNames("members.csv");

System.out.println(String.format("Read Total of %d names", membership.size()));

ArrayList<Person> removes = readNames("removes.csv");

System.out.println(String.format("Read Total of %d removes", removes.size()));

for (Person person:removes){
Person person1 = membership.stream().filter(p->p.getEmail().compareTo(person.getEmail())==0).findFirst().orElse(null);
if(null != person1){
membership.remove(person1);
}else {
System.out.println("Error: Person not found");
}
}
System.out.println(String.format("Total of %d names after removal", membership.size()));

ArrayList<Person> adds = readNames("adds.csv");

System.out.println(String.format("Read Total of %d adds", adds.size()));

for (Person person:adds){
Person person1 = membership.stream()
.filter(p->p.getLastName().compareTo(person.getLastName())==0)
.findFirst().orElse(null);
if(null != person1){
membership.add(person);
}else {
System.out.println("error: Person not found");
}
}
System.out.println(String.format("Total of %d names after adding", membership.size()));

Collections.sort(membership);

testPartA(membership);

}

/**
*
* This method collects all of the filenames and returns them in the method of an arraylist.
*/
public static ArrayList<Person> readNames(String fileName) throws FileNotFoundException {
// Open scanner on file "filename"
File f = new File(fileName);
Scanner sc = new Scanner(f);

// created ArrayList of Person class variable p
List<Person> personArrayList = new ArrayList<>();

// Discard first line - it's the headers "first_name last_name email" etc
sc.nextLine();

// Loop through lines of the file
while (sc.hasNextLine()) {

// Get the next line
String line = sc.nextLine();
Scanner scLine = new Scanner(line);

// This allows us to use comma as the delimiter instead of whitespace
scLine.useDelimiter(",");

// Scan the line for the names & emails
String first = scLine.next();
String last = scLine.next();
String email = scLine.next();

//Creating person object to arraylist
Person person = new Person(first,last,email);
personArrayList.add(person);
}

// returning the ArrayList you defined
return new ArrayList<Person>(personArrayList);
}

/**
* Testing code - do not modify
*
* @param membership
*/
public static void testPartA(ArrayList<Person> membership) {
// Test for correct total # of names
if (membership.size() != 445) {
System.out.println("Wrong number of names. There should be 445 after all removals and adds");
return;
}

// Test all 10 names removed
for (Person p : membership) {
if (p.getEmail().contains("-")) {
System.out.println(String.format("Oops - didn't remove person %s %s %s", p.getFirstName(),
p.getLastName(), p.getEmail()));
return;
}
}

// Test that only 5 names added
int count = 0;
for (Person p : membership) {
if (p.getEmail().contains("*"))
count++;
}
if (count != 5) {
System.out.println("didn't add the right number of names");
return;
}

// Check sorting & overall work at specific random items
int[] memberIndexes = { 0, 10, 20, 30, 40, 400 };
String[] expectedEmails = { "bill_frey@frey.com*", "alaine_bergesen@cox.net", "amber_monarrez@monarrez.org",
"apinilla@cox.net", "barrett.toyama@toyama.org", "tasia_andreason@yahoo.com" };
for (int i = 0; i < memberIndexes.length; i++) {
String memberEmail = membership.get(memberIndexes[i]).getEmail();
if (!memberEmail.equals(expectedEmails[i]))
System.out.println(String.format("Index %d expected %s but found %s", memberIndexes[i],
expectedEmails[i], memberEmail));
}

System.out.println("You passed all tests");
}
}

