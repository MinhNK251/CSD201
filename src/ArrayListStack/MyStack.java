package ArrayListStack;

import java.util.*;

public class MyStack {
    ArrayList h;
    MyStack() {
        h = new ArrayList();
    }
    boolean isEmpty() {
        return(h.isEmpty());
    }
    void push(Object x) {
        h.add(x);
    }
    Object pop() {
        if(isEmpty()) 
            return(null);
        return(h.remove(h.size()-1)); 
    }
}

//public class MyStack {
//    LinkedList h;
//    MyStack() {
//        h = new LinkedList();
//    }
//    boolean isEmpty() {
//        return(h.isEmpty());
//    }
//    void push(Object x) {
//        h.add(x);
//    }
//    Object pop() {
//        if(isEmpty()) 
//            return(null);
//     return(h.removeLast()); 
//    }
// }