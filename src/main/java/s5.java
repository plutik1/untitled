import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// import java.util.Comparator;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class s5
{
    public static void main(String[] args) throws IOException{
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> age1 = new ArrayList<>();
        //String [] str = new String[4];
        int inte = 0;
int sort=0;
        int sort2=0;
        File file = new File("testfile");
        Scanner scanner= new Scanner(file);
        String in = " ";
        while(scanner.hasNextLine()){

           // System.out.println(scanner.nextLine());// так а почему из за этой строчки все идет по одному месту?
            in = scanner.nextLine();
            System.out.println(in);
            String[] str = in.split(" ");

                family.add(str[0] + " ");
                name.add(str[1] + " ");
                soname.add(str[2] + " ");
                inte = Integer.parseInt(str[3]);
                age.add(inte);
                age1.add(inte);

        }
scanner.close();
        for (int i = 0; i<name.size();i++) {
       System.out.println(age.get(i));
        }

        age.sort(Comparator.naturalOrder());
        for (int i = 0; i<name.size();i++) {
            System.out.println(age.get(i));//АГЕ 1 отсортированный
        }
        for (int i = 0; i<age.size();i++) {
            sort= age.get(i);
            //System.out.print(age.size());
            for (int j = 0; j<age1.size();j++) {
                sort2= age1.get(j);
                if (sort2==sort) {
                    System.out.print(family.get(j));
                   System.out.print(name.get(j));
                    System.out.print(soname.get(j));
                    System.out.print(age.get(i));
                    System.out.println("");
                }
            }
        }
        }

    }





