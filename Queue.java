/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Ashish
 */
public class Queue {
    private static class QueueNode{
        int data;
        QueueNode next;
        QueueNode(int data){
            this.data = data;
        }
    }
    private QueueNode front, rear;
    
    public void add(int d){
        QueueNode item = new QueueNode(d);
        if(front == null)
            front = item;
        if(rear == null)
            rear = item;
        else{
            rear.next = item;
            rear = item;
        }
        showQueue();    
    }
    
    public int remove(){
        if(front == null)
            return -1;
        int data = front.data;
        front = front.next;
        showQueue();
        return data;
    }
    
    public int peek(){
        if(front == null)
            return -1;
        return front.data;
    }
    
    public boolean isEmpty(){
        return (front == null);
    }
    
    public void showQueue(){
        if(front == null){
            System.out.println("Queue is Empty!");
            return;
        }
        QueueNode n = front;
        while(n != null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        q.add(3);
        q.add(4);
        q.add(7);
        System.out.println(q.isEmpty());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.add(1);
    }
    
}
