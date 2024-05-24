package doublylinkedlist;

public class DoublyLinkedList<T> {
	//Node class
	private static class Node<T>{
		private T element;
		private Node<T>next;
		private Node<T>prev;
		 public Node(T e, Node<T>p,Node<T>n) {
			 this.element = e;
			 this.next = n;
			 this.prev = p;
		 }
		 //gets element
		 public T getElement() {
			return element;
			}
		 //gets next node
		 public Node<T>getNext(){
			 return next;
		 }
		 //gets previous node
		 public Node<T>getprev(){
			 return prev;
		 }
		 //sets next node
		 public void setNext(Node<T>n) {
			 next = n;
		 }
		 //sets previous node
		 public void setPrev(Node<T>p) {
			 prev = p;
		 }
		
	}//end of node class
	
	private Node<T> head = null;
	private Node<T>tail = null;
	
	private int size = 0;
	
	public int getSize() {//returns size
		return size;
	}
	 public boolean isEmpty() {//returns 0 if found empty
		 return size == 0;
	 }
	 
	 //returns first element 
	 public T getfirst() {
		 if(isEmpty())
			 return null;
		 return head.getElement();
	 }
	 //returns last element
	 public T getlast() {
		 if(isEmpty())
			 return null;
		 return tail.getElement();
	 }
	 
	 //adds new element to top of list
	 public void addfirst(T newest) {
		 Node<T>newnode = new Node<T>(newest,null,head);
		 if(isEmpty()) {
			 head = tail = newnode;
			 head.setNext(null);
			 head.setPrev(null);
		 }
		 newnode.setNext(head);
		 newnode.setPrev(null);
		 head = newnode;
		 size++;
	 }
	 
	 //adds new element to bottom of list
	 public void addlast(T newest) {
		 Node<T>newnode = new Node<>(newest,tail,null);
		 if(isEmpty()) {
			 tail = head = newnode;
			 tail.setNext(null);
			 tail.setPrev(null);
		 }
		 newnode.setPrev(tail);
		 newnode.setNext(null);
		 tail = newnode;
		 size++;
	 }
	 
	 //removes first elment of the list
	 public T removefirst() {
		 if(isEmpty()) {
			 return null;
		 }
		 T removed = head.getElement();
		 head = head.getNext();
		 head.setNext(head.getNext());
		 head.setPrev(null);
		 size--;
		 return removed;
	 }
	 
	 //removes the last element of list
	 public T removelast() {
		 if(isEmpty()) {
			 return null;
		 }
		 T removed = tail.getElement();
		 tail = tail.getprev();
		 tail.setPrev(tail.getprev());
		 tail.setNext(null);
		 size--;
		 return removed;
	 }
	 
	 //removes optioned node from list
	 public T remove(Node<T> node) {
		 if(isEmpty()) {
			 return null;
		 }
		 Node<T>next = node.getNext();
		 Node<T>prev = node.getprev();
		 next.setPrev(prev);
		 prev.setNext(next);
		 size--;
		 return node.getElement();
	 }
	 
	 
	 //inserts element to arbitrary position
	 public void addBetween(T e,Node<T>p,Node<T>n) {
		 Node<T>newnode = new Node<T>(e,p,n);
		 n.setPrev(newnode);
		 p.setNext(newnode);
		 size++;
		 
	 }
	 
}
