//Ryan Draper, TTh 4-5pm
package deque;

public class Tester {

    public static void main(String[] args) {
        Deque<String> deck = new Deque<>();
        System.out.println("Inserting at Start:");
        deck.insertAtStart("one");
        deck.print();
        System.out.println("\nInserting at End:");
        deck.insertAtEnd("nine");
        deck.print();
        System.out.println("\nInserting at End:");
        deck.insertAtEnd("ten");
        deck.print();
        System.out.println("\nInserting at Start:");
        deck.insertAtStart("zero");
        deck.print();
        System.out.println("\nRemoving from Start:");
        deck.removeFromStart();
        deck.print();
        System.out.println("\nRemoving from End:");
        deck.removeFromEnd();
        deck.print();
        System.out.println("\nInserting Before nine:");
        deck.insertBefore("nine", "seven");
        deck.print();
        System.out.println("\nInserting After seven:");
        deck.insertAfter("seven", "eight");
        deck.print();
        System.out.println("\nRemoving seven:");
        deck.removeNode("seven");
        deck.print();
        System.out.println("\nMoving eight to front:");
        deck.moveToFront("eight");
        deck.print();
        System.out.println("\nMoving one to end:");
        deck.moveToEnd("one");
        deck.print();
    }
}

/* SAMPLE OUTPUT:
Inserting at Start:
one

Inserting at End:
one
nine

Inserting at End:
one
nine
ten

Inserting at Start:
zero
one
nine
ten

Removing from Start:
one
nine
ten

Removing from End:
one
nine

Inserting Before nine:
one
seven
nine

Inserting After seven:
one
seven
eight
nine

Removing seven:
one
eight
nine

Moving eight to front:
eight
one
nine

Moving one to end:
eight
nine
one
*/