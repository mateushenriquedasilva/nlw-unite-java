package rocketseat.com.pass_in.domain.checkin;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rocketseat.com.pass_in.domain.attendee.Attendee;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "check_in")
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_at")
    private LocalDateTime craetedAt;

    @OneToOne
    @JoinColumn(name = "attendee_id", nullable = false)
    private Attendee attendee;
}
