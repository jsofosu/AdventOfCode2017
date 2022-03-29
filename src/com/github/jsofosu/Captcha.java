package com.github.jsofosu;

public class Captcha {
    public int captcha(CircularList list){
        int sum =0;
        Node currentNode = list.getHead();
        System.out.println(currentNode.value);
        if(list.getHead() != null){
            do{
                if (currentNode.value == currentNode.nextNode.value) {
                    sum += currentNode.value;
                }
                currentNode = currentNode.nextNode;
            }
            while (currentNode != list.getHead());
        }
        return sum;
    }
}
