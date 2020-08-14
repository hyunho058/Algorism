package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChannelManager {
	ArrayList<Radio> radioList;
	ArrayList<TV> tvList;
	ArrayList<TVRadio> tvRadioList;
	LinkedList<Object> totalLink;
	
	ChannelManager(){
		this.radioList =  new ArrayList<>();
		this.tvList = new ArrayList<>();
		this.tvRadioList = new ArrayList<>();
		this.totalLink = new LinkedList<>();
	}
	//List에 저장//
	public void addRadioList(Radio radio) {
		radioList.add(radio);
		totalLink.add(radio);
	}
	public void addTvList(TV tv) {
		tvList.add(tv);
		totalLink.add(tv);
	}
	public void addTvRadioList(TVRadio tvRadio) {
		tvRadioList.add(tvRadio);
		totalLink.add(tvRadio);
	}
	
	
	//idScan()메서드를 이용해 ChannelID를 받아와 selectionSort를 이용해 오름차순 정렬//
	public void selectionSort() {
		int minNumber;
		
		for(int i= 0; i<totalLink.size(); i++) {
			minNumber = i;
			for(int j= i+1; j<totalLink.size(); j++) {
				// ChannelID가 같은게 있을경우 처리//
				if(idScan(minNumber, totalLink.get(minNumber)) == idScan(j, totalLink.get(j))) {
					if(channelType(minNumber, totalLink.get(minNumber)).equals("TVRadio")) {
						System.out.println("----");
						totalLink.remove(j);
					}else if(channelType(j, totalLink.get(j)) == ("TVRadio")) {
						totalLink.remove(minNumber);
					}
					--j;
				}
				// for loop를 돌아 가장 작은 값ㅎ이 있는 index를 구한다//
				if(idScan(minNumber, totalLink.get(minNumber)) > idScan(j, totalLink.get(j))) {
					minNumber = j;
				}
			}
			//값을 비교하여 LinkedList에 삽입 , 삭제 작업
			if(idScan(i, totalLink.get(i)) > idScan(minNumber, totalLink.get(minNumber))) {
				totalLink.add(i, totalLink.get(minNumber));
				totalLink.remove(minNumber+1);
				totalLink.add(minNumber, totalLink.get(i+1));
				totalLink.remove(i+1);
			}
			System.out.println(totalLink.get(i).toString());
		}
	}
	//Object Type의 LinkedLIst 해당 index 객체의 타입에 맞게 담아주고  index별로 ChannelID를 리턴해준다
	public int idScan(int index, Object obj) {
		if(totalLink.get(index).getClass().getName() == TV.class.getName()) {
			TV tv_i = (TV)totalLink.get(index);
			return tv_i.getChannelId();
		}else if(totalLink.get(index).getClass().getName() == Radio.class.getName()) {
			Radio radio_i = (Radio)totalLink.get(index);
			return radio_i.getChannelId();
		}else {
			TVRadio tvRadio_i = (TVRadio)totalLink.get(index);
			return tvRadio_i.getChannelId();
		}
	}
	//for loop에서 해당 index와 객체를 받아 해당 객체의 type을 확인하고 channelType을 return한단
	public String channelType(int index, Object obj) {
		if(totalLink.get(index).getClass().getName() == TV.class.getName()) {
			TV tv = (TV)totalLink.get(index);
			return tv.getChannelType();
		}else if(totalLink.get(index).getClass().getName() == Radio.class.getName()) {
			Radio radio = (Radio)totalLink.get(index);
			return radio.getChannelType();
		}else {
			TVRadio tvRadio = (TVRadio)totalLink.get(index);
			return tvRadio.getChannelType();
		}
	}
	
	//type을 인자로 받아  해당 문자열이 포함되어 있는 객체를 출력
	public void searchChannelType(String type) {
		for(int i=0; i<totalLink.size(); i++) {
			typeScan(i, totalLink.get(i), type);
		}
	}
	public void typeScan(int index, Object obj, String type) {
		
		if(totalLink.get(index).getClass().getName() == TV.class.getName()) {
			TV tv = (TV)totalLink.get(index);
			if(tv.getChannelType().contains(type)) {
				System.out.println(totalLink.get(index).toString());
			}
		}else if(totalLink.get(index).getClass().getName() == Radio.class.getName()) {
			Radio radio = (Radio)totalLink.get(index);
			if(radio.getChannelType().contains(type)) {
				System.out.println(totalLink.get(index).toString());
			}
		}else if(totalLink.get(index).getClass().getName() == TVRadio.class.getName()){
			TVRadio tvRadio = (TVRadio)totalLink.get(index);
			if(tvRadio.getChannelType().contains(type)) {
				System.out.println(totalLink.get(index).toString());
			}
		}
	}
	
	//ChannelName 출력
	public void channelName() {
		for(int i= 0; i<totalLink.size(); i++) {
			if(totalLink.get(i).getClass().getName() == TV.class.getName()) {
				TV tv = (TV)totalLink.get(i);
				System.out.println(tv.getChannelName());
			}else if(totalLink.get(i).getClass().getName() == Radio.class.getName()) {
				Radio radio = (Radio)totalLink.get(i);
				System.out.println(radio.getChannelName());
			}else {
				TVRadio tvRadio = (TVRadio)totalLink.get(i);
				System.out.println(tvRadio.getChannelName());
			}
		}
		
	}
}
