package net.xicp.tarbitrary.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		MyList ml = new MyList();
		for (int i = 0; i < 10; i++) {
			ml.addNode(ml.new Node());
		}
		ml.getAllNodes();
		if (ml.findNode("结点1") != null) {
			System.out.println("查找成功");
		} else {
			System.out.println("查找失败");
		}
		MyList.Node node = ml.findNode("根结点");
		ml.remove(node);
		ml.getAllNodes();
		
		System.out.println("*******************************");
		MyList ml2 = new MyList();
		ml2.addNode(ml2.new Node());
		ml2.getAllNodes();
		System.out.println("移除后");
		ml2.remove(ml2.findNode("根结点"));
		ml2.getAllNodes();
	}
}

class MyList {
	public  int count = 0;
	private Node root;

	public MyList addNode(Node node) {
		if (root == null) {
			root = node;
		} else {
			root.addNode(node);
		}

		return this;
	}

	public void remove(Node node) {
		if (node != null) {
			root.removeNode(node);
		}
	}

	public void getAllNodes() {
		if (root != null)
			root.getAllNodes();
	}

	public Node findNode(String nodeName) {
		return root.findNode(nodeName);
	}

	class Node {
		private Node preNode;
		private Node nextNode;
		private String name;

		Node() {
			if (count == 0) {
				name = "根结点";
			} else {
				name = "结点" + count;
			}
			count++;
		}

		public void removeNode(Node node) {
			if (root == node) {
				root = root.getNextNode();
			} else {
				if (node == this.nextNode) {
					this.setNextNode(node.getNextNode());
				} else {
					if (this.nextNode != null) {
						this.getNextNode().removeNode(node);
					} 
				}
			}
		}

		public Node findNode(String nodeName) {
			if (getName().equals(nodeName)) {
				return this;
			}
			if (this.getNextNode() == null) {
				return null;
			}
			return this.getNextNode().findNode(nodeName);
		}

		public void getAllNodes() {
			if (this.nextNode != null) {
				System.out.print(this.getName() + "---->");
				this.nextNode.getAllNodes();
			} else {
				System.out.println(this.getName());
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Node getPreNode() {
			return preNode;
		}

		public void setPreNode(Node preNode) {
			this.preNode = preNode;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public void addNode(Node node) {
			if (this.getNextNode() == null) {
				this.setNextNode(node);
			} else {
				this.getNextNode().addNode(node);
			}
		}
	}
}
