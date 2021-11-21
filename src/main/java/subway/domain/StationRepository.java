package subway.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
    Station findByName(String name); // 쿼리 메소드라고 한다.
}