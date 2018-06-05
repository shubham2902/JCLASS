

public final class Person implements Comparable<Person> {

 private String name;

 public Person(String name) {
  this.name = name;
 }

 public String name() {
  return name;
 }

 @Override
 public int compareTo(Person otherObject) {
  return this.name.compareTo(otherObject.name);
 }
}