import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {

        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        int esc = 0;
        while (esc==0){
            esc = 1;
            System.out.println("Введите фамилию следующего игрока");
            Scanner q = new Scanner(System.in);
            String in = q.nextLine();
            System.out.println(in);
            family.add(String.valueOf(q));



            System.out.println("если хотите ввести еще одного игорака введите что угодно, если вы закончили введите -1- ");
            //q = new Scanner(System.in);
            String in1 = q.nextLine();

            String perevod = String.valueOf(in1);
            // String perevod2 = "да";

            while (perevod == "да" ){
                System.out.println("если вы закончили напишите -да-");
                esc = 0;
                perevod = "да";

            }

        }
        //System.out.println(age.get(0));
        for (int i = 0; i < family.size(); i++) {//цикл вывода
            System.out.print(family.get(i) + " "+name.get(i) + " "+soname.get(i) + " "+age.get(i) + " ");
            System.out.println("asd");
        }




    }
}
