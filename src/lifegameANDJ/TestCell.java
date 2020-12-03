package lifegameANDJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCell {
	
	//Any live cell with fewer than two live neighbours dies, as if by underpopulation.

	//@Test
	void test() {
		
		Cell c =new Cell(1,true);
		c.tick();
		boolean status = c.getStatus();
		assertFalse(status);		
		
	}
	
	//@Test
	void test11() {
		
		Cell c =new Cell(0,true);
		c.tick();
		boolean status = c.getStatus();
		assertFalse(status);		
		
	}
	
	//Any live cell with two or three live neighbours lives on to the next generation.
	
	//@Test
	void testLivecellTwoNeighboursLives() {
		
		Cell c =new Cell(2,true);
		c.tick();
		boolean status = c.getStatus();
		assertTrue(status);		
		
	}
	
	@Test
	void test111() {
		
		Cell c =new Cell(3,true);
		c.tick();
		boolean status = c.getStatus();
		assertTrue(status);		
		
	}
	
	//Any live cell with more than three live neighbours dies, as if by overpopulation.
	@Test
	void test2() {
		
		Cell c =new Cell(4,true);
		c.tick();
		boolean status = c.getStatus();
		assertFalse(status);		
		
	}
	
	//Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
	@Test
	void test22() {
		
		Cell c =new Cell(3,false);
		c.tick();
		boolean status = c.getStatus();
		assertTrue(status);		
		
	}

}
