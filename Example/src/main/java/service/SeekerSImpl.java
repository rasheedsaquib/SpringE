package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.SeekerC;
import jakarta.transaction.Transactional;
import model.Seeker;

@Service
@Transactional
public class SeekerSImpl implements SeekerS  {

	@Autowired
	private SeekerC see;
	
	@Override
	public Seeker createSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		return see.createSeeker(seeker);
	}
	
	@Override
	public Seeker addSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		return see.addSeeker(seeker);
	}

	@Override
	public Seeker updateSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		return see.updateSeeker(seeker);
	}

	@Override
	public void deleteSeeker(Long empid) {
		// TODO Auto-generated method stub
		 see.deleteSeeker(empid);
	}

	@Override
	public void getSeeker(Long empid) {
		// TODO Auto-generated method stub
		 see.getSeeker(empid);
	}

	@Override
	public List<Seeker> getAllSeeker() {
		// TODO Auto-generated method stub
		return see.getAllSeeker();
	}


}
