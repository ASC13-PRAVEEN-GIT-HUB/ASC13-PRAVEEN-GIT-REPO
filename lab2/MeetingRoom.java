package lab2;

import java.util.*;
import java.time.*;


class MeetingRoom {
    private String roomId;
    private int capacity;
    private int floor;

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloor() {
        return floor;
    }


    public String toString() {
        return "Room ID: " + roomId + ", Capacity: " + capacity + ", Floor: " + floor;
    }
}


class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }

    public String getZoomAccountId() {
        return zoomAccountId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Zoom Device ID: " + zoomDeviceId + ", Zoom Account ID: " + zoomAccountId;
    }
}

class Booking {
    private String employeeId;
    private String roomId;
    private LocalDate date;
    private LocalTime time;
    private int durationInMinutes;

    public Booking(String employeeId, String roomId, LocalDate date, LocalTime time, int durationInMinutes) {
        this.employeeId = employeeId;
        this.roomId = roomId;
        this.date = date;
        this.time = time;
        this.durationInMinutes = durationInMinutes;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Room: " + roomId + ", Date: " + date + ", Time: " + time + ", Duration: " + durationInMinutes + " mins";
    }
}


class MeetingRoomManager {
    private List<MeetingRoom> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public void addRoom(MeetingRoom room) {
        rooms.add(room);
    }
    public void bookRoom(String employeeId, String roomId, LocalDate date, LocalTime time, int duration) {
        boolean roomExists = rooms.stream().anyMatch(r -> r.getRoomId().equals(roomId));
        if (!roomExists) {
            System.out.println("Room ID not found.");
            return;
        }
        bookings.add(new Booking(employeeId, roomId, date, time, duration));
        System.out.println("Booking successful.");
    }


    public void getBookingsByDate(LocalDate date) {
        System.out.println("Bookings on " + date + ":");
        bookings.stream()
                .filter(b -> b.getDate().equals(date))
                .forEach(System.out::println);
    }

    public void displayRooms() {
        System.out.println("All Meeting Rooms:");
        for (MeetingRoom room : rooms) {
            System.out.println(room);
        }
    }

}

