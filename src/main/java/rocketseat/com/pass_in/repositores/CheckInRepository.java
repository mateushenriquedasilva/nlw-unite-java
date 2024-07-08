package rocketseat.com.pass_in.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.pass_in.domain.checkin.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
