package org.github.santeriv.jhipsterdemo.repository;
import org.github.santeriv.jhipsterdemo.domain.Location;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Location entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
