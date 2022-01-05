package Assignments;

public class Assignment3 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Teacher t = new Teacher();
        Batch b = new Batch();
        s1.setName("Sagar Toamr");
        s1.setAge(22);
        s1.setEmail("Sagartomar111@gmail.com");

        System.out.println("Student name is:" + s1.getName());
        System.out.println("Student age is:" + s1.getAge());
        System.out.println("Student email is:" + s1.getEmail());

        t.setTeacherName("Santosh");
        t.setTeacherAge(46);
        t.setTeacherEmail("Santoshkumar111@gmail.com");

        System.out.println("Teacher name is:" + t.getTeacherName());
        System.out.println("Teacher age is:" + t.getTeacherAge());
        System.out.println("Teacher email is:" + t.getTeacherEmail());

        Batch b1 = new Batch();

        Student[] students = { s1 };
        b.setStudents(students);
        b1.setTeacher(t);
        b1.setBatchName("JAN-2022");

    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int age;
    private String email;
    private String address;

    Student() {
        System.out.println("student default constructor");
    }

}

class Teacher {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private int age;
    private String email;
    private String address;

    Teacher() {
        System.out.println("teacher default constructor");
    }

    public void setTeacherName(String name) {
        this.name = name;
    }

    public void setTeacherAge(int age) {
        this.age = age;
    }

    public void setTeacherEmail(String email) {
        this.email = email;
    }

    public void setTeacherAddress(String address) {
        this.address = address;
    }

    public String getTeacherName() {
        return name;
    }

    public int getTeacherAge() {
        return age;
    }

    public String getTeacherEmail() {
        return email;
    }

    public String getTeacherAddress() {
        return address;
    }

}

class Batch {
    public char[] getTeacher;
    private String name;
    private int size;
    private Student[] students;
    private Teacher teacher;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Batch() {
        System.out.println("batch class default constructor");
    }

    public void setBatchName(String name) {
        this.name = name;

    }

    public void setBatchSize(int size) {
        this.size = size;
    }

    public String getBatchName(String name) {
        return name;

    }

    public int getBatchSize(int size) {
        return size;
    }

}