package models;

import static org.junit.Assert.*;

import org.junit.Test;

import models.User;

import java.util.HashSet;
import java.util.Set;



public class UserTest
{
	User Leonard = new User ("Leonard", "Hernandes", 24 ,  "M", "other");

	@Test
	public void testCreate()
	{
		assertEquals ("Leonard",               Leonard.firstName);
		assertEquals ("Hernandes",             Leonard.surname);
		assertEquals (24,  					 Leonard.age);   
		assertEquals ("M",              Leonard.gender);
		assertEquals ("other",              Leonard.ocupational);
	}



	@Test
	public void testEquals()
	{
		User leonard = new User ("Leonard", "Hernandes", 24,  "M", "other"); 


		assertEquals(leonard, leonard);
		assertEquals(leonard, leonard);

	} 



}
