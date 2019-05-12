//Ryan Draper, TTh 4-5pm
package deque;

public class Deque<Item> {

    private Node first;
    private Node last;
    private int N;

    private class Node {

        Item item;
        Node previous;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insertAtStart(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.previous = null;
        if (isEmpty()) {
            last = first;
        } else {
            first.next = oldfirst;
            oldfirst.previous = first;
        }
        N++;
    }

    public void insertAtEnd(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
            last.previous = oldlast;
        }
        N++;
    }

    public Item removeFromStart() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    public Item removeFromEnd() {
        Item item = last.item;
        last = last.previous;
        last.next = null;
        if (isEmpty()) {
            first = null;
        }
        N--;
        return item;
    }

    public void insertBefore(Item spot, Item insert) {
        Node current = first;
        Node prev = null;
        if (first != null) {
            while (current != null) {
                if (current.item.equals(spot)) {
                    Node n = new Node();
                    n.item = insert;
                    n.next = current;
                    if (prev != null) {
                        prev.next = n;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }

    public void insertAfter(Item spot, Item insert) {
        Node current = first;
        Node prev = null;
        if (first != null) {
            while (current != null) {
                if (current.item.equals(spot)) {
                    Node n = new Node();
                    n.item = insert;
                    n.next = current.next;
                    current.next = n;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }

    public void removeNode(Item item) {
        Node current = first;
        Node prev = null;
        if (current != null && current.item == item) {
            first = current.next;
            return;
        }
        while (current != null && current.item != item) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        prev.next = current.next;
    }

    public void moveToFront(Item item) {
        removeNode(item);
        insertAtStart(item);
    }

    public void moveToEnd(Item item) {
        removeNode(item);
        insertAtEnd(item);
    }

    public void print() {
        for (Node x = first; x != null; x = x.next) {
            System.out.println(x.item.toString());
        }
    }

}
