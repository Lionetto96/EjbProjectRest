package dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Gatto;

@Model
public class GattoDao implements Dao<Gatto> {
	
	@PersistenceContext(unitName = "persistenceUnit1")
	private EntityManager em;

	@Override
	public Gatto get(int id) {
		return em.find(Gatto.class, id);
	}

	@Override
	public List<Gatto> getAll() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("findAllGatti", Gatto.class)
				.getResultList();
	}

	@Override
	public void save(Gatto t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gatto t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gatto t) {
		// TODO Auto-generated method stub
		
	}

}
