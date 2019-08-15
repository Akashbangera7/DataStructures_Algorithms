package com.company;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void insertToHead(Employee employee){
        EmployeeNode node = new EmployeeNode( employee );
        node.setNext( head );
        if(head == null)
        {
            tail = node;
        }
        else{
            head.setPrevious( node );
        }
        head = node;
        size++;
    }

    public void insertToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode( employee );
        if(tail == null){
            head = node;
        }
        else{
            tail.setNext( node );
            node.setPrevious( tail );
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(head == null)
        {
            return null;
        }
        EmployeeNode removedNode = head;
        if(head.getNext() == null)
        {
            tail = null;
        }
        else{
            head.getNext().setPrevious( null );
        }
        head = head.getNext();
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd()
    {
        if(tail == null){
            return null;
        }
        EmployeeNode removedNode = tail;
        if(tail.getPrevious() == null){
            head = null;
        }else{
            tail.getPrevious().setNext( null );


        }tail = tail.getPrevious();
        size--;
        return removedNode;

    }

    public void printList()
    {
        EmployeeNode current = head;
        System.out.print( "HEAD ->" );
        while(current != null)
        {
            System.out.print( current );
            System.out.print( "<=>" );
            current = current.getNext();
        }
        System.out.print( "Null" );
    }

    public int getSize(){
        return size;
    }
}
