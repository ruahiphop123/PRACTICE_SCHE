package com.SoftwareTech.PrcScheduleWeb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Computer_Room_Detail")
@Check(constraints = "max_computer_quantity >= available_computer_quantity")
public class ComputerRoomDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computer_room_detail_id")
    private Long computerRoomDetailId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id", referencedColumnName = "room_id", nullable = false)
    @JsonIgnore
    private Classroom classroom;

    @Column(name = "max_computer_quantity", nullable = false)
    private Integer maxComputerQuantity;

    @Column(name = "available_computer_quantity", nullable = false)
    private Integer availableComputerQuantity;
}
