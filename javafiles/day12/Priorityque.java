package day12;

import java.util.*;

public class Priorityque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("abc");
		q.add("vzf");
		q.add("vlm");
		q.add("tji");
		while(q.isEmpty()!=true) {
			System.out.println(q.remove());
		}
	}

}
