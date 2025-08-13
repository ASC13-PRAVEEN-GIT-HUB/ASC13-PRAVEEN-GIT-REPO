package com.demo.entity;
import javax.persistence.*;

@Entity
@Table(name="COURSES")

public class VirtualEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Course_Name", nullable = false)
    private String courseName;
    @Column(name = "Course_Author", nullable = false)
    private String courseAuthor;
    @Column(name = "durationInHour", nullable = false)
    private Byte durationInHour;
    @Column(name = "availability", nullable = false)
    private String availability;

    public VirtualEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }

    public Byte getDurationInHour() {
        return durationInHour;
    }

    public void setDurationInHour(Byte durationInHour) {
        this.durationInHour = durationInHour;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
