package tn.esprit.spring;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {

	@Autowired 
	IEntrepriseService us; 
	@Autowired
	DepartementRepository deptRepoistory;
	
	@Test
	public void testajouterDep() throws ParseException {
		
		Departement d = new Departement("Telecom");
		int departementAdded= us.ajouterDepartement(d); 
		
		assertEquals(d.getId(), departementAdded);
	}
	
	@Test
	public void testRetrieveDepByEntreId() {
		List<String> depRetrieved = us.getAllDepartementsNamesByEntreprise(3); 
		assertEquals(5, depRetrieved.size());
	}
	
	@Test
	public void testdeleteDep() throws ParseException {

		us.deleteDepartementById(17); 		
	  //  assertNull(deptRepoistory.findById(15));			
	}
	
	@Test
	public void testaffecterDepartementAEntreprise() throws ParseException {
		
		
		 us.affecterDepartementAEntreprise(1,2);
		 List<String>  depRetrieved = us.getAllDepartementsNamesByEntreprise(2);
		 String dep =deptRepoistory.findById(1).get().getName();
		 assertThat(depRetrieved, hasItems(dep));

					
	}
	

}
