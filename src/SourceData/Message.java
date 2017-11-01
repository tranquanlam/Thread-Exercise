package SourceData;

public class Message {
	private String message;
	private int id;
	private boolean status;

	public Message() {

	}

	public Message(String message, int id, boolean status) {
		super();
		this.message = message;
		this.id = id;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "message " + message + ".. id = " + id + " status = " + status;
	}

}
