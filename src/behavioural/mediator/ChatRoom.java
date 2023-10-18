package behavioural.mediator;

import java.util.Date;

public class ChatRoom {

	private String chatRoomId;

	public ChatRoom(String chatRoomId) {
		this.chatRoomId = chatRoomId;
	}

	public String getChatRoomId() {
		return chatRoomId;
	}

	public void sendMessage(User user, String message) {
		System.out.println("[" + new Date().toString() + "] " + user.getUserName() + ": " + message);
	}
}
