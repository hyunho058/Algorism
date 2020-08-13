package test;

public class TVRadio {
	String channelType;
	int channelId;
	String channelName;
	String bsName;
	public TVRadio(String channelType, int channelId, String channelName, String bsName) {
		super();
		this.channelType = channelType;
		this.channelId = channelId;
		this.channelName = channelName;
		this.bsName = bsName;
	}
	
	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
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

	@Override
	public String toString() {
		return "TVRadio [channelType=" + channelType + ", channelId=" + channelId + ", channelName=" + channelName
				+ ", bsName=" + bsName + "]";
	}
}
