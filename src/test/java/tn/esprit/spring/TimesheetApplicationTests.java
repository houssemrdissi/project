package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
class TimesheetApplicationTests {


	@Autowired 
	IEntrepriseService us; 

	
	
	/////////////////////////////////// START HOUSSEM MODULE CRUD TEST ENTREPRISE ////////////////////////////////////////

	@Test
	public void testajouterEntreprise() throws ParseException {
		
		Entreprise e = new Entreprise("hou", "Cite El ");
		int entrepriseAdded= us.ajouterEntreprise(e); 
		
		assertEquals(e.getId(), entrepriseAdded);
	}
	
	@Test
	public void testupdateEntreprise() throws ParseException {
		
		Entreprise e = new Entreprise(3,"wa", "waaa ");

		Entreprise entrepriseAdded= us.updateEntreprise(e); 
		assertEquals(e.getRaisonSocial(), entrepriseAdded.getRaisonSocial());
		assertEquals(e.getName(), entrepriseAdded.getName());
	}
	
	@Test
	public void testdeleteEntreprise() throws ParseException {

		us.deleteEntrepriseById(33); 		
	    assertNull(us.getEntrepriseById(33));			
	}
	
	@Test
	public void testRetrieveEntreprise() {
		Entreprise entrepriseRetrieved = us.getEntrepriseById(4); 
		assertEquals(4L, entrepriseRetrieved.getId());
	}
	
	@Test
	public void testRetrieveAllEntreprise() {
		
		List<Entreprise> Entreprises = us.retrieveAllEntreprises(); 
		assertEquals(21, Entreprises.size());
	}
	
	///////////////////////////////////////// FINISH HOUSSEM MODULE CRUD TEST ENTREPRISE /////////////////////////////

	
	
	
	
	
	

}
