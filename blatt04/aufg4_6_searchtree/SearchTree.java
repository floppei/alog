package blatt04.aufg4_6_searchtree;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary search tree implementation
 * 
 * 
 */
public class SearchTree {

	private TreeNode root;

	/** initializes an empty tree */
	public SearchTree() {
		root = null;
	}

	/** checks if tree is empty */
	public boolean isEmpty() {
		return (root == null);
	}

	/** computes height of the tree */
	public int height() {
		return height(root);
	}

	private int height(TreeNode r) {
		if (r == null)
			return 0;
		else
			return 1 + Math.max(height(r.left), height(r.right));
	}

	/**
	 * inserts a value into the tree
	 */
	public boolean insert(int v) {
		if (root == null) {
			// tree was empty
			root = new TreeNode(v);
			return true; // value successfully inserted
		} else {
			// insert v into the non-empty tree with the given root
			return insertIter(root, v);
		}
	}

	/**
	 * insert a value v into tree with root r, iterative version
	 */
	private boolean insertIter(TreeNode r, int v) {
		while (true) {
			if (v < r.info) {
				if (r.left == null) {
					r.left = new TreeNode(v);
					return true;
				} else {
					r = r.left;
				}
			} else if (v > r.info) {
				if (r.right == null) {
					r.right = new TreeNode(v);
					return true;
				} else {
					r = r.right;
				}
			} else
				// if (v == r.info)
				return false; // Wert war bereits vorhanden
		}
	}

	/**
	 * search for value v in the tree
	 * 
	 * @return node that contains value v, or null, if v is not contained in the
	 *         tree
	 */
	public TreeNode searchNode(int v) {
		return searchNodeRek(root, v);
	}

	public TreeNode searchNodeRek(TreeNode r, int v) {
		if (r == null)
			return null;
		else {
			if (v < r.info)
				return searchNodeRek(r.left, v); // continue search in left subtree
			else if (v > r.info)
				return searchNodeRek(r.right, v); // continue search in right subtree
			else
				// v == r.value // value found
				return r;
		}
	}

	/**
	 * print the tree in 'graphical' form to the console
	 */
	public void print() {
		if (root != null) {
			print(root.left, "    ", true);
			System.out.println("+---" + root.info);
			print(root.right, "    ", false);
		} else {
			System.out.println("(empty tree)");
		}
	}

	/** auxilliary method to print the tree in graphical form */
	private void print(TreeNode r, String prefix, boolean links) {
		if (r != null) {
			if (links)
				print(r.left, prefix + "    ", links);
			else
				print(r.left, prefix + "|   ", !links);

			System.out.println(prefix + "+---" + r.info);

			if (links)
				print(r.right, prefix + "|   ", !links);
			else
				print(r.right, prefix + "    ", links);

		}
	}

	/** Compute the sum of all values. */
	public int sum() {
		int sum = 0;
		if (root == null) {
			sum = root.info;
			return sum;
		}
		else{
			return sum;
		}
	}

	/** computes the number of leafs */
	public int numOfLeaves() {
		// TODO
		// TODO
		// TODO
		return -1;
	}

	/**
	 * removes the node with the minimal value
	 * 
	 * @return value of the node that is removed
	 */
	public int extractMin() {
		int min = 0;
		if((root.left == null) && (root.right == null))
			min = root.info;



		return min;

	}

	/**
	 * builds a sorted list of all values
	 */
	public ArrayList<Integer> toList() {
		List list = new ArrayList();
		if((root.left == null) && (root.right == null))
			list.add(root.info);



		return (ArrayList<Integer>) list;
	}

	/** checks if both trees contain the same set of values */
	public boolean equals(SearchTree other) {
		// TODO
		// TODO
		// TODO
		// TODO
		return false;
	}
}
