package com.example.jarblack.uccv01;

/**
 * Created by Jarblack on 15/11/2017.
 */

public class Estructura_BBDD {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private Estructura_BBDD() {}

    /* Inner class that defines the table contents */
    //public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "infoCarreras";
        public static final String NOMBRE_COLUMNA1 = "Id";
        public static final String NOMBRE_COLUMNA2= "Titulo";
        public static final String NOMBRE_COLUMNA3= "Creditos";
        public static final String NOMBRE_COLUMNA4= "Valor_credito";
        public static final String NOMBRE_COLUMNA5= "Duracion";
        public static final String NOMBRE_COLUMNA6= "Ciudad";
        public static final String NOMBRE_COLUMNA7= "Snies";
    //}

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Estructura_BBDD.TABLE_NAME + " (" +
                    Estructura_BBDD.NOMBRE_COLUMNA1 + " INTEGER PRIMARY KEY," +
                    Estructura_BBDD.NOMBRE_COLUMNA2 + " TEXT," +
                    Estructura_BBDD.NOMBRE_COLUMNA3 + " INTEGER" +
                    Estructura_BBDD.NOMBRE_COLUMNA4 + " INTEGER" +
                    Estructura_BBDD.NOMBRE_COLUMNA5 + " INTEGER" +
                    Estructura_BBDD.NOMBRE_COLUMNA6 + " TEXT" +
                    Estructura_BBDD.NOMBRE_COLUMNA7 + " INTEGER" +")";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Estructura_BBDD.TABLE_NAME;
}
