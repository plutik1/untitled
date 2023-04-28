import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        int in2 = 0;//возраст
        Scanner q = new Scanner(System.in);
        String int3 = "asd";// приведение к стрингу
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        int esc = 0;
        String itog = "";
        String itog1="";
        while (esc==0){

            System.out.println("Введите фамилию следующего игрока");
            //     System.out.println(family.get(esc));
            String in = q.nextLine();
            family.add(in);
            //System.out.println(family.get(esc));
            System.out.println("Введите имя следующего игрока");
            in = q.nextLine();
            name.add(in);
            System.out.println("Введите отчество следующего игрока");
            in = q.nextLine();
            soname.add(in);
            System.out.println("Введите возраст следующего игрока СДЕЛАТЬ ОБВЯЗКУ НА ИНТ");
            in = q.nextLine();

            in2 = Integer.parseInt(in);

            age.add(in2);

            System.out.println("если вы хотите ввести еще одного напишите -1- Сделать обволочку ни проверку инта");
            //q = new Scanner(System.in);
            String in1 = q.nextLine();

            Integer perevod = Integer.parseInt(in1);
            // String perevod2 = "да";
            esc = esc+1;
            while (perevod == 1 ){
                //System.out.println("влетели в цикл");
                esc = 0;
                perevod = 5;

            }

        }
        //System.out.println(family.size());
        for (int i = 0; i < family.size(); i++) {//цикл вывода
            System.out.println(""+ i+" игрок");
            System.out.print(family.get(i)+" "+name.get(i)+" "+soname.get(i)+" "+age.get(i)+" ");
            System.out.println();
            itog = family.get(i)+" "+name.get(i)+" "+soname.get(i)+" "+age.get(i)+"\n";
            itog1=itog1+itog;
            System.out.println(itog1);
        }
        File file = new File("testfile");
        try {
            PrintWriter pw = new PrintWriter (file);
            pw.println(itog1);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){

                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}