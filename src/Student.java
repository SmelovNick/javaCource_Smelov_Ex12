public class Student {
    String fullName;
    int age;
    String eduGroup;

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

    public String getEduGroup() {
        return eduGroup;
    }

    public void setEduGroup(String eduGroup) {
        this.eduGroup = eduGroup;
    }


    public Student(String fullName, int age, String eduGroup) {
        this.fullName = fullName;
        this.age = age;
        this.eduGroup = eduGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", eduGroup='" + eduGroup + '\'' +
                '}';
    }
}
