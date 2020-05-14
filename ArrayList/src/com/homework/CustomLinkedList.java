package com.homework;

public class CustomLinkedList<E> implements CustomList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(E o) {

        Node newNode;
        if(size > 0) {
            newNode = new Node(null, last, o);
            last.next = newNode;
        } else {
            newNode = new Node(null, null, o);
            first = newNode;
        }
        last = newNode;

        size ++;
    }

    @Override
    public E get(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node ret = getNode(index);
        return (E)ret.value;
    }

    private Node getNode(int index) {
        Node ret = first;
        for(int i =0; i<index; i++) {
            ret = ret.next;
        }
        return ret;
    }

    @Override
    public E removeById(int index) {
      
        }

        return null;
    }

    @Override
    public boolean removeByElement(E e) {
        return false;
    }

    @Override
    public boolean remove(E o) {

        return false;
    }

    private static class Node<E> {
        E value;
        Node next;
        Node prev;

        public Node(Node next, Node prev, E value) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
