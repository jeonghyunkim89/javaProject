package com.kh.practice.set.model.compare;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparable<Lottery> {
	
	public int compareTo(Lottery o) {
		
		return ((Comparable<Lottery>) o).compareTo(o);
	}
}
	
	