package modal;

import java.util.ArrayList;

public class Child extends Parent{
    public String f_name;
    public ArrayList<Hobbies> hobbies;
    public int age;

    public Child(String f_name, ArrayList<Hobbies> hobbies, int age) {
        this.f_name = f_name;
        this.hobbies = hobbies;
        this.age = age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public ArrayList<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+this.f_name +" "+Familyname);
        System.out.println("Home Town: "+Homeaddress);
        System.out.println("Hobbies: ");

    }
}
