package system.main.navigation;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Node {
	
	Node parent;
	
	int x;
	int y;
	
	public Node(int X, int Y) {
		x = X;
		y = Y;
	}
	
	public void setParent(Node p) {
		parent = p;
	}
	
	public List getChildren(int mapWidth, int mapHeight) {
		List nodes = new LinkedList();
		
		//Up and Down
		nodes.add(new Node(x, y-1));
		nodes.add(new Node(x, y+1));
		
		//Left and Right
		nodes.add(new Node(x-1, y));
		nodes.add(new Node(x+1, y));
		
		//Up Left and Right
		nodes.add(new Node(x-1, y-1));
		nodes.add(new Node(x+1, y-1));
		
		//Down Left and Right
		nodes.add(new Node(x-1, y+1));
		nodes.add(new Node(x+1, y+1));
		
		return nodes;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean inList(List l) {
		Iterator i = l.iterator();
		while(i.hasNext()) {
			Node n = (Node)i.next();
			if(n.equalsNode(this)) {
				return true;
			}
		}
		return false;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public boolean equalsNode(Node n) {
		return (getX() == n.getX() && getY() == n.getY());
	}
}
