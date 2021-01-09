package DatabaseTest;
import gateway.Database;
import gateway.RoomUpdater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scheduling.RoomManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomUpdaterTest {
    private Database database;
    private RoomUpdater roomUpdater;
    private RoomManager roomManager;

    @BeforeEach
    public void setUp() {
        database = new Database();
        roomManager = new RoomManager();
        roomUpdater = new RoomUpdater(roomManager, database);
    }

    @Test
    public void testSaveRoom(){
        roomManager.addRoom(2,4,true,false);
        roomUpdater.addRoom(2,4,true,false);
        RoomManager roomManager2 = new RoomManager();
        RoomUpdater roomUpdater2 = new RoomUpdater(roomManager2, database);
        roomUpdater2.loadRooms();
        assertEquals(1, roomManager2.getRooms().size());
    }
}
