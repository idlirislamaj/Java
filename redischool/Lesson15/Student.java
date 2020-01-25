package redischool.Lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.id == ((Student) obj).id && this.name.equals(((Student) obj).name)){
            return true;
        }else{
            return false;
        }
    }
}
