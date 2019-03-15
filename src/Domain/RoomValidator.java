package Domain;

public class RoomValidator {
    /**
     *
     * @param room - validates room
     * @throws Runtime Exceptions if there are errors
     */
    public void validate (Room room) {
        if (room.getDays() <= 0) {
            throw new RuntimeException("The room number cannot be 0 or negative");
        }
        if (room.isAvailable()== true && room.getRoomNumber()<=0){
            throw new RuntimeException("This room does not exist");
        }
        String feedback = room.getFeedback();
        if (feedback.isEmpty()){
            throw new RuntimeException("There is no given feedback");
        }
        if (room.getRating()>=1 && room.getRating()<=5){
            throw new RuntimeException("Rating must be a number between 1 and 5");
        }
    }

}
