import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //Task 1
        for (int i = 21; i > 12; i--) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        //Task 2
        arrayList.remove(2);

       for (int i = 0; i < arrayList.size() / 2; i++) {
           int temp = arrayList.get(i);
           arrayList.set(i, arrayList.get(arrayList.size()-1-i));
           arrayList.set(arrayList.size()-i-1, temp);
       }


        System.out.println(arrayList);
    }
}