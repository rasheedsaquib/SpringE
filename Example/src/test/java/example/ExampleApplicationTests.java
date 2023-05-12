package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import model.Seeker;
import service.SeekerS;

@SpringBootTest
class ExampleApplicationTests {
	
	@Autowired
	SeekerS service;


		
		@Test
		void testaddSeeker() {
			
			Seeker seeker=new Seeker(0,"rasheedsaquib@gamil.com","rasheed");
			Seeker see=service.addSeeker(seeker);
			assertEquals(see.getEmail(), "rasheedsaquib@gamil.com");
		
	}

}
