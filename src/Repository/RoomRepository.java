package Repository;
import Domain.Room;
import Domain.RoomAverageRating;
import Domain.RoomValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository {
    private Map<Integer, Room> storage = new HashMap<>();

    private RoomValidator validator;

    /**
     * instantiates a validator for room;
     * @param validator is the used validator
     */
    public RoomRepository (RoomValidator validator){
        this.validator = validator;
    }

    /**
     *
      * @param room to add a room;
     */
    public void add(Room room){
        if (storage.containsKey(room.getId())){
            throw new RuntimeException("The room with the given ID already exists");
        }
        validator.validate(room);
        storage.put(room.getId(), room);
    }

    /**
     *
     * @param room to update a room ;
     */
    public void update (Room room){
        if (!storage.containsKey(room.getId())){
            throw new RuntimeException("There is no room to this ID to update");
        }
        validator.validate(room);
        storage.put(room.getId(), room);
    }

    /**
     *
     * @return a list of all rooms;
     */
    public List<Room> getAll(){
        return new ArrayList<>(storage.values());

    }

}
