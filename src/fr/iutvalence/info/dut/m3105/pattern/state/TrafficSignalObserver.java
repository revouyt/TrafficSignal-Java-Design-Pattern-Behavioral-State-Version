package fr.iutvalence.info.dut.m3105.pattern.state;

public interface TrafficSignalObserver {

	public void notifyTrafficSignaTurnedGreen();
	
	public void notifyTrafficSignaTurnedOrange();
	
	public void notifyTrafficSignaTurnedRed();
	
	public void notifyButtonPressed();
}
