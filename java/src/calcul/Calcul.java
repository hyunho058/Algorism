package calcul;

import java.util.LinkedList;
import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LinkedList<Integer> numList = new LinkedList<Integer>(); //숫자관련
        LinkedList<Character> opList = new LinkedList<Character>(); //연산자 관련
        
        
        String input = scan.nextLine(); //enter까지 포함한 것까지 입력
        String num = ""; //연사자 외에 숫자들을 임시 저장할 곳
        
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); //string을 char 타입 단위로 나눔
            
          //  System.out.println("ch="+i+"-"+ch);
            
            if(ch == '+' || ch =='-' || ch == '*' || ch == '/') {
            	//System.out.println("num="+num);
                numList.add(Integer.parseInt(num)); //숫자로 바꿔서 숫자배열에 추가
              //  System.out.println("chOper="+ch);
                opList.add(ch); //연산자를 연산자배열에 추가
                num = ""; //임시로 저장된 숫자를 비워준다           
                continue; //제일 가까운 명령문으로 이동
            }
            num += ch; //연산자 앞까지의 숫자를 임시로 넣어 놓음
          //  System.out.println();
        }
        
        
        
        numList.add(Integer.parseInt(num)); //마지막 숫자
        int multi = numList.get(1) * numList.get(2);
        numList.remove(1);
        numList.remove(1);
        numList.add(1, multi);
        opList.remove(1);
        
        System.out.println(numList);
        System.out.println(opList);
 
        while(!opList.isEmpty()) { //연산자배열이 빌 때까지
            int firstNum = numList.poll(); //poll : 앞부터 완전히 뺀다
            int nextNum = numList.poll();
            char op = opList.poll();
            
            System.out.println("prevNum ="+firstNum);
            System.out.println("nextNum ="+nextNum);
            // / * + / //
//            for(int i = 0; i<opList.size(); i++) {
//            	if(op == '*') {
//            		
//            	}
//            }
            for(int i=0; i<opList.size(); i++) {
            	
            }            
            
            for(int i=0; i<opList.size(); i++) {
            }
            
            if(op == '+') {
                numList.addFirst(firstNum + nextNum); //addFirst 배열 제일 앞에 넣는다
            } else if(op == '-') {
                numList.addFirst(firstNum - nextNum);
            } else if(op == '*') {
                numList.addFirst(firstNum * nextNum);
            } else if(op == '/') {
                numList.addFirst(firstNum / nextNum);
            }
        }
        System.out.println(numList.poll());
	}
}
