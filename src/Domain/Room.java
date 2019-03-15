package Domain;

public class Room {
    private int id;
    private int numberOfPersons;
    private int roomNumber;
    private int days;
    private String feedback;
    private int rating;
    private boolean available;

    public Room(int id, int numberOfPersons, int roomNumber, int days) {
        this.id = id;
        this.numberOfPersons = numberOfPersons;
        this.roomNumber = roomNumber;
        this.days = days;
        this.feedback = feedback;
        this.rating = rating;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", numberOfPersons=" + numberOfPersons +
                ", roomNumber=" + roomNumber +
                ", days=" + days +
                ", feedback='" + feedback + '\'' +
                ", rating=" + rating +
                ", available=" + available +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}