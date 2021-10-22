package com.algorithms.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		Node n = new Node(x);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int path = sc.nextInt();
				if (path == 1 && i != j)
					n.addEdge(i, j);
			}
		}
		n.runDfs(0);
		sc.close();

	}

}

class Node {
	private LinkedList<Integer> adjList[];
	private boolean visited[];

	@SuppressWarnings("unchecked")
	public Node(int v) {
		adjList = new LinkedList[v];
		visited = new boolean[v];

		for (int i = 0; i < v; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int src, int dest) {
		adjList[src].add(dest);
	}

	List<Integer> getAdjList(int i) {
		return adjList[i].stream().collect(Collectors.toList());
	}

	void runDfs(int index) {
		visited[index] = true;
		System.out.print(index + "->");
		Iterator<Integer> it = adjList[index].listIterator();
		while (it.hasNext()) {
			int nextVertex = it.next();
			if (visited[nextVertex])
				continue;
			else
				runDfs(nextVertex);
		}

	}

}