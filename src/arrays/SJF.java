package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class SJF {
	public static void main(String[] args) {

		/*
		 * int[] requestTimes = { 0, 2, 4, 5 }; int[] durations = { 7, 4, 1, 4};
		 */
		int[] requestTimes = { 0, 1, 3, 9 };
		int[] durations = { 2, 1, 7, 5 };
		float avg = waitingTimeSJFEfficient(requestTimes, durations);
		System.out.println(avg);
	}

	private static float waitingTimeSJF(int[] requestTimes, int[] durations) {
		int currentTime = 0;
		float average = 0.0f;
		ArrayList<Integer> covered = new ArrayList<Integer>();
		while (covered.size() < requestTimes.length) {
			int waitTime = 0;
			// getting all the options which are schedulable
			PriorityQueue<Node> schedulable = getSchedulable(requestTimes, covered, currentTime, durations);
			// picking the best option out of it
			// no more using n for it, reduced it to log n time.
			Node node = schedulable.remove();
			covered.add(node.index);
			// calculating the waiting time
			waitTime = currentTime - requestTimes[node.index];
			// increasing the current time
			currentTime += durations[node.index];

			average += waitTime;
				//o(n*(nlogn+logn))
		}
		// returning the average running time
		return average / requestTimes.length;
	}

	private static PriorityQueue<Node> getSchedulable(int[] requestTimes, ArrayList<Integer> covered, int currentTime,
			int[] durations) {
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		for (int i = 0; i < requestTimes.length;  i++) {
			if (covered.contains(i)) // n
				continue;
			if (requestTimes[i] <= currentTime)
				queue.add(new Node(i, durations[i]));
			else
				// taking advantage of the sorting requestTimes here,
				// as the request times are sorted once its greater all others
				// after it will also be greater
				break;
		}
		return queue;
	}

	static class Node implements Comparable<Node> {
		int index;
		int duration;

		Node(int index, int duration) {
			this.index = index;
			this.duration = duration;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (this.duration < o.duration)
				return -1;
			else if (this.duration > o.duration)
				return 1;
			else
				return 0;
		}
	}

	static class NodeEff implements Comparable<NodeEff> {
		int request;
		int duration;

		NodeEff(int request, int duration) {
			this.request = request;
			this.duration = duration;
		}

		@Override
		public int compareTo(NodeEff o) {
			// TODO Auto-generated method stub
			if (this.duration < o.duration)
				return -1;
			else if (this.duration > o.duration)
				return 1;
			else
				return 0;
		}
	}

	private static float waitingTimeSJFEfficient(int[] requestTimes, int[] durations) {
		int currentTime = 0;
		float average = 0.0f;
		List<NodeEff> nodeList = new LinkedList<NodeEff>();
		PriorityQueue<NodeEff> heap = constructHeap(requestTimes, durations); // n
		while (!heap.isEmpty()) {
			int waitTime = 0;
			NodeEff node = heap.peek(); // constant
			if (node.request <= currentTime) {
				waitTime = currentTime - node.request;
				average += waitTime;
				currentTime += node.duration;
				heap.poll(); //log n
				int i = 0;
				while (i < nodeList.size()) {
					heap.add(nodeList.remove(i++)); // n*log n
				}
			} else {
				nodeList.add(heap.poll()); // log n
			}
		}
		// returning the average running time
		return average / requestTimes.length;
	}

	private static PriorityQueue<NodeEff> constructHeap(int[] requestTimes, int[] durations) {
		PriorityQueue<NodeEff> heap = new PriorityQueue<NodeEff>();
		for (int i = 0; i < requestTimes.length && i < durations.length; i++) {
			heap.add(new NodeEff(requestTimes[i], durations[i]));
		}
		return heap;
	}

}
