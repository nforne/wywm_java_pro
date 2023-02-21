package gamePackages;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String[] residence;
    public Profession profession;
    public Person(String firstName, String lastName, int age, String[] residence, Profession profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
        this.profession = profession;
    }

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

    public String[] getResidence() {
        return residence;
    }

    public void setResidence(String[] residence) {
        this.residence = residence;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }


}