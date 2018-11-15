/*
 *  Implement a sender and receiver chat system using threads and mutexes (Your solution should be thread safe). 
 *  There will be two senders who can each write to the message board, and then one receiver who will read from 
 *  the message board and display the messages. If at any time two threads are attempting to write to the message 
 *  board whichever tries first needs to lock the resource (Message board) and once it finishes writing unlocks it. 
 *  This can be done using ReentrantLock (java's version of a mutex) in Java. 
 */
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		Sender s1 = new Sender();
		Sender s2 = new Sender();
		Reciever r1 = new Reciever();
		MessageBoard m1 = new MessageBoard();
		
		Thread t1 = new Thread(s1,"Sender 1");
		Thread t2 = new Thread(s2,"Sender 2");
		Thread t3 = new Thread(r1,"Reciever 1");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
