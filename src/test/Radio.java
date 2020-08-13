package test;

public class Radio {
	String channelType;
	int channelId;
	String channelName;
	String bsName;
	int frequency;
	
	public Radio(String channelType, int channelId, String channelName, String bsName, int frequency) {
		this.channelType = channelType;
		this.channelId = channelId;
		this.channelName = channelName;
		this.bsName = bsName;
		this.frequency = frequency;
	}
	
	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public int getChannelId() {
		return channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getBsName() {
		return bsName;
	}

	public void setBsName(String bsName) {
		this.bsName = bsName;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Radio [channelType=" + channelType + ", channelId=" + channelId + ", channelName=" + channelName
				+ ", bsName=" + bsName + ", frequency=" + frequency + "]";
	}
}
