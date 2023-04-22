public class s2 {
    public static void main(String[] args) {
        String a= "we";
        long begin = System.currentTimeMillis();
        for (int i=0; i<10000;i++){
            a= a+Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        StringBuilder b = new StringBuilder ("we");
         begin = System.currentTimeMillis();
        for (int i=0; i<10000;i++){
            b.append(Character.getName(i));
        }
        end =System.currentTimeMillis();
        System.out.println(end - begin);
    }

}
