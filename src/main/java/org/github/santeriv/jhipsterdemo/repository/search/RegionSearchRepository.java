package org.github.santeriv.jhipsterdemo.repository.search;
import org.github.santeriv.jhipsterdemo.domain.Region;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Region} entity.
 */
public interface RegionSearchRepository extends ElasticsearchRepository<Region, Long> {
}
