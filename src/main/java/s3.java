import java.util.*;

public class s3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {//цикл забития рандомом
            list.add(new Random().nextInt(20));
        }
        for (int i = 0; i < list.size(); i++) {//цикл вывода
            System.out.print(list.get(i) + ", ");

        }
        //list.add(0,22222);

            list.sort(Comparator.reverseOrder());//обратная сортировка?
            System.out.println();
            for (int i = 0; i < 20; i++) {//цикл вывода
                System.out.print(list.get(i) + ", ");
            }
            for (int i = 0; i < list.size(); i++)
            {//цикл прохода
                if (list.get(i)%2 ==0){
                    list.remove(i);
                    i--;//забавно он и индексы двигает когда удаляет. без этой штуки он сбивается
                }


            }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {//цикл вывода
            System.out.print(list.get(i) + ", ");
        }
        int su=0;
        int max=list.get(0);
        int min=list.get(0);
        for(int i=0;i<list.size();i++){//думаю ничего страшного если мы общитаем массив без четных чисел
            if (list.get(i)>max) max = list.get(i);
            if (list.get(i)<min) min = list.get(i);
            su=su+list.get(i);
        }
        System.out.println();
        System.out.printf ("Минимальный элемент: %d\n",max);
        System.out.printf ("Минимальный элемент: %d\n",min);
        System.out.printf ("Минимальный элемент: %d\n",su);
        long begin = System.currentTimeMillis();
        for (int i =0; i<10000;i++){
            list.add(0,0);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        //System.out.println(list.size());
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 20; i++) {//цикл забития рандомом
            integers.add(new Random().nextInt(20));
        }
         begin = System.currentTimeMillis();
        for (int i =0; i<10000;i++){
            integers.addFirst(0);
        }
         end = System.currentTimeMillis();
        System.out.println(end - begin);
        list.trimToSize();

        System.out.println(list.size());
        }
    }
