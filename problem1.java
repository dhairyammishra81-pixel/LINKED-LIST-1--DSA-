import java.util.LinkedList;

public class problem1 {
    public static void main(String[] args) {
     
        LinkedList<Integer> list = new LinkedList<>();

        
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        System.out.println("Linked List: " + list);

        
        int target = 7;
        int index = list.indexOf(target);

       
        if (index != -1) {
            System.out.println("The number " + target + " is found at index: " + index);
        } else {
            System.out.println("The number " + target + " is not in the list.");
        }
    }
}
