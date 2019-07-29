package com.AbstractionChallenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);

        list.traverse(list.getRoot());

//        String stringData = "seattle newyork abilene chicago fishers annarbor abilene";
        String stringData = "5 7 9 3 5 2 6 4 1 4";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
        list.traverse(list.getRoot());
    }
}
