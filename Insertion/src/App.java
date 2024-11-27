import java.util.ArrayList;
import java.util.Random;

public class App{
    
    public static void main(String[] args) throws Exception {
       ArrayList<Hero> list = createWarteListe(10);
       InsertionSort(list);
    }

    static ArrayList<Hero> createWarteListe(int size){
        Random ran = new Random();
        ArrayList<Hero> list = new ArrayList<Hero>();
        for(int i = 0; i < size; i++){
            list.add(new Hero(ran.nextInt(1, 100)));
        }
        return list;
    }

    static void printList(ArrayList<Hero> list){
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i).getHealth());
            System.out.print("  ");
        }
        System.out.println();
    }

    static void InsertionSort(ArrayList<Hero> list){
        for(int i = 0; i < list.size(); i++){
            printList(list);
            int j;
            for(j = i; j > 0 && (list.get(j-1).compareTo(list.get(i)) > 0);j--);
            list.add(j, list.get(i));
            list.remove(i + 1);
        }
        printList(list);
    }
}
