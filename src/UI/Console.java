package UI;
import Domain.Room;
import Domain.RoomAverageRating;
import Service.RoomService;
import java.util.Scanner;


public class Console {
    private RoomService service;
    private Scanner scanner;

    public Console (RoomService service){
        this.service = service;
        scanner = new Scanner(System.in);
    }
    private void showMenu (){
        System.out.println("1.Check-in");
        System.out.println("2.Check-out");
        System.out.println("3.Room rating");
        System.out.println("4.Show all rooms");
        System.out.println("0.Exit");
    }
        public void run(){
            while (true) {
                showMenu();
                int option = scanner.nextInt();
                if (option == 1){
                    handleRoomEntry ();
                } else if (option == 2){
                    handleRoomExit ();
                } else if (option == 3){
                    handleRoomReport ();
                } else if (option == 4){
                    handleShowAll ();
                } else if (option == 0){
                    break;
                }
            }
    }
    private void handleRoomReport () {
        for (RoomAverageRating roomAverage : service.getRoomAverageRating())
            System.out.println (roomAverage);
    }
    private void handleRoomExit () {
        try {
            System.out.println ("Write the room number:");
            int roomNumber = Integer.parseInt(scanner.nextLine());
            System.out.println ("Write the feedback:");
            String feedback = scanner.nextLine();
            System.out.println ("Write the room rating:");
            int rating = Integer.parseInt(scanner.nextLine());
            service.checkOut(roomNumber, feedback, rating);
        } catch (RuntimeException runtimeException) {
            System.out.println("There are errors: " + runtimeException.getMessage());
        }
    }
    private void handleShowAll () {
        for (Room r : service.getAll()){
            System.out.println(r);
        }
    }
    private void handleRoomEntry (){
        try {
        System.out.println ("Write the room id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println ("Write the room number:");
        int roomNumber = Integer.parseInt(scanner.nextLine());
        System.out.println ("Write the number of persons:");
        int numberOfPersons = Integer.parseInt(scanner.nextLine());
        System.out.println ("Write the number of days:");
        int days = Integer.parseInt(scanner.nextLine());
        service.checkIn(id, roomNumber, numberOfPersons, days);
    } catch (RuntimeException runtimeException) {
        System.out.println("There are errors: " + runtimeException.getMessage());
    }

    }


}
