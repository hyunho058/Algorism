package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChannelManager {
	ArrayList<Radio> radioList;
	ArrayList<TV> tvList;
	ArrayList<TVRadio> tvRadioList;
	LinkedList<Object> totalLink;
	LinkedList<Object> copyTotalLink;
	
	ChannelManager(){
		this.radioList =  new ArrayList<>();
		this.tvList = new ArrayList<>();
		this.tvRadioList = new ArrayList<>();
		this.totalLink = new LinkedList<>();
		this.copyTotalLink = new LinkedList<>();
	}
	
	public void addRadioList(Radio radio) {
		radioList.add(radio);
		copyTotalLink.add(radio);
		totalLink.add(radio);
	}
	
	public void addTvList(TV tv) {
		tvList.add(tv);
		copyTotalLink.add(tv);
		totalLink.add(tv);
	}
	
	public void addTvRadioList(TVRadio tvRadio) {
		tvRadioList.add(tvRadio);
		copyTotalLink.add(tvRadio);
		totalLink.add(tvRadio);
	}
	//idScan()메서드를 이용해 ChannelID를 받아와 selectionSort를 이용해 오름차순 정렬//
	public void selectionSort() {
		int minNumber;
		
		for(int i= 0; i<totalLink.size(); i++) {
			minNumber = i;
			for(int j= i+1; j<totalLink.size(); j++) {
				if(idScan(minNumber, totalLink.get(minNumber)) > idScan(j, totalLink.get(j))) {
					minNumber = j;
				}
			}
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
	
	public String deldeteIndex(int index, Object obj) {
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
	
	public void searchType(String type) {
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

	public ArrayList<Radio> getRadioList() {
		return radioList;
	}

	public void setRadioList(ArrayList<Radio> radioList) {
		this.radioList = radioList;
	}

	public ArrayList<TV> getTvList() {
		return tvList;
	}

	public void setTvList(ArrayList<TV> tvList) {
		this.tvList = tvList;
	}

	public ArrayList<TVRadio> getTvRadioList() {
		return tvRadioList;
	}

	public void setTvRadioList(ArrayList<TVRadio> tvRadioList) {
		this.tvRadioList = tvRadioList;
	}

	
	
}
