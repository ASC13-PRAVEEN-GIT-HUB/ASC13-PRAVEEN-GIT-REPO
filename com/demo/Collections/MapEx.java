package com.demo.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;


public class MapEx {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
//            Map<Object,Object> map1 = new HashMap<Object,Object>();
        Map<Object,Object> map1 = new TreeMap<Object,Object>();

        Laptop laptop1 = new Laptop("Inspirion", 70000);
        Laptop laptop2 = new Laptop("Thinkpad", 65000);
        map1.put("HP", laptop1);
        String laptopBrand = "Lenovo";
        map1.put(laptopBrand, laptop2);
        map1.put("null", new Laptop("tuf", 10));
        map1.put("null", new Laptop("viao",10));
//            map1.put(null, new Laptop("pavilion",10));
//            map1.put(null, new Laptop("rog", 10));

        System.out.println(map1);

        System.out.println("---------------------------------");
//            Collection<Object> values = map1.values();
//            for (Object value : values) {
//                System.out.println(value);
//            }
//            for (Object value : map1.values()) {
//                System.out.println(value);
//            }

        Iterator<Map.Entry<Object,Object>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
        }

    }

}

class Laptop {
    String laptopName;
    float price;

    public Laptop (String laptopNameParam, float priceParam) {
        laptopName = laptopNameParam;
        price = priceParam;
    }

    @Override
    public String toString() {
        return "Laptop [laptop name: "+laptopName+", laptop price is Rs. "+price+"]";
    }
}