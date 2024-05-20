import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        getTimeMsOfInsert(new ArrayList());
        //getTimeMsOfInsert(new LinkedList());
    }

    public static float getTimeMsOfInsert(List list) {
        for (int i = 0; i < 5_000_000; i++) {
            list.add(i);
        }
        Date currentTime = new Date();
       // System.out.println(currentTime.getTime());
        insert1000000(list);
        Date newTime = new Date();
        float msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Результат в секундах: " + msDelay/1000);
        return msDelay;

    }

    public static void insert1000000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(list.size()-2, 123);
        }
    }
}
