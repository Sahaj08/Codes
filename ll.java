package practice;

public class ll {
	Node head;
 class Node{
	 int data;
	 Node next;
	 
	 Node(int data){
		 this.data= data;
		 this.next=null;
	 }
 }
 public void addFirst(int data) {
	 Node newNode= new Node(data);
	 if(head==null) {
		 head = newNode;
		 return;
	 }
	 newNode.next=head;
	 head= newNode;
 }
 public void printList() {
	 
 }
 public static void main(String args[]) {
	 ll list= new ll();
	 list.addFirst(23);
	 list.addFirst(32);
	 System.out.print(list);
 }
}
