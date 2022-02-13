package com.github.nikel90;

import org.junit.Assert;
import org.junit.Test;

public class DamerauLevenshteinTest {

    /**
     * Checking the distance for sources and target null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void checkingDistanceForNull() {
        DamerauLevenshtein.calculateDistance(null, null);
    }

    /**
     * Checking the distance for sources null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void checkingDistanceForSourceNull() {
        DamerauLevenshtein.calculateDistance(null, "horse");
    }

    /**
     * Checking the distance for target null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void checkingDistanceForTargetNull() {
        DamerauLevenshtein.calculateDistance("horse", null);
    }

    /**
     * Checking the distance for source and target empty string.
     */
    @Test
    public void checkingDistanceForEmpty() {
        int distance = DamerauLevenshtein.calculateDistance("", "");

        Assert.assertEquals(0, distance);
    }

    /**
     * Checking the distance for target empty string.
     */
    @Test
    public void checkingDistanceForTargetEmpty() {
        String source = "horse";
        int distance = DamerauLevenshtein.calculateDistance(source, "");

        Assert.assertEquals(source.length(), distance);
    }

    /**
     * Checking the distance for source empty string.
     */
    @Test
    public void checkingDistanceForSourceEmpty() {
        String target = "horse";
        int distance = DamerauLevenshtein.calculateDistance("", target);

        Assert.assertEquals(target.length(), distance);
    }

    /**
     * Checking the distance with the same lines.
     */
    @Test
    public void checkingDistanceForSameLine() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "horse");

        Assert.assertEquals(0, distance);
    }

    /**
     * Checking the distance with one added character.
     */
    @Test
    public void checkingDistanceForOneAddedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "horses");

        Assert.assertEquals(1, distance);
    }

    /**
     * Checking the distance with one deleted character.
     */
    @Test
    public void checkingDistanceForOneDeletedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "hors");

        Assert.assertEquals(1, distance);
    }

    /**
     * Checking the distance with a one modified symbols.
     */
    @Test
    public void checkingDistanceForOneModifiedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "hores");

        Assert.assertEquals(1, distance);
    }

    /**
     * Checking the distance with one changed character.
     */
    @Test
    public void checkingDistanceForOneChangedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "horsi");

        Assert.assertEquals(1, distance);
    }

    /**
     * Checking the distance with two added character.
     */
    @Test
    public void checkingDistanceForTwoAddedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "horsess");

        Assert.assertEquals(2, distance);
    }

    /**
     * Checking the distance with two deleted character.
     */
    @Test
    public void checkingDistanceForTwoDeletedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "hor");

        Assert.assertEquals(2, distance);
    }

    /**
     * Checking the distance with a two modified symbols.
     */
    @Test
    public void checkingDistanceForTwoModifiedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "ohres");

        Assert.assertEquals(2, distance);
    }

    /**
     * Checking the distance with two changed character.
     */
    @Test
    public void checkingDistanceForTwoChangedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "harsi");

        Assert.assertEquals(2, distance);
    }

    /**
     * Checking the distance with three changed character.
     */
    @Test
    public void checkingDistanceForThreeChangedChar() {
        int distance = DamerauLevenshtein.calculateDistance("horse", "ohsroe");

        Assert.assertEquals(3, distance);
    }
}
