package DoublyLinkedList;
class MyList{
    Node head,tail;
    MyList() {
        head=tail=null;
    }
    boolean isEmpty(){
        return(head==null);
    }
    public int size() {
        Node p = head; int c = 0;
        while(p != null) {
            c++; 
            p = p.next;
        }
        return c;
    }
    void clear() {
        head=tail=null;
    }
    void addLast(int x){
        if(isEmpty())
            head=tail=new Node(x,null,null);
        else{
            Node q =new Node(x,tail,null);
            tail.next=q;
            tail=q;
        }
    }
    void addFirst(int x){
        if(isEmpty())
            head=tail=new Node(x,null,null);
        else{
            Node q =new Node(x,null,head);
            head.prev = q;
            head=q;
        }
    }
    void anotherAddFirst(int x){
        head = new Node (x,null,head);
        head.next.prev = head;
        if (tail==null)
            tail=head;
    }
    void delete (Node p){
        p.prev.next = p.next;
        p.next.prev = p.prev;
    }
    Node search(int x) {
        Node p = head;
        while(p != null && p.info != x) 
            p = p.next;
        return p;
    }
    void traverse() {
        Node p=head;
        while(p!=null) {
            System.out.print("  " + p.info);
            p=p.next;
        }
        System.out.println();
    }
}
//to create editor's fold type fcom and press TAB
