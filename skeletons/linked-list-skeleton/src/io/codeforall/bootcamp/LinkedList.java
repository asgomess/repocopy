package io.codeforall.bootcamp;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    /**
     * Obtain the number of data elements on the list
     *
     * @return the current size of the list
     */
    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(Object data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Returns the data element at the specified index
     *
     * @param index index of the element to return
     * @return the returned element or null if not found
     */
    public Object get(int index) {

        throw new UnsupportedOperationException();
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

        throw new UnsupportedOperationException();
    }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        throw new UnsupportedOperationException();

    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
