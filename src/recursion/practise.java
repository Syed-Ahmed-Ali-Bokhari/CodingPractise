package recursion;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class practise {

    public static String trimAll(String value){


            value = value.trim().replaceAll("\u00A0", "");

        return value;
    }

    public static void main(String[] args) {

     String value = "{\n" +
             "\"acctInfo\" : {\"chAccAgeInd\" : \"05\", \"chAccChange\" : \"20180808\", \"chAccChangeInd\" : \"04\", \"chAccDate\" : \"20180808\", \"chAccPwChange\" : \"20180808\", \"chAccPwChangeInd\" : \"05\", \"nbPurchaseAccount\" : \"24\", \"provisionAttemptsDay\" : \"1\", \"txnActivityDay\" : \"2\", \"txnActivityYear\" : \"100\", \"paymentAccAge\" : \"20180808\", \"paymentAccInd\" : \"05\", \"shipAddressUsage\" : \"20180808\", \"shipAddressUsageInd\" : \"04\", \"shipNameIndicator\" : \"01\", \"suspiciousAccActivity\" : \"01\", \"chAccReqID\" : \"eldudkFvUzdvenZBc3lEbVI1d3RvdFFScGVScThHRFlZNThPQy93azhtMD0\"},\n" +
             "\"acctNumber\" : \"2200000000000000000\",\n" +
             "\"cardExpiryDate\" : \"2204\",\n" +
             "\"acctType\" : \"02\",\n" +
             "\"acquirerBIN\" : \"20000000000\",\n" +
             "\"acquirerMerchantID\" : \"000001\",\n" +
             "\"addrMatch\" : \"Y\",\n" +
             "\"browserAcceptHeader\" : \"text/html, application/xhtml+xml, */*\",\n" +
             "\"browserIP\" : \"216.58.197.110\",\n" +
             "\"browserJavaEnabled\" : \"true\",\n" +
             "\"browserLanguage\" : \"en-GB\",\n" +
             "\"browserColorDepth\" : \"24\",\n" +
             "\"browserScreenHeight\" : \"1137\",\n" +
             "\"browserScreenWidth\" : \"2021\",\n" +
             "\"browserTZ\" : \"-180\",\n" +
             "\"browserUserAgent\" : \"Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; rv:11.0) like Gecko\",\n" +
             "\"deviceChannel\" : \"02\",\n" +
             "\"dsReferenceNumber\" : \"DS_REF_NUMBER\",\n" +
             "\"dsTransID\" : \"dfdc1e3d-e820-4c99-bbdc-5cdeaf5802e4\",\n" +
             "\"dsURL\" : \"https://3ds-acs.ci.modirum.com/mpi-ds-emulator/rreq.jsp\",\n" +
             "\"mcc\" : \"5499\",\n" +
             "\"merchantCountryCode\" : \"246\",\n" +
             "\"merchantName\" : \"CoffeeHouse demo shop <dæmø{{>\",\n" +
             "\"merchantRiskIndicator\" : { \"shipIndicator\" : \"07\" },\n" +
             "\"messageCategory\" : \"01\",\n" +
             "\"messageType\" : \"AReq\",\n" +
             "\"messageVersion\" : \"2.1.0\",\n" +
             "\"notificationURL\" : \"https://3ds-acs.ci.modirum.com/mpi-ds-emulator/cres.jsp\",\n" +
             "\"purchaseAmount\" : \"10600\",\n" +
             "\"purchaseCurrency\" : \"840\",\n" +
             "\"purchaseExponent\" : \"2\",\n" +
             "\"purchaseDate\" : \"20170127075424\",\n" +
             "\"purchaseInstalData\" : \"123\",\n" +
             "\"recurringExpiry\" : \"20170127\",\n" +
             "\"recurringFrequency\" : \"1234\",\n" +
             "\"threeDSCompInd\" : \"U\",\n" +
             "\"threeDSRequestorAuthenticationInd\" : \"03\",\n" +
             "\"threeDSRequestorChallengeInd\" : \"01\",\n" +
             "\"threeDSRequestorID\" : \"000001\",\n" +
             "\"threeDSRequestorName\" : \"CoffeeHouse demo shop\",\n" +
             "\"threeDSRequestorURL\" : \"https://www.merchant.com\",\n" +
             "\"threeDSServerRefNumber\" : \"123456\",\n" +
             "\"threeDSServerTransID\" : \"696e8760-c94e-4d3a-88ec-e7d04863cc76\",\n" +
             "\"threeDSServerURL\" : \"https://3ds-acs.ci.modirum.com/mpi-ds-emulator/rreq.jsp\",\n" +
             "\"transType\" : \"28\",\n" +
             "\"messageExtension\" : [{\n" +
             "\"name\": \"testExtensionField\",\n" +
             "\"id\": \"ID1\",\n" +
             "\"criticalityIndicator\": \"true\",\n" +
             "\"data\": {\"key\": \"value\"} },{\n" +
             "\"name\": \"testExtensionNonCriticalField\",\n" +
             "\"id\": \"ID3\",\n" +
             "\"criticalityIndicator\": \"false\",\n" +
             "\"data\": {\"key\": \"value\"} }]\n" +
             "}";
        value = value.trim().replaceAll("\u00A0", "");
        System.out.println(trimAll(value));

    }
}