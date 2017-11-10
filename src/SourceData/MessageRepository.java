package SourceData;

import java.util.ArrayList;
import java.util.Random;

import Utils.StringUtils;

public class MessageRepository {
	private final int MAX = 1000;
	private final int DELAY = 500;
	public ArrayList<Message> messages;
	private Thread threadCreateMessage;

	public MessageRepository() {
		messages = new ArrayList<>();
		threadCreateMessage = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (messages.size() < MAX)
					{
						Message message = new Message();
						message.setId(new Random().nextInt(MAX));
						message.setMessage(StringUtils.getRandomString());
						message.setStatus(new Random().nextBoolean());
						messages.add(message);
					
					}
					try {
						Thread.sleep(DELAY);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		threadCreateMessage.start();
	}

	public Message getMessage() {
		if (messages.size() != 0) {
     //	System.out.println(messages.size()+" messages size");
			Message message = messages.remove(0);
			return message;
		}
		return null;
	}
}
