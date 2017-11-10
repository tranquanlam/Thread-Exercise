package SourceData;

import java.util.HashMap;
import java.util.Set;

public class toHasMap {
	public HashMap<Integer, Message> hasMap = new HashMap<Integer, Message>();

	public toHasMap() {
		Thread new1 = new Thread(new Runnable() {

			@Override
			public void run() {
			
				MessageRepository messageRepository = new MessageRepository();

				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					hasMap.put(i, messageRepository.getMessage());
					System.out.println("id : " + i + " " + hasMap.get(i) + "   " + hasMap.size());
				}
			}
		});
		new1.start();
	}

	public Message getHasMap(Integer key) {
		Message mes = hasMap.get(key);
		return mes;
	}


	public int getSize() {
		return hasMap.size();
	}

}
