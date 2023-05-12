package repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import model.Seeker;

@EnableAutoConfiguration
@EnableJpaRepositories
public interface SeekerR extends JpaRepository<Seeker, Long> {

	
	

}
