package co.meccorp.freelance.upwork.openrr;

/**
 * This demo design a singly LinkedList using Java generic and implement three functions bellow:
 * 
 * 1. Append an element into the LinkedList
 * 2. Remove the tail element from a LinkedList
 * 3. Remove all element in the LinkedList that is great than a target value
 * 
 * @author sinkibo
 * @since 2017/08/16
 * @param <T>
 */
class SinglyLinkedList<T> {
	// The first element is known as "head"
	private Node head;

	/**
	 * Append an element into the end of LinkedList
	 * 
	 * @param data
	 */
	public void append(T data) {
		if (this.head == null) {
			this.head = new Node((Comparable) data);
			return;
		}
		this.tail().next = new Node((Comparable) data);
	}

	/**
	 * Remove the tail element from LinkedList
	 * 
	 * @return void
	 */
	public void removeTail() {
		Node currNode = this.head;

		if (currNode == null) {
			return;
		}

		if (currNode.next == null) {
			this.head = null;
			return;
		}

		while (currNode.next.next != null)
			currNode = currNode.next;

		currNode.next = null;
	}

	/**
	 * Remove all element in the LinkedList that is great than a target value
	 * 
	 * @return void
	 */
	public void removeAllGreatThan(T target) {
		Node prevNode = this.head;
		Node currNode = this.head;

		while (currNode != null) {
			if (currNode.data.compareTo(target) >0 ) {
				if (currNode == this.head) {
					this.head = this.head.next;
				} else {
					prevNode.next = currNode.next;
				}
			} else {
				prevNode = currNode;
			}
			currNode = currNode.next;
		}
	}

	/**
	 * The last element of LinkedList is known as "tail"
	 * 
	 * @return Node
	 */
	private Node tail() {
		Node currNode = this.head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		return currNode;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();

		Node currNode = this.head;
		strBuilder.append("[ ");
		while (currNode != null) {
			strBuilder.append(currNode);
			strBuilder.append(",");
			currNode = currNode.next;
		}
		strBuilder.deleteCharAt(strBuilder.length() - 1);
		strBuilder.append(" ]");

		return strBuilder.toString();
	}

	/**
	 * Node is inner class, should not be visible
	 * 
	 * @author sinkibo
	 * @since 2017/08/15
	 * @param <T>
	 */
	private static class Node<T extends Comparable<T>> {
		private Node next;
		private T data;

		public Node(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return this.data.toString();
		}
	}
}
