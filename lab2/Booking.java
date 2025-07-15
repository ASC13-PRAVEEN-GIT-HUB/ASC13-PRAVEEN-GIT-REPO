package lab2;

public class Booking {
    private String employeeId;
    private String meetingRoomID;

    private String meetingDate;
    private String meetingTime;
    private String duration;
    public Booking(String employeeId, String meetingRoomID, String meetingDate, String meetingTime, String duration){
        this.employeeId=employeeId;
        this.meetingRoomID=meetingRoomID;
        this.meetingDate=meetingDate;
        this.meetingTime=meetingTime;
        this.duration=duration;
    }
    public  String toString(){
        return "Booking for employee Id: "+ employeeId+
                ",date:"+ meetingDate +
                ".time:"+ meetingTime +
                ",Duration:"+ duration;
    }
}
