package com.zipcodewilmington.phone;

import com.zipcodewilmington.exceptions.InvalidPhoneNumberFormatException;
import com.zipcodewilmington.tools.RandomNumberFactory;
import sun.rmi.runtime.Log;


import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 5/1/17.
 */
public final class PhoneNumberFactory {
    private static final Logger logger = Logger.getGlobal();

    private PhoneNumberFactory() {
        /** This constructor is private
         *  This class is uninstantiable */
    }

    /**
     * @param phoneNumberCount - number of PhoneNumber objects to instantiate
     * @return array of randomly generated PhoneNumber objects
     */ //TODO - Implement logic
    public static PhoneNumber[] createRandomPhoneNumberArray(int phoneNumberCount) {
        Random random = new Random();
        phoneNumberCount = 5;
        for (int x = 0; x < 5; x++){
            return createRandomPhoneNumberArray(5) ;
        }
        return null;
    }

    /**
     * @return an instance of PhoneNumber with randomly generated phone number value
     */ //TODO - Implement logic
    public static PhoneNumber createRandomPhoneNumber() {
       int ac1 = RandomNumberFactory.createInteger(100, 999);
       int ac2 = RandomNumberFactory.createInteger(100, 999);
       int ac3 = RandomNumberFactory.createInteger(1000, 9999);

        return createPhoneNumberSafely(ac1, ac2, ac3);
    }


    /**
     * @param areaCode          - 3 digit code
     * @param centralOfficeCode - 3 digit code
     * @param phoneLineCode     - 4 digit code
     * @return a new phone number object
     */ //TODO - if input is valid, return respective PhoneNumber object, else return null
    public static PhoneNumber createPhoneNumberSafely(int areaCode, int centralOfficeCode, int phoneLineCode) {
        try {
            return createPhoneNumber("(" + areaCode + ")" + "-" +  centralOfficeCode + "-" +  phoneLineCode);
        } catch (InvalidPhoneNumberFormatException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO,"(###)-###-#### is not a valid phone number");
        return null;
    }

    /**
     * @param phoneNumberString - some String corresponding to a phone number whose format is `(###)-###-####`
     * @return a new phone number object
     * @throws InvalidPhoneNumberFormatException - thrown if phoneNumberString does not match acceptable format
     */ // TODO - Add throws statement to method signature
    public static PhoneNumber createPhoneNumber(String phoneNumberString) throws InvalidPhoneNumberFormatException {
       PhoneNumber phoneNumber = new PhoneNumber(phoneNumberString);
        logger.log(Level.INFO, "\"Attempting to create a new PhoneNumber object with a value of (###)-###-####" );
        return phoneNumber;
    }






}

