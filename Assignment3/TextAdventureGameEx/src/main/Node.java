package main;

public class Node {
	
	static int id;
	String label;

	public Node() {
		id++;
	}

	public static int getId() {
		return id;
	}

}
