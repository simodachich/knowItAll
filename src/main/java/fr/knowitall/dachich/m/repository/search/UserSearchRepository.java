package fr.knowitall.dachich.m.repository.search;

import fr.knowitall.dachich.m.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
