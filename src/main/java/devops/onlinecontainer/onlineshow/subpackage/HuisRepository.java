package devops.onlinecontainer.onlineshow.subpackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface HuisRepository extends JpaRepository<Huis, Long> {

}
