package sas.edu;

import org.junit.Assert;

/*
 * @author Alona Sviridova
 * @version Ver_1.1
 * 08.08.2020
 * Testing
 */
import java.util.logging.Logger;

public class RoundTest {

    Round roundForTest = new Round(4, 45);
    private static final Logger LOGGER = Logger.getLogger(Round.class.getName());


    //Perimeter method
    @org.junit.Test
    public void whenRadius4Angle45ThenPerimeter25() {
        LOGGER.info("ROUND_PERIMETER_INFO");
        Assert.assertEquals(25.133, roundForTest.getPerimeter(), 0.01);
    }

    //Area method
    @org.junit.Test
    public void whenRadius4Angle45ThenArea50() {
        LOGGER.info("ROUND_AREA_INFO");
        Assert.assertEquals(50.265, roundForTest.getArea(), 0.01);
    }

    //Sector area method
    @org.junit.Test
    public void whenRadius4Angle45ThenSectorArea360() {
        LOGGER.info("ROUND_SECTOR_AREA_INFO");
        Assert.assertEquals(360, roundForTest.getSectorArea(), 0.01);
    }

    //
    @org.junit.Test
    public void whenRadius4Angle45ThenSegmentArea353() {
        LOGGER.info("ROUND_SEGMENT_AREA");
        Assert.assertEquals(353.192, roundForTest.getSegmentArea(), 0.01);
    }

    @org.junit.Test
    public void whenRadius4Angle45ThenArcLength180() {
        LOGGER.info("ROUND_ARC_LENGTH");
        Assert.assertEquals(180, roundForTest.getArcLength(), 0.01);
    }
}