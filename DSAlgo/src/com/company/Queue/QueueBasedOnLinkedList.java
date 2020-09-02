package com.company.Queue;

public class QueueBasedOnLinkedList {
    public QueueNode front,rear;
    static class QueueNode{
        int data;
        QueueNode next;
        QueueNode(int data){
            this.next=null;
            this.data=data;
        }
    }
    QueueBasedOnLinkedList(){
        this.rear=this.front=null;
    }
    public void enqueue(int d){
        QueueNode queueNode = new QueueNode(d);
        if(this.rear==null){
            front=rear=queueNode;
            return;
        }

        this.rear.next=queueNode;
        this.rear=queueNode;
    }
    public QueueNode dequeue(){
        if(this.front==null){
            return null;
        }
        this.front=this.front.next;
        if(this.front==null){
            this.rear=null;
        }
        return this.front;
    }
}
