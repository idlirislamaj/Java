package redischool.Lesson13;

public class Person implements Comparable<Person>{
    String name;
    int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    //Used Comparable by age for exercise purposes
    @Override
    public int compareTo(Person person) {
        if(this.getAge() > person.getAge()){
            return 1;
        }else if(this.getAge() < person.getAge()){
            return -1;
        }else{return 0;}
    }
}
