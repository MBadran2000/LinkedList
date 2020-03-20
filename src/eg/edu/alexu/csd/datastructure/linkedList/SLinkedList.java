package eg.edu.alexu.csd.datastructure.linkedList;

public class SLinkedList implements ILinkedList{
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object element) {
			data = element; 
			next = null;
		}

		public Object getElement() { 
			return data;
		}
		
		public Node getNext() { 
			return next; 
		}
		
		public void setElement(Object newElem) {
			data = newElem;
		}
		
		public void setNext(Node newNext) {
			next = newNext; 
		}
	}

	private Node Head = new Node(null);
	private int Size;
	
	public SLinkedList() {
		Head = null;
		Size =0;
	}
	
	public void checkIndex(int index) throws Exception {
		if(index <1 || index > Size)
			throw new Exception("out of bound");
	}
	
	public void add(int index, Object element) {
		try {
			checkIndex(index);
		} catch (Exception e) {
			return;
		}
		if(index ==1) {
			Node new_element=new Node (element);
			new_element.setNext(Head);
			Head = new_element;
			Size++;
		}
		else {
			Node temp= Head;
			while(index>2) {
				temp=temp.getNext();
				index--;	
			}
				Node new_element=new Node (element);
				new_element.setNext(temp.getNext());
				temp.setNext(new_element);
				Size++;
		}
	}

	
	public void add(Object element) {
		Node new_element=new Node (element);
		if (Size==0) {
			Head=new_element;
		}
		else {
			Node end=Head;
			while(end.getNext()!=null) {
				end=end.getNext();
			}
			end.setNext(new_element);
		}
		Size++;
	}

	
	public Object get(int index) {
		try {
			checkIndex(index);
		} catch (Exception e) {
			return null;
		}
		Node temp=Head;
		if(index ==1) {
			temp=Head;
		}
		else {
			while(index>1) {
				temp=temp.getNext();
				index--;	
			}
		}
		return temp.getElement();
	}

	
	public void set(int index, Object element) {
		try {
			checkIndex(index);
		} catch (Exception e) {
			return;
		}
		Node temp=Head;
		if(index ==1) {
			Head.setElement(element);
		}
		else {
			while(index>1) {
				temp=temp.getNext();
				index--;	
			}
			temp.setElement(element);
		}
	}

	
	public void clear() {
		Head = null;
		Size=0;
	}

	
	public boolean isEmpty() {
		return Head==null;
	}


	public void remove(int index) {
		try {
			checkIndex(index);
		} catch (Exception e) {
			return;
		}
		Node temp=Head;
		if(index==1) {
			Head=temp.getNext();
			Size--;
		}
		else {
			while(index>2) {
				temp=temp.getNext();
				index--;	
			}
			Node next = (temp.getNext()).getNext();
			temp.setNext(next);
			Size--;
		}
	}

	
	public int size() {
		return Size;
	}

	public ILinkedList sublist(int fromIndex, int toIndex) {
		try {
			checkIndex(fromIndex);
		} catch (Exception e) {
			return null;
		}
		try {
			checkIndex(toIndex);
		} catch (Exception e) {
			return null;
		}

		Node start;
		SLinkedList i = new SLinkedList();
		int counter =1;
		start=this.Head;
		while(counter!=fromIndex)
		{
			start = start.getNext();
			counter++;
		}
		do {
			i.add(start.getElement());//get element array ny refernce
			start = start.getNext();
			counter++;
		}while(counter!=toIndex+1);
		return  i;
	}

	
	public boolean contains(Object o) {
		Node check=Head;
		while(check!=null) {
			if(check.getElement()==o)
				return true;
			check = check.getNext();
		}
		return false;
	}
	
	public String toStringQ() {
		String s ="[";
		Node v = Head;
		while(v!=null) {
			s+=v.getElement();
			s+= " ";
			v = v.getNext();
		}
		s+="]";
		return s;
	}
}

