package co.grandcircus.practice_assessment6;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {

	List<Country> findAll();
	List<Country> findByContinent(String continent);
}
