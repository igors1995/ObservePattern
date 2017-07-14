import observer.ChatUser;
import observer.DesctopUser;
import observer.MobileUser;
import observer.TabletUser;
import subject.ChatRoom;

public class Test {
	public static void main(String[] args) {
		
		ChatRoom chatRoom = new ChatRoom();
		
		ChatUser Igor = new TabletUser("Igor", chatRoom);
		ChatUser Marko = new DesctopUser("Marko", chatRoom);
		ChatUser Nikola = new MobileUser("Nikola", chatRoom);
		ChatUser Petar = new TabletUser("Petar", chatRoom);
		
		chatRoom.add(Nikola);
		chatRoom.add(Marko);
		chatRoom.add(Igor);
		chatRoom.add(Petar);
		
		Igor.sendGroupMessage("Cao ja sam Igor");
		System.out.println();
		Marko.sendGroupMessage("Pozdrav!");
		System.out.println();
		Igor.showAllMessages();
		System.out.println();
		Petar.sendPrivateMessage("Pozz Igore", Igor);
		System.out.println();
		Nikola.showAllMessages();
		
	}
}
