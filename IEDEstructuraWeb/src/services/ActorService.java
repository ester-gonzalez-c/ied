package services;

import java.util.ArrayList;
import java.util.List;

import domains.Actor;
import repositories.ActorRepository;

public class ActorService {
	
	private ActorRepository actorRepository;

	public List<Actor> getAllActors(){
		List<Actor> actorsList = new ArrayList<Actor>();
		actorsList=actorRepository.getAllActors();
		return actorsList;
	}
}
