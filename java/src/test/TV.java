package test;

public class TV {
	String channelType;
	int channelId;
	String channelName;
	String bsName;
	int channelNumber;
	String bDivision;
	
	public TV(
			String channelType,
			int channelId, 
			String channelName, 
			String bsName, 
			int channelNumber, 
			String bDivision) {
		super();
		this.channelType = channelType;
		this.channelId = channelId;
		this.channelName = channelName;
		this.bsName = bsName;
		this.channelNumber = channelNumber;
		this.bDivision = bDivision;
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
	public int getChannelNumber() {
		return channelNumber;
	}
	public void setChannelNumber(int channelNumber) {
		this.channelNumber = channelNumber;
	}
	public String getbDivision() {
		return bDivision;
	}
	public void setbDivision(String bDivision) {
		this.bDivision = bDivision;
	}
	@Override
	public String toString() {
		return "TV [channelType=" + channelType + ", channelId=" + channelId + ", channelName=" + channelName
				+ ", bsName=" + bsName + ", channelNumber=" + channelNumber + ", bDivision=" + bDivision + "]";
	}
	
}
