package com.example.demo.Utils

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.text.ParseException
import java.util.*


object DateUtils {
    val currentTimestamp: Timestamp
        get() = Timestamp(System.currentTimeMillis())

    fun dateToString(datePattern: String, date: Date): String {
        val df = SimpleDateFormat(datePattern)
        return df.format(date)
    }

    fun timestampToStringDate(datePattern: String, timestamp: Timestamp): String {
        return dateToString(datePattern, Date(timestamp.getTime()))
    }

    fun timestampToStringDate(date: Date): String {
        val df = SimpleDateFormat(Constants.DATE_FORMAT_DDMMMYY)
        return df.format(date)
    }

    @Throws(ParseException::class)
    fun stringToDate(format: String, dateStr: String): Date {
        val df = SimpleDateFormat(format)
        return df.parse(dateStr)
    }

    fun plusDate(d: Date, days: Int): Date {
        val c = Calendar.getInstance()
        c.time = d
        c.add(Calendar.DATE, days)

        return c.time
    }

    fun toBeginOfDay(d: Date): Date {
        val cal = Calendar.getInstance()
        cal.time = d
        cal.set(Calendar.HOUR_OF_DAY, 0)
        cal.set(Calendar.MINUTE, 0)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)

        return cal.time
    }

    // dd-MMM-yyyy
    fun timestampToStringDate2(date: Date): String {
        val df = SimpleDateFormat(Constants.DATE_FORMAT_DDMMMYYYY)
        return df.format(date)
    }

    @Throws(ParseException::class)
    fun stringToTimestamp(str_date: String): Timestamp? {
        val dateFormat = SimpleDateFormat(Constants.DATE_FORMAT_ddMMyyyy)

        try {
            val date = dateFormat.parse(str_date)
            System.out.println(date)
            return Timestamp(date.time)
        } catch (e: ParseException) {
            return null
        }

    }

    fun isThisDateValid(dateToValidate: String?): Boolean {
        if (dateToValidate == null) {
            return false
        }

        val sdf = SimpleDateFormat(Constants.DATE_FORMAT_ddMMyyyy)
        sdf.isLenient = false
        try {
            val date = sdf.parse(dateToValidate)
            System.out.println(date)
            return true
        } catch (e: ParseException) {
            return false
        }

    }

}