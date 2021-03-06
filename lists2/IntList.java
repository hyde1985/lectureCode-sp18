public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	public IntList addFirst(int i) {
		IntList p = this;
		p = new IntList(i, p);
		return p;
	}

	public void addAdjacent() {
		if(this.rest == null) return;
		IntList s = this;
		while(s.rest != null) {
			if(s.first == s.rest.first) {
				s.first = s.first * 2;
				if(s.rest.rest != null) {
					s.rest = s.rest.rest;
				} else {
					s.rest = null;
					break;
				} 

			} else {
				s = s.rest;
			}
		}
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = L.addFirst(10);
		L = L.addFirst(10);
		

		//System.out.println(L.get(100));
	}
} 