package roomTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;

import scheduling.EventManager;
import scheduling.RoomManager;
import users.base.UserManager;

import java.util.HashMap;

public class RoomManagerTest {

    private RoomManager roomManager;
    private EventManager eventManager;

    @BeforeEach
    public void setup() {
        roomManager = new RoomManager();
        UserManager userManager = new UserManager();
        eventManager = new EventManager(roomManager, userManager);
    }

    @Test
    public void testAddRoom() {
        roomManager.addRoom(1, 50, true, true);
        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(1, "capacity: 50");
        assertEquals(rooms, roomManager.getRooms());
    }
}
