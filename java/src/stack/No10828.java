package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
	push X: 정수 X를 스택에 넣는 연산이다.
	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 스택에 들어있는 정수의 개수를 출력한다.
	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.	
 *
 */

public class No10828 {

	static ArrayList<Integer> numList;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputSize = scan.nextInt();
		String command;
		numList = new ArrayList<>();
		
		for(int i=0; i<=inputSize; i++) {
			command = scan.nextLine();
			if(command.contains("push")) {
				command = command.replace("push", "").trim();
				push(Integer.parseInt(command));
			}else if(command.equals("pop")) {
				System.out.println(pop());
			}else if(command.equals("size")) {
				System.out.println(size());
			}else if(command.equals("empty")) {
				System.out.println(empty());
			}else if(command.equals("top")) {
				System.out.println(top());
			}
		}
		scan.close();
	}
	/*
	 * 정수 x를 스텍에 넣는 연산
	 */
	public static void push(int data) {
		numList.add(data);
	}
	/*
	 * 가장위에있는 정수를 빼고
	 * 그 수를 출력
	 * 스텍에 들어있는 정수가 없는경우 -1 출력
	 */
	public static int pop() {
		if(numList.isEmpty()) {
			return -1;
		}else {
			return numList.remove(numList.size()-1);
		}
	}
	/*
	 * Stack에 들어있는 정수의 개수 출력
	 */
	public static int size() {
		return numList.size();
	}
	/*
	 * 스텍이 비어있으면 1, 아니면 0출력
	 */
	public static int empty() {
		if(numList.isEmpty()) {
			return 1;
		}else {
			return 0;
		}
		
	}
	/*
	 * Stack의 가장 위에 있는 정수를 출력
	 * Stack에 들어있는 정수가 없을 경우-1 출력
	 */
	public static int top() {
		if(numList.isEmpty()) {
			return -1;
		}else {
			return numList.get(numList.size()-1);
		}
	}
}

