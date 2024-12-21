package com.SoftwareTech.PrcScheduleWeb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
    name = "Semester",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "UK_Semester_01",
            columnNames = {"semester", "range_of_year"}
        )
    }
)
public class Semester {
    @Id
    @Column(name = "semester_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long semesterId;

    @Column(name = "semester", nullable = false)
    private Byte semester;

    @Column(name = "range_of_year", length = 20, nullable = false)
    private String rangeOfYear;

    @Column(name = "first_week", nullable = false)
    private Byte firstWeek;

    @Column(name = "total_week", nullable = false)
    private Byte totalWeek;

    @Column(name = "starting_date", nullable = false)
    private Date startingDate;

    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TeacherRequest> teacherRequests;

    @PrePersist
    protected void onCreate() {
        if (this.startingDate == null) {
            this.startingDate = new Date(); // Default to current date
        }
    }
}
