// import java.io.*;
// import java.util.*;


// public class stackk 
// {
//     int size;
//     int top;
//     int arr[];
//     public void stack(int size)
//     {
//         this.size=size;
//         arr = new int[this.size];
//         top=-1;
//     }
//     public void push(int item)
//     {
//         if(this.top==this.size-1){
//             System.out.println("overflow");
//         }
//         else
//         {
//             this.top+=1;
//             arr[top]=item;
//         }
//     }

//     public void pop(){
//         if(top== -1){
//             System.out.println("Stack is Empty");
//         }
//         else
//         {
//             int item=arr[top];
//             top-=1;
//             return item;
//         }
//     }


// }


// class Stack 
// {
//     public static void main (String args[])
//     {
//         Stack1 ob = new Stack1();
//         ob.push(10);
//         ob.push(20);
//         ob.push(30);
//         ob.display();
//         System.out.println(ob.pop());
//         System.out.println(ob.pop());
//         ob.display();
//     }
// }


// ---------------------------------------------------------------------

public class StackArray {
    int[] arr;
    int top;
    int size;
    public StackArray(int size) {
      this.arr=new int[size];
      this.top=-1;
      this.size=size;
    }
    public void push(int item) {
      if (isFull()) {
        System.out.println("Stack is full.");
      } else {
        top++;
        arr[top]=item;
      }
    }
    public int pop() {
      if (isEmpty()) {
        System.out.println("Stack is empty.");
        return -1;
      } else {
        int item=arr[top];
        top--;
        return item;
      }
    }
    public int peek() {
      if (isEmpty()) {
        System.out.println("Stack is empty.");
        return -1;
      } else {
        return arr[top];
      }
    }
    public boolean isEmpty() {
      return (top==-1);
    }
    public boolean isFull() {
      return (top==size-1);
    }
    public static void main(String[] args) {
      StackArray stack = new StackArray(5);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.push(6);
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.peek());
    }
  }