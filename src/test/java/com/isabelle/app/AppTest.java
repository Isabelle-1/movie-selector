package com.isabelle.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	// exception for when user inputs negative number

	@Test
	// exception for when user inputs negative number
	public void testHappy_throwsException_incorrectNumber() {

		Assertions.assertThrows(InputMismatchException.class, () -> {
//	   ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//	   System.setErr(new PrintStream(outputStream));

			ByteArrayInputStream in = new ByteArrayInputStream("happy\ntest\n".getBytes());
			System.setIn(in);

			Movie movie = new Movie();
			movie.Play();
		});
	}

	@Test
	// Positive outcome
	public void testHappy_correctValueInput() {

	}

	private static final String happyMovie1 = "Wild Hogs";
	private static final String happyMovie2 = "Grownups";

	@Test
	public void testHappySuccess() {
		ByteArrayInputStream in = new ByteArrayInputStream("happy\r\n2".getBytes());
		System.setIn(in);

		// grab the content of System.out
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

//call method
		Movie movie = new Movie();
		movie.Play();
//grabs whole output, transform into string and...
		String systemOutContent = out.toString();
		// String[] test = systemOutContent.split("\r\n");

		// This provides the new line character for whatever way the computer expects it
		String[] test = systemOutContent.split(System.lineSeparator());

		assertEquals(happyMovie1, test[8]);
		assertEquals(happyMovie2, test[9]);
	}

}
