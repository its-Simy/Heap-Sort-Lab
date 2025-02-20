import java.util.PriorityQueue;
import java.util.Random;

public class Main {

    public static void heapsort(int[] a) {
        int[] heap = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            heap[i] = a[i];
        }
        int sortedNextOpen = 0;
        int min;
        //The following will work as a get Min;
        for (int i = 1; i < heap.length; i++) {
            min = heap[i];
            for (int j = i; j > sortedNextOpen; j--) {
                if (heap[j] < min) {
                    min = heap[j];
                }
            }

        }
    }//end of heapsort method

    public int getMin(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }//end of the getMin Method

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


        Random rand = new Random();
        int[] data = new int[5];
         int randomNum = rand.nextInt(1000); //generates 0-999 random integers
         for (int i = 0; i < 5; i++) {
             data[i] = randomNum;
             randomNum = rand.nextInt(1000);
         }
         heapsort(data);




    }//end of Main method
}//End of Main Class
