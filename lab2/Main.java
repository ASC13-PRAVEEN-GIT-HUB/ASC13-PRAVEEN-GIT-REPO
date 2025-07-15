package lab2;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        MeetingRoomManager manager = new MeetingRoomManager();

        // Add rooms
        manager.addRoom(new MeetingRoom("MR101", 10, 1));
        manager.addRoom(new ZoomMeetingRoom("MR102", 8, 2, "ZDEV123", "zoom123@company.com"));

        manager.displayRooms();

        // Book rooms
        manager.bookRoom("EMP001", "MR101", LocalDate.of(2025, 7, 14), LocalTime.of(10, 0), 60);
        manager.bookRoom("EMP002", "MR102", LocalDate.of(2025, 7, 14), LocalTime.of(11, 0), 30);

        // Retrieve bookings by date
        manager.getBookingsByDate(LocalDate.of(2025, 7, 14));
    }
}
