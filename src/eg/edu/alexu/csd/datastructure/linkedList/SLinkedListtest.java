package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SLinkedListtest {

	SLinkedList test1;
	
	public void create_linked_list() {
		test1=new SLinkedList();
		test1.add("hi");
		test1.add("ahmed");
		test1.add("shut");
		test1.add("up");
		test1.add("please");
	}
	
	@Test
	void test_add_by_index() {
		test1=new SLinkedList();
		create_linked_list();
		assertEquals("ahmed",test1.get(2));
		assertEquals(5,test1.size());
		test1.add(1,"dear");
		test1.add(3,"mohamed");
		assertEquals("dear",test1.get(1));
		assertEquals("mohamed",test1.get(3));
		assertEquals("ahmed",test1.get(4));
		assertEquals(7,test1.size());
		test1.add(9,"out of bound");
		assertEquals(null,test1.get(9));
	}
	
	@Test
	void test_ADD() {
		test1=new SLinkedList() ;
		assertEquals(null,test1.get(1));
		assertEquals(null,test1.get(2));
		assertEquals(0,test1.size());
		create_linked_list();
		assertEquals("hi",test1.get(1));
		assertEquals("ahmed",test1.get(2));
		assertEquals("shut",test1.get(3));
		assertEquals("up",test1.get(4));
		assertEquals("please",test1.get(5));
		assertEquals(null,test1.get(6));
	}
	
	@Test
	void test_set() {
		test1=new SLinkedList() ;
		create_linked_list();
		test1.set(1, "hallo");
		test1.set(2, "mohamed");
		assertEquals("hallo",test1.get(1));
		assertEquals("mohamed",test1.get(2));
	}
	
	
	@Test
	void test_clear() {
		test1=new SLinkedList() ;
		create_linked_list();
		test1.clear();
		assertEquals(0,test1.size());
		assertEquals(null,test1.get(1));
		assertEquals(null,test1.get(2));
	}
	
	@Test
	void test_IsEmpty() {
		test1=new SLinkedList() ;
		SLinkedList test2=new SLinkedList() ;
		create_linked_list();
		assertEquals(false,test1.isEmpty());
		assertEquals(true,test2.isEmpty());
	}
	
	@Test
	void test_remove() {
		test1=new SLinkedList() ;
		create_linked_list();
		test1.remove(3);
		assertEquals("hi",test1.get(1));
		assertEquals("ahmed",test1.get(2));
		assertEquals("up",test1.get(3));
		assertEquals("please",test1.get(4));
		test1.remove(1);
		assertEquals("ahmed",test1.get(1));
		assertEquals("up",test1.get(2));
	}
	
	@Test
	void test_sublist() {
		test1=new SLinkedList() ;
		create_linked_list();
		assertEquals(null,test1.sublist(10,15));
		assertEquals(((SLinkedList) test1.sublist(3, 4)).toStringQ(),"[shut up ]");
		assertEquals(((SLinkedList) test1.sublist(1, 2)).toStringQ(),"[hi ahmed ]");
		assertEquals(((SLinkedList) test1.sublist(1, 2)).size(),2);
	}

	@Test
	void test_contain() {
		test1=new SLinkedList() ;
		create_linked_list();
		assertEquals(true,test1.contains("ahmed"));
		assertEquals(false,test1.contains("mohamed"));

	}
}
