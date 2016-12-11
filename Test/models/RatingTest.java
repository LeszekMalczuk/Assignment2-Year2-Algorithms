package models;

import static org.junit.Assert.*;


import org.junit.Test;

import models.Rating;
public class RatingTest {

	Rating rating = new Rating(2L, 3L, 4);

	@Test
	public void testCreate() {
		assertEquals(2L, rating.user_id);
		assertEquals(3L, rating.iteam_id);
		assertEquals(4, rating.rating);
	}

	@Test
	public void testToString()
	{

		assertEquals ("Rating{" + rating.user_id + ", " + rating.iteam_id + ", " + rating.rating + "}" ,rating.toString());
	}

}
