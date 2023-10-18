
package behavioural.mediator;

import java.util.HashMap;
import java.util.Map;

public class User {

	private String userName;

	/**
	 * 
	 * chatRoomId -> chatRoomInstance
	 * 
	 */
	private Map<String, ChatRoom> chatRooms;

	public User(String userName) {
		this.userName = userName;
		chatRooms = new HashMap<String, ChatRoom>();
	}

	public String getUserName() {
		return userName;
	}

	public void sendMessage(String message, String chatRoomId) throws Exception {
		if (!chatRooms.containsKey(chatRoomId)) {
			throw new Exception("no chat room found with provided with id: " + chatRoomId);
		}
		chatRooms.get(chatRoomId).sendMessage(this, message);
	}

	public void joinChatRoom(ChatRoom chatRoom) {
		chatRooms.put(chatRoom.getChatRoomId(), chatRoom);
	}
}
