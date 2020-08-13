package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ChannelManager channelManager = new ChannelManager();
		
		//Radio 방송 목록 추가
		channelManager.addRadioList(new Radio("Radio", 3, "A", "KBS", 100));
		channelManager.addRadioList(new Radio("Radio", 2, "B", "SBS", 101));
		channelManager.addRadioList(new Radio("Radio", 1, "C", "MBC", 102));
		channelManager.addRadioList(new Radio("Radio", 4, "D", "YTN", 103));
		//TV 방송 목록 추가
		channelManager.addTvList(new TV("TV", 5, "E", "KBS", 7, "지상파"));
		channelManager.addTvList(new TV("TV", 8, "F", "SBS", 5, "지상파"));
		channelManager.addTvList(new TV("TV", 7, "G", "MBC", 11, "지상파"));
		channelManager.addTvList(new TV("TV", 6, "H", "JTBC", 15, "케이블"));
		//TV/Radio 방송 목록 추가
		channelManager.addTvRadioList(new TVRadio("TVRadio", 3, "I", "KBS"));
		channelManager.addTvRadioList(new TVRadio("TVRadio", 7, "J", "MBC"));
		
		//오름차순 정렬//
		channelManager.selectionSort();
		//검색한 타입 출력//
		channelManager.searchType(scan.nextLine());
		//정렬된 List를 체널 아이디로 출력해 보여준다//
		channelManager.channelName();
	}
}
