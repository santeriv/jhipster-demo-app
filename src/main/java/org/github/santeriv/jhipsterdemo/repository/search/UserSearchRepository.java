package org.github.santeriv.jhipsterdemo.repository.search;

import org.github.santeriv.jhipsterdemo.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
