public class Person {
    private String fullName;
    private int age;
    private int birthYear;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String fullName, int age, int birthYear) {
        this.fullName = fullName;
        this.age = age;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                '}';
    }
}
