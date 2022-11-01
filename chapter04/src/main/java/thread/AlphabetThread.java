package thread;

import java.util.List;

public class AlphabetThread extends Thread {
	private List list;
	
	public AlphabetThread(List list) {
		this.list = list;
	}
	
	@Override 
	public void run() {
		
		synchronized(list){
			list.add("");
			list.add("");
			for(int i = 0 ; i < 2; i++) {
				
			}
				
		}
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}
