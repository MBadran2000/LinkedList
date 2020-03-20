package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLinkedListtest {

	
	
	DLinkedList test1;
	
	
	public void create_linked_list() {
		test1=new DLinkedList();
		test1.add(123);
		test1.add(134);
		test1.add(3);
		test1.add(5);
		test1.add(7);
		test1.add(0);
	}
	
	@Test
	void test_add_by_index() {
		test1=new DLinkedList();
		create_linked_list();
		assertEquals(134,test1.get(2));
		assertEquals(6,test1.size());
		test1.add(1,70);
		test1.add(3,50);
		assertEquals(70,test1.get(1));
		assertEquals(50,test1.get(3));
		assertEquals(134,test1.get(4));
		assertEquals(8,test1.size());
		test1.add(9,"out of bound");
		assertEquals(null,test1.get(9));
	}
	
	@Test
	void test_ADD() {
		test1=new DLinkedList() ;
		assertEquals(null,test1.get(1));
		assertEquals(null,test1.get(2));
		assertEquals(0,test1.size());
		create_linked_list();
		assertEquals(123,test1.get(1));
		assertEquals(134,test1.get(2));
		assertEquals(3,test1.get(3));
		assertEquals(5,test1.get(4));
		assertEquals(7,test1.get(5));
		assertEquals(0,test1.get(6));
		assertEquals(null,test1.get(7));
	}
	
	@Test
	void test_set() {
		test1=new DLinkedList() ;
		create_linked_list();
		test1.set(1, 0);
		test1.set(2, 10);
		assertEquals(0,test1.get(1));
		assertEquals(10,test1.get(2));
		assertEquals(3,test1.get(3));
		assertEquals(5,test1.get(4));
	}
	
	
	@Test
	void test_clear() {
		test1=new DLinkedList();
		create_linked_list();
		test1.clear();
		assertEquals(0,test1.size());
		assertEquals(null,test1.get(1));
		assertEquals(null,test1.get(2));
	}
	
	@Test
	void test_IsEmpty() {
		test1=new DLinkedList() ;
		DLinkedList test2=new DLinkedList() ;
		create_linked_list();
		assertEquals(false,test1.isEmpty());
		assertEquals(true,test2.isEmpty());
	}
	
	@Test
	void test_remove() {
		test1=new DLinkedList() ;
		create_linked_list();
		test1.remove(3);
		assertEquals(123,test1.get(1));
		assertEquals(134,test1.get(2));
		assertEquals(5,test1.get(3));
		assertEquals(7,test1.get(4));
		test1.remove(1);
		assertEquals(134,test1.get(1));
		assertEquals(5,test1.get(2));
	}
	
	@Test
	void test_sublist() {
		test1=new DLinkedList() ;
		create_linked_list();
		assertEquals(null,test1.sublist(10,15));
		assertEquals((test1.sublist(3, 4)).get(1),3);
		assertEquals((test1.sublist(3, 4)).get(2),5);
	}

	@Test
	void test_contain() {
		test1=new DLinkedList() ;
		create_linked_list();
		assertEquals(true,test1.contains(5));
		assertEquals(false,test1.contains(9));

	}
}
