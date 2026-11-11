//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        SimpleHashMap hm = new SimpleHashMap();

        hm.set(4,5);
        hm.set(5,14);
        System.out.println("k:" + 5 + " holds v: " + hm.get(4));
        System.out.println("k:" + 14 + " holds v: " + hm.get(5));

    }
}
