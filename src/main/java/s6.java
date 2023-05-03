import java.util.HashMap;

public class s6
{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("1","ОДИН");
        map.put("2","ДВА");
        map.put("3","ТРИ");
        map.put("4","ЧЕТЫРЕ");
        map.put("5","ПЯТЬ");
        map.put("6","ШЕСТЬ");
        map.forEach ((k,v)-> System.out.println(k+ " "+v));
for (String key: map.keySet()) {
    map.compute(key, (k,v)->v+"!");
}
        System.out.println();
        map.forEach ((k,v)-> System.out.println(k+ " "+v));
        HashMap<String, String> map1 = new HashMap();
        map1.put("7","семь");
        map1.put("8","восемь");
        map1.put("3","ТРИ_c другого множества");

        HashMap<String, String> map2 = new HashMap();
        System.out.println();
        map2.putAll(map);
        System.out.println();
        map2.forEach ((k,v)-> System.out.println(k+ " "+v));
        System.out.println();
        map2.putAll(map1);
        map2.forEach ((k,v)-> System.out.println(k+ " "+v));
    }
}
