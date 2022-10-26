package tv;

public class TV {
	private int channel; // 1~255 사이 값을 가지게 하고 넘어 갈 때는 라운딩 시킬 것
	private int volume;	 // 0~100 사이 값을 가지게 하고 넘어 갈 때는 라운딩 시킬 것 
	private boolean power;
	
	public void status() {
		System.out.println(
			"TV[channel=" + channel + 
			", volume="   + volume  + 
			", power="    + (power ? "On" : "Off") + "]");
	}
	
	
}
