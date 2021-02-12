package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No18258 {
	static Queue<Integer> queue;
	static int last;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputSize = scan.nextInt();
		queue = new LinkedList<Integer>();
		String command;
		last = 0;

		for (int i = 0; i <= inputSize; i++) {
			command = scan.nextLine();
			String instruction[] = command.split(" ");
			switch (instruction[0]) {
			case "push":
				push(Integer.parseInt(instruction[1]));
				break;
			case "pop":
				System.out.println(pop());
				break;
			case "size":
				System.out.println(size());
				break;
			case "empty":
				System.out.println(empty());
				break;
			case "front":
				System.out.println(front());
				break;
			case "back":
				System.out.println(back());
				break;
			}
		}

	}

	/**
	 * 정수 를 큐에 넣는다
	 */
	public static void push(int data) {
		last = data;
		queue.offer(data);
	}

	/**
	 * 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 */
	public static int pop() {
		if (queue.isEmpty()) {
			return -1;
		} else {
			return queue.poll();
		}
	}

	/**
	 * 큐에 들어있는 정수의 개수를 출력한다.
	 */
	public static int size() {
		return queue.size();
	}

	/**
	 * 큐가 비어있으면 1, 아니면 0을 출력한다.
	 */
	public static int empty() {
		if (queue.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 */
	public static int front() {
		if (queue.isEmpty()) {
			return -1;
		} else {
			return queue.peek();
		}
	}

	/**
	 * 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 */
	public static int back() {
		if (queue.isEmpty()) {
			return -1;
		} else {
			return last;
		}
	}
}
