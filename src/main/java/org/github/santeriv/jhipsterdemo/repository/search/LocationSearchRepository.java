package org.github.santeriv.jhipsterdemo.repository.search;
import org.github.santeriv.jhipsterdemo.domain.Location;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Location} entity.
 */
public interface LocationSearchRepository extends ElasticsearchRepository<Location, Long> {
}
