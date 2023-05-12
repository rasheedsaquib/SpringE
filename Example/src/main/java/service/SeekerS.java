package service;

import java.util.List;

import model.Seeker;


public interface SeekerS {
	
	Seeker createSeeker(Seeker seeker);
	
	Seeker addSeeker(Seeker seeker);
	
	Seeker updateSeeker(Seeker seeker);

	void deleteSeeker(Long empid);

	void getSeeker(Long empid); 
	
	List<Seeker> getAllSeeker();

}
