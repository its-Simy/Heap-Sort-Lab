import java.util.PriorityQueue;
import java.util.Random;

public class Main {

    public static void heapsort(int[] a) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < a.length; i++) {
            heap.add(a[i]);
        }
        int min;
        int sortedNextOpen = 0;
        //Checks if the heap is empty
        while (!heap.isEmpty()){
            min = heap.remove();
            a[sortedNextOpen] = min;
            sortedNextOpen++;
        }

    }//end of heapsort method

    public static void main(String[] args) {
        /*
        Part 1
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        while(!pq.isEmpty()){
        System.out.println(pq.remove());
        }
        */

        int[] a = new int[]{
                60,30,20,50,40,10
        };

        System.out.println("The following is the unsorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        heapsort(a);
        System.out.println("\nThe following is the sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();


        Random rand = new Random();
        int[] data = new int[100];
         int randomNum = rand.nextInt(1000); //generates 0-999 random integers
        System.out.println("The following is the unsorted array: ");
         for (int i = 0; i < data.length; i++) {
             data[i] = randomNum;
             randomNum = rand.nextInt(1000);
             System.out.print(data[i] + " ");
         }
         heapsort(data);
        System.out.println("\n\nThe following is the sorted array: ");
         for (int i = 0; i < data.length; i++) {
             System.out.print(data[i] + " ");
         }








    }//end of Main method
}//End of Main Class
