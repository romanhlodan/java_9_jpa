package entity;

import lombok.*;

import javax.persistence.*;
@Data
@ToString(exclude = "person")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String SerialNumber;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Person person;
}
