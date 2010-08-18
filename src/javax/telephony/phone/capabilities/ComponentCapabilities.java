package javax.telephony.phone.capabilities;

public abstract interface ComponentCapabilities {
	public abstract boolean canControl();

	public abstract boolean canObserve();

	public abstract boolean canSetButtonPressThreshold();
}

