import modal.Child;
import modal.Hobbies;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hobbies> c1_list = new ArrayList<>();
        Hobbies h1 = new Hobbies("Cricket");
        Hobbies h2 = new Hobbies("Chess");

        c1_list.add(h1);
        c1_list.add(h2);

        Child c1 = new Child("Utsav",c1_list,17);

        c1.display();
        
        for(int i = 0 ; i< c1_list.size(); i++) {
            Hobbies cc = c1_list.get(i);
            System.out.println(cc.getHobbies());
        }
    }
}
