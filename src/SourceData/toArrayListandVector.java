package SourceData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import javax.swing.plaf.SliderUI;

public class toArrayListandVector {
	public ArrayList<Message> list2;
	public Vector<Message> vector1;

	public toArrayListandVector() {
		
		list2 = new ArrayList<Message>();
		vector1 = new Vector<Message>();
		
		Thread newlist = new Thread (new Runnable() {
			
			@Override
			public void run() {

				toHasMap map = new toHasMap();
				int key=0;
				int key1=0;
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				while(true)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if ((map.getHasMap(key).isStatus() == true)) {
						list2.add(map.getHasMap(key));
						key++;
					}
					else {
						vector1.add(map.getHasMap(key1));
						key1++;
					}
					
					if(list2.isEmpty()==false)
					System.out.println(list2.get(key-1));
					if(vector1.isEmpty()==false)
    				System.out.println(vector1.get(key1-1));
					
				}
				
			}
		});
		newlist.start();
	}
}
