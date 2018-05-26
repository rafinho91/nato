package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class NatoUtilTest {

    @Test
    public void encodeNato(){
        //given
        String textToEncode = "Ala ma kota";
        String expectedResult = "Alpha Lima Alpha / Mike Alpha / Kilo Oscar Tango Alpha";
        //when
        String result = NatoUtil.encodeNato(textToEncode);
        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void decodeNato(){
        //given
        String textToDecode = "Alpha Lima Alpha / Mike Alpha / Kilo Oscar Tango Alpha";
        String expectedResult = "ALA MA KOTA";
        //when
        String result = NatoUtil.decodeNato(textToDecode);
        //then
        Assert.assertEquals(expectedResult, result);
    }

}
