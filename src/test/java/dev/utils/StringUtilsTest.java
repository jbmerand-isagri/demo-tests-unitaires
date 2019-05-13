/**
 * 
 */
package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de test de StringUtils
 *
 */
public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance1() {
		int valeurObtenue = StringUtils.levenshteinDistance("banane", "canane");
		assertEquals(1, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistance0() {
		int valeurObtenue = StringUtils.levenshteinDistance("LOG", "LOG");
		assertEquals(0, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistanceCaseSensitive() {
		int valeurObtenue = StringUtils.levenshteinDistance("log", "LOG");
		assertEquals(3, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistance2Void() {
		int valeurObtenue = StringUtils.levenshteinDistance("", "");
		assertEquals(0, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistanceNull() {
		int valeurObtenue = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, valeurObtenue);

	}

	@Test
	public void testLevenshteinDistance1Void() {
		int valeurObtenue = StringUtils.levenshteinDistance("b", "");
		assertEquals(1, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistance1Null() {
		int valeurObtenue = StringUtils.levenshteinDistance(null, "lac");
		assertEquals(3, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistance1Null2() {
		int valeurObtenue = StringUtils.levenshteinDistance("a", null);
		assertEquals(1, valeurObtenue);
	}

	@Test
	public void testLevenshteinDistance1Null3() {
		int valeurObtenue = StringUtils.levenshteinDistance("", null);
		assertEquals(0, valeurObtenue);
	}

}
