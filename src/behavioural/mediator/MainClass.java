package behavioural.mediator;

public class MainClass {

	public static void main(String[] args) {

		ChatRoom chatRoom = new ChatRoom("chatRoom1");

		User gaurav = new User("Gaurav");
		gaurav.joinChatRoom(chatRoom);

		User paras = new User("Paras");
		paras.joinChatRoom(chatRoom);

		try {

			gaurav.sendMessage("Hey everyone, gaurav here", chatRoom.getChatRoomId());
			paras.sendMessage("Hey gaurav", chatRoom.getChatRoomId());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
