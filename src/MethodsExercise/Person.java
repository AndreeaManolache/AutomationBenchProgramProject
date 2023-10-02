package MethodsExercise;

public class Person {
    String firstName;
    String lastName;
    int age;
    String fullName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen(){
        if (age > 12 && age<20)
            return true;
        else
            return false;
    }
    public String getFullName(){
        fullName=this.firstName + " " + this.lastName;
        return fullName;
    }
}
