package net.xicp.tarbitrary.linkedlist;

public class MyLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		Node node7 = new Node();
		node1.setNextNode(node2).setNextNode(node3).setNextNode(node4)
				.setNextNode(node5).setNextNode(node6).setNextNode(node7);
		getAllNodes(node1);
	}
	
	public static void getAllNodes(Node root) {
		if (root != null) {
			System.out.print(root.getName());
			if (null == root.getNextNode()) {
				return;
			}
			System.out.print( "--->");
			getAllNodes(root.getNextNode());
		}
	}

}

class Node {
	private static int count = 0;
	private String name;
	private Node nextNode;

	public Node getNextNode() {
		return nextNode;
	}

	public Node setNextNode(Node nextNode) {
		this.nextNode = nextNode;
		return this.nextNode;
	}

	Node() {
		if (count == 0) {
			name = "根结点";
		} else {
			name = "结点" + count;
		}
		count++;
	}

	public String getName() {
		return name;
	}

}