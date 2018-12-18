package com.arcagile.date;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtility {

    public static void main(String args[]) throws Exception {
        String requestTime = "2018-12-18T14:54:30.096Z";
        String resendVerifyDefaultTime = "60";
        Boolean isTimeCrossedInMinutes = getTimeDifference(requestTime, resendVerifyDefaultTime);
        System.out.println("Get Time difference in Minutes      : " + isTimeCrossedInMinutes);

        Boolean isTimeCrossedInMiliSeonds = getTimeDifferenceInMiliseconds(requestTime,resendVerifyDefaultTime);
        System.out.println("get Time difference in Miliseonds   : " +isTimeCrossedInMiliSeonds);
    }

    public static Boolean getTimeDifference(String gigyaEmailRequestedTime, String resendVerifyDefaultTime) throws Exception {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        long totalMinutes = 0;
        String todayDateStr = df.format(new Date());

        Date todayDate = df.parse(todayDateStr);
        Date requestTimeDate = df.parse(gigyaEmailRequestedTime);

        Timestamp todayDateTimeStamp = new java.sql.Timestamp(todayDate.getTime());
        Timestamp requestDateTimeStamp = new java.sql.Timestamp(requestTimeDate.getTime());

        System.out.println("Today date in timestamp     : " + todayDateTimeStamp);
        System.out.println("Request date in timestamp   : " + requestDateTimeStamp);

        // Get msec from each, and subtract.
        long diff = todayDateTimeStamp.getTime() - requestDateTimeStamp.getTime();

        System.out.println("Difference :  " + diff);

        //Get the difference between two dates in minutes
        long diffMinutes = diff / (60 * 1000) % 60;
        if (diffMinutes > 0) {
            totalMinutes = diffMinutes;
        }
        System.out.println("Difference in minutes : " + diffMinutes);

        //Get the difference between two dates in hours
        long diffHours = diff / (60 * 60 * 1000);
        System.out.println("Difference in hours : " + diffHours);

        if (diffHours >= 0) {
            long hourInMinutes = diffHours * 60;
            totalMinutes = totalMinutes + hourInMinutes;
        }
        System.out.println("Last mail sent in minutes   : " + totalMinutes);
        System.out.println("ResendVerifyDefaultTime     : " + resendVerifyDefaultTime);

        if (Integer.parseInt(resendVerifyDefaultTime) > totalMinutes)
            return Boolean.FALSE;
        else
            return Boolean.TRUE;
    }

    public static Boolean getTimeDifferenceInMiliseconds(String gigyaEmailRequestedTime, String resendVerifyDefaultTime) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        long totalMinutes = 0;
        String todayDateStr = df.format(new Date());

        Date todayDate = df.parse(todayDateStr);
        Date requestTimeDate = df.parse(gigyaEmailRequestedTime);

        long todayDateInMiliSeconds = todayDate.getTime();
        System.out.println("todayDateInMiliSeconds              : " + todayDateInMiliSeconds);

        long requestTimeDateInMiliSeconds = requestTimeDate.getTime();
        System.out.println("requestTimeDateInMiliSeconds        : " + requestTimeDateInMiliSeconds);

        long differenceInMiliSeconds = todayDateInMiliSeconds - requestTimeDateInMiliSeconds;
        System.out.println("differenceInMiliSeconds             : " + differenceInMiliSeconds);

        long resendVerifyDefaultTimeInMiliSeconds = Integer.parseInt(resendVerifyDefaultTime) * 60 * 1000;
        System.out.println("resendVerifyDefaultTimeInMiliSeconds: " + resendVerifyDefaultTimeInMiliSeconds);
        if(resendVerifyDefaultTimeInMiliSeconds > differenceInMiliSeconds) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }

    }

    public static void convertUTCToISTFormat() throws Exception {
        DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date date = utcFormat.parse("2018-12-18T11:41:19.973Z");

        DateFormat istFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        istFormat.setTimeZone(TimeZone.getTimeZone("IST"));

        System.out.println(istFormat.format(date));
    }
}
