 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {	
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
			System.out.println(size);
		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	private static void lectureQuestion() {
		SLList L = new SLList();
		IntNode n = IntNode(5, null);
	}

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public SLList(int[] x) {
		if(x == null || x.length == 0) {
			sentinel = new IntNode(63, null);
			size = 0;
		} else {
			sentinel = new IntNode(63, null);
			for(int i = x.length - 1; i >=0; i--) {
				this.addFirst(x[i]);
			}
		}
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		sentinel.next = new IntNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return sentinel.next.item;
 	}

 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
 		size = size + 1; 		

 		IntNode p = sentinel;

 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 	}
 	
 	/** Returns the size of the list. */
 	public int size() {
 		return size;
 	}

 	public void deleteFirst() {
 		if(size == 0) return;
 		if(size == 1) {
 			size = 0;
 			sentinel.next = null;
 			return;
 		}
 		size = size - 1;
 		sentinel.next = sentinel.next.next;
 	}


	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
 		int x = {1, 2};
 		SLList L = new SLList();
 		System.out.println(L.size());
 	}
}