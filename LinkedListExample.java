import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //creating object of the class linkedlist
        LinkedList<String> ll = new LinkedList<String>();

        //Adding elements to the linked list
        ll.add("Hey, ");
        ll.add("I am ");
        ll.add("John ");
        ll.add(" ");
        ll.add("Nice ");
        ll.add("to meet");
        ll.add("you");

        //renaming element to a particular index
        //using set method to set object
        ll.set(3,"Smith");

        System.out.println("Initial LinkedList: "+ ll);

        //removing elements from a linkedList
        ll.remove(3);
        System.out.println("After removal object of index 3: "+ ll);

       /*
        Iterating through the linked list
         */
        //using the get method and for loop

        for (int i =0; i < ll.size(); i++){
            System.out.print(ll.get(i) + " ");
        }

        System.out.println();
        //using the for each loop
        for (String obj:ll ) {
            System.out.print(obj + " ");
        }
        System.out.println();

        //adding existing linkedlist to another new list
        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.addAll(ll);
        ll2.add("This is an extra element");
        System.out.println(ll2);

    }
}
