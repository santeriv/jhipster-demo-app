package org.github.santeriv.jhipsterdemo.repository.search;
import org.github.santeriv.jhipsterdemo.domain.Task;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Task} entity.
 */
public interface TaskSearchRepository extends ElasticsearchRepository<Task, Long> {
}
