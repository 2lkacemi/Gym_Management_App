package com.gym.persistence.entities;

import com.gym.persistence.enums.MembershipType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private MembershipType membershipType;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(mappedBy = "member")
    private List<Attendance> attendances;
    @OneToMany(mappedBy = "member")
    private List<Payment> payments;
    @OneToMany(mappedBy = "member")
    private List<FaceData> faceDataList;

    @Column(nullable = false, updatable = false)
    private String memberCode;
}
