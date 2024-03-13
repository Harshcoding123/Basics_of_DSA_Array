import java.util.*;
public class arrayListrev {
    public static void main(String[] args) {
        ArrayList<Integer>l= new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(2);
        l.add(7);
        l.add(4);
        l.add(50);
        System.out.println(l);
        l.add(2,50);
        System.out.println(l);
//        System.out.println(l);
//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        int x= l.get(2);
//        System.out.println(l.size());
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
        l.set(1,20);
        System.out.println(l);
        l.remove(4);
        System.out.println(l);
        l.remove(Integer.valueOf(50));
        System.out.println(l);
        boolean ans= l.contains(50);
        System.out.println(ans);
        ArrayList l1= new ArrayList();
        l1.add("hello");
        l1.add(23);
        l1.add("*");
        System.out.println(l1);
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);


        }
    }

