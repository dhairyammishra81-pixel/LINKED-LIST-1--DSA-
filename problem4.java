import java.util.LinkedList;

public class problem4 {
    public static void main(String[] args) {
        // 1. Create a Linked List
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Add elements to it
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        // 3. Search for the number 7 and find its index
        int target = 7;
        int index = list.indexOf(target);

        // 4. Display the result
        if (index != -1) {
            System.out.println("The number " + target + " is at index: " + index);
        } else {
            System.out.println("The number " + target + " was not found in the list.");
        }
    }
}
