package se.lexicon.SpringWorkshop.models;

public class Student {
    private int id;
    private String name;
    private static int nr = 0;

    public Student(String name) {
        this.name = name;
        this.id = ++nr;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
