package doublylinkedlist;

public class Test {
	public static void main(String[] args) {
		DoublyLinkedList<Integer>list = new DoublyLinkedList<>();
		int a = 1;
		int b = 2;
		//int c = 3;
		int d = 4;
		
		System.out.println(list.isEmpty());
		System.out.println("list size = "+list.getSize());
		System.out.println("first element is : "+list.getfirst());
		System.out.println("last element is : "+list.getlast());
		System.out.println();
		list.addfirst(a);
		System.out.println(list.isEmpty());
		System.out.println("list size = "+list.getSize());
		System.out.println("first element is : "+list.getfirst());
		System.out.println("last element is : "+list.getlast());
		System.out.println();
		list.addfirst(b);
		System.out.println(list.isEmpty());
		System.out.println("list size = "+list.getSize());
		System.out.println("first element is : "+list.getfirst());
		System.out.println("last element is : "+list.getlast());
		System.out.println();
		list.addlast(d);
		System.out.println(list.isEmpty());
		System.out.println("list size = "+list.getSize());
		System.out.println("first element is : "+list.getfirst());
		System.out.println("last element is : "+list.getlast());
		System.out.println();
		System.out.println("removed first: "+list.removefirst());
		System.out.println();
		System.out.println(list.isEmpty());
		System.out.println("list size = "+list.getSize());
		System.out.println("first element is : "+list.getfirst());
		System.out.println("last element is : "+list.getlast());
		System.out.println(list.getClass());
		
		
		
	}

}
