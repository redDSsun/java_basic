package serialize;

import java.io.Serializable;

public class Student implements Serializable{
    String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "studet's name is "+name;
    }
}
