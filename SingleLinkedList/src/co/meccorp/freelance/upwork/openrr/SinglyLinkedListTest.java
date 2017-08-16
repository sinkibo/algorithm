package co.meccorp.freelance.upwork.openrr;

import junit.framework.TestCase;

/**
 * This class demonstrate how the LinkedList should be worked
 * 
 * @author sinkibo
 * @since 2017/08/16
 */
public class SinglyLinkedListTest extends TestCase{
	
	public static void main(String args[]) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		
		final int TARGET = 1;
		singlyLinkedList.append(1);
		singlyLinkedList.append(2);
		singlyLinkedList.append(3);
		singlyLinkedList.append(4);
		singlyLinkedList.append(5);
		singlyLinkedList.append(6);
		singlyLinkedList.append(7);
		
		/*final String TARGET = "Ha Noi";
		singlyLinkedList.append("Hai Phong");
		singlyLinkedList.append("Da Nang");
		singlyLinkedList.append("Thanh Hoa");
		singlyLinkedList.append("Nghe An");
		singlyLinkedList.append("Quang Binh");
		singlyLinkedList.append("Quang Tri");*/
		
		System.out.println("Singly LinkedList contains: " + singlyLinkedList);
		
		singlyLinkedList.removeAllGreatThan(TARGET);
		System.out.println("Singly LinkedList after remove all element great than "+ TARGET +": " + singlyLinkedList);
		
		singlyLinkedList.removeTail();
		System.out.println("Singly LinkedList after remove tail element: " + singlyLinkedList);
	}
}
