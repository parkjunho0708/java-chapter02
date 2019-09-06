package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void status() {
		System.out.println("TV [channel=" + getChannel() + ", volume=" + getVolume() + ", power=" + isPower() + "]");
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		if(!on) {
			setPower(false);
			System.out.println("전원이 꺼졌습니다.");
		} else {
			setPower(true);
			System.out.println("전원이 켜졌습니다.");
		}
	}
	
	public void volume(int volumn) {
		setVolume(volumn);
		System.out.println("볼륨이 " + getVolume() + " 입니다.");
	}

	public void volume(boolean soundOn) {
		if(!soundOn) {
			System.out.println("볼륨 기능이 꺼졌습니다.");
		} else {
			System.out.println("볼륨 기능이 켜졌습니다.");
		}
	}

	public void channel(int channel) {
		setChannel(channel);
		System.out.println("채널이 " + channel + "으로 바뀌었습니다.");
	}

	public void channel(boolean channel) {
		if(!channel) {
			System.out.println("채널이 고정입니다.");
		} else {
			setChannel((int)(Math.random() * 100) + 1);
			System.out.println("채널이 바뀌었습니다.");
		}
	}

}
