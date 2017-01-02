package br.com.urban.codewars.kyu7;

public class Node {
	
	public int data;
	public Node next = null;

	public static int getNth(Node n, int index) throws Exception {
		if(n == null || index < 0) {
			throw new Exception();
		}
		if(index == 0) {
			return n.data;
		}
		return getNth(n.next, index-1);
	}
	
}
