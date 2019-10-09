package org.github.santeriv.jhipsterdemo.repository.search;
import org.github.santeriv.jhipsterdemo.domain.Department;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Department} entity.
 */
public interface DepartmentSearchRepository extends ElasticsearchRepository<Department, Long> {
}
