package com.ctrip.infosec.rule.resource;

import org.junit.Test;

import java.util.Map;
import org.junit.Ignore;

/**
 * Created by lpxie on 15-7-16.
 */
public class ForeignCardInfoTest {

    @Test
    @Ignore
    public void testGetPro() {
        Map singleResult = ForeignCardInfo.getProvinceNames("6", "111111");
        String Nationality = (String) singleResult.get("Nationality");
        String BankOfCardIssue = (String) singleResult.get("BankOfCardIssue");
        System.out.println(singleResult);
    }
}
