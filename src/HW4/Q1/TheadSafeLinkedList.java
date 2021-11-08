package HW4.Q1;

import java.util.LinkedList;

public class TheadSafeLinkedList {
    private LinkedList<Integer> list;

    public TheadSafeLinkedList() {
        this.list = new LinkedList<>();
    }


    public void addAtPosition(int index, int element) {
        synchronized (Main.object) {
            list.add(index, element);
        }
    }

    public void removeAtPosition(int index) {
        synchronized (Main.object) {
            list.remove(index);
        }
    }

    public int getFirst() {
        synchronized (Main.object) {
            return list.getFirst();
        }
    }

    public int getLast() {
        synchronized (Main.object) {
            return list.getLast();
        }
    }

    public int size() {
        synchronized (Main.object) {
            return list.size();
        }
    }
}