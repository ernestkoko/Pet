package com.example.pet.data;

import android.provider.BaseColumns;

public final class PetContract {

    //to ensure no one instantiates this class outside
    private PetContract(){}

    public static final class PetEntry implements BaseColumns{
        //table name
        public final static String TABLE_NAME = "pets";
        //id
        public final static  String _ID = BaseColumns._ID;
        //name of pet
        public final static String COLUMN_PET_NAME = "name";
        //
        public static final String COLUMN_PET_BREED = "breed";
        public final static  String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }


}
