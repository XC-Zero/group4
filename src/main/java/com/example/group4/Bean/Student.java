package com.example.group4.Bean;

public class Student {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentUtils{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", Student_id=").append(Student_id);
        sb.append(", Password='").append(Password).append('\'');
        sb.append(", Age=").append(Age);
        sb.append(", Email='").append(Email).append('\'');
        sb.append(", PhoneNumber=").append(PhoneNumber);
        sb.append('}');
        return sb.toString();
    }

    private String Name;
    private int Student_id;
    private String Password;
    private int Age;
    private String Email;
    private int PhoneNumber;
}
