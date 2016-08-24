package br.com.urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void mustInstantiate() {
		assertNotNull(new Node());
	}

	@Test
	public void testNull() {
		try {
			Node.getNth(null, 0);
			assertTrue(false);
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void testWrongIndex() {
		try {
			Node.getNth(new Node(), 1);
			assertTrue(false);
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void test2Nodes() {
		Node n = new Node();
		n.data = 1337;
		n.next = new Node();
		n.next.data = 42;
		n.next.next = new Node();
		n.next.next.data = 23;
		try {
			assertEquals(Node.getNth(n, 0), 1337);
			assertEquals(Node.getNth(n, 1), 42);
			assertEquals(Node.getNth(n, 2), 23);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

}
