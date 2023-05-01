package Exercitiul4;

import java.util.Comparator;

public class ComparatorCameraInaltime implements Comparator<Camera> {

	@Override
	public int compare(Camera o1, Camera o2) {
		if(o1.getInaltime() > o2.getInaltime()) {
			return 1;
		}
		if(o1.getInaltime() < o2.getInaltime()) {
			return -1;
		}
		return 0;
	}
	

}
