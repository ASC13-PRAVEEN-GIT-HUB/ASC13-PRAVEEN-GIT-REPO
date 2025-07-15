package lab2;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        MeetingRoomManager manager = new MeetingRoomManager();
        manager.addRoom(new MeetingRoom("MR101", 10, 1));
        manager.addRoom(new ZoomMeetingRoom("MR102", 8, 2, "ZDEV123", "zoom123@company.com"));
        manager.displayRooms();
        manager.bookRoom("EMP1", "MR1", LocalDate.of(2025, 1, 1), LocalTime.of(10, 0), 60);
        manager.bookRoom("EMP2", "MR2", LocalDate.of(2025, 2, 1), LocalTime.of(11, 0), 30);
        manager.getBookingsByDate(LocalDate.of(2025, 7, 14));
    }
}
