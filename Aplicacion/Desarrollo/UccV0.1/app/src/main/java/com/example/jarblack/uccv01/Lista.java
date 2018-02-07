package com.example.jarblack.uccv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Jarblack on 9/11/2017.
 */

public class Lista extends AppCompatActivity{
    private Toolbar toolbar;

    ListView listaDatos;
    ArrayList<Datos> Lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_bloques);



        toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        int img_bloque1[]={R.drawable.bloque1,R.drawable.bloque1_2,R.drawable.bloque1_3,R.drawable.bloque1_4,R.drawable.bloque1_5,R.drawable.bloque1_6,R.drawable.bloque1_7,R.drawable.bloque1_8,R.drawable.bloque1_9,R.drawable.bloque1_10};
        int img_bloque2[]={R.drawable.bloque2,R.drawable.bloque2_2,R.drawable.bloque2_3,R.drawable.bloque2_4,R.drawable.bloque2_5,R.drawable.bloque2_6,R.drawable.bloque2_7,R.drawable.bloque2_8,R.drawable.bloque2_9,R.drawable.bloque2_10};
        int img_bloque3[]={R.drawable.bloque3,R.drawable.bloque3_2,R.drawable.bloque3_3,R.drawable.bloque3_4,R.drawable.bloque3_5,R.drawable.bloque3_6,R.drawable.bloque3_7,R.drawable.bloque3_8,R.drawable.bloque3_9,R.drawable.bloque3_10};
        int img_bloque4[]={R.drawable.bloque4,R.drawable.bloque4_2,R.drawable.bloque4_3,R.drawable.bloque4_4,R.drawable.bloque4_5,R.drawable.bloque4_6,R.drawable.bloque4_7,R.drawable.bloque4_8,R.drawable.bloque4_9,R.drawable.bloque4_10};
        int img_bloque5[]={R.drawable.bloque5,R.drawable.bloque5_2,R.drawable.bloque5_3,R.drawable.bloque5_4,R.drawable.bloque5_5,R.drawable.bloque5_6,R.drawable.bloque5_7,R.drawable.bloque5_8,R.drawable.bloque5_9,R.drawable.bloque5_10};
        int img_bloque6[]={R.drawable.bloque6,R.drawable.bloque6_2,R.drawable.bloque6_3,R.drawable.bloque6_4,R.drawable.bloque6_5,R.drawable.bloque6_2,R.drawable.bloque6_3,R.drawable.bloque6_4,R.drawable.bloque6_5,R.drawable.bloque6_2};
        int img_bloque8[]={R.drawable.bloque8,R.drawable.bloque8_2,R.drawable.bloque8_3,R.drawable.bloque8_4,R.drawable.bloque8_5,R.drawable.bloque8_6,R.drawable.bloque8_7,R.drawable.bloque8_8,R.drawable.bloque8_9,R.drawable.bloque8_10};
        int img_bloque9[]={R.drawable.bloque9,R.drawable.bloque9_2,R.drawable.bloque9_3,R.drawable.bloque9_4,R.drawable.bloque9_5,R.drawable.bloque9_6,R.drawable.bloque9_7,R.drawable.bloque9_8,R.drawable.bloque9_9,R.drawable.bloque9_2};
        int img_bloque10[]={R.drawable.bloque10,R.drawable.bloque10_2,R.drawable.bloque10_3,R.drawable.bloque10_4,R.drawable.bloque10_5,R.drawable.bloque10_6,R.drawable.bloque10_7,R.drawable.bloque10_8,R.drawable.bloque10_9,R.drawable.bloque10_10};
        int img_bloque12[]={R.drawable.bloque12,R.drawable.bloque12_2,R.drawable.bloque12_3,R.drawable.bloque12_4,R.drawable.bloque12_5,R.drawable.bloque12_6,R.drawable.bloque12_7,R.drawable.bloque12_8,R.drawable.bloque12_9,R.drawable.bloque12_10};
        int img_bloque13[]={R.drawable.bloque13,R.drawable.bloque13_2,R.drawable.bloque13_3,R.drawable.bloque13_4,R.drawable.bloque13_5,R.drawable.bloque13_6,R.drawable.bloque13_7,R.drawable.bloque13_2,R.drawable.bloque13_3,R.drawable.bloque13_4};
        int img_bloque14[]={R.drawable.bloque14,R.drawable.bloque14_2,R.drawable.bloque14_3,R.drawable.bloque14_4,R.drawable.bloque14_5,R.drawable.bloque14_6,R.drawable.bloque14_7,R.drawable.bloque14_8,R.drawable.bloque14_9,R.drawable.bloque14_10};
        int img_bloque15[]={R.drawable.bloque15,R.drawable.bloque15_2,R.drawable.bloque15_3,R.drawable.bloque15_4,R.drawable.bloque15_5,R.drawable.bloque15_6,R.drawable.bloque15_7,R.drawable.bloque15_8,R.drawable.bloque15_9,R.drawable.bloque15_10};
        int img_bloque16[]={R.drawable.bloque16,R.drawable.bloque16_2,R.drawable.bloque16_3,R.drawable.bloque16_4,R.drawable.bloque16_5,R.drawable.bloque16_6,R.drawable.bloque16_7,R.drawable.bloque16_8,R.drawable.bloque16_2,R.drawable.bloque16_3};
        int img_bloque17[]={R.drawable.bloque17,R.drawable.bloque17_2,R.drawable.bloque17_3,R.drawable.bloque17_4,R.drawable.bloque17_2,R.drawable.bloque17_3,R.drawable.bloque17_4,R.drawable.bloque17_2,R.drawable.bloque17_3,R.drawable.bloque17_4};
        int img_bloque18[]={R.drawable.bloque18,R.drawable.bloque18_2,R.drawable.bloque18_3,R.drawable.bloque18_4,R.drawable.bloque18_5,R.drawable.bloque18_2,R.drawable.bloque18_3,R.drawable.bloque18_4,R.drawable.bloque18_5,R.drawable.bloque18_2};
        int img_bloque19[]={R.drawable.bloque19,R.drawable.bloque19_2,R.drawable.bloque19_3,R.drawable.bloque19_4,R.drawable.bloque19_5,R.drawable.bloque19_6,R.drawable.bloque19_2,R.drawable.bloque19_3,R.drawable.bloque19_4,R.drawable.bloque19_5};
        int img_bloque23[]={R.drawable.bloque23,R.drawable.bloque23_2,R.drawable.bloque23_3,R.drawable.bloque23_4,R.drawable.bloque23_5,R.drawable.bloque23_6,R.drawable.bloque23_7,R.drawable.bloque23_8,R.drawable.bloque23_9,R.drawable.bloque23_10};
        int img_bloque24[]={R.drawable.bloque24,R.drawable.bloque24_2,R.drawable.bloque24_3,R.drawable.bloque24_4,R.drawable.bloque24_5,R.drawable.bloque24_6,R.drawable.bloque24_7,R.drawable.bloque24_8,R.drawable.bloque24_2,R.drawable.bloque24_3};
        int img_bloque25[]={R.drawable.bloque25,R.drawable.bloque25_2,R.drawable.bloque25_3,R.drawable.bloque25_4,R.drawable.bloque25_5,R.drawable.bloque25_6,R.drawable.bloque25_7,R.drawable.bloque25_8,R.drawable.bloque25_9,R.drawable.bloque25_2};
        int img_bloque26[]={R.drawable.bloque26,R.drawable.bloque26_2,R.drawable.bloque26_3,R.drawable.bloque26_4,R.drawable.bloque26_5,R.drawable.bloque26_6,R.drawable.bloque26_7,R.drawable.bloque26_8,R.drawable.bloque26_9,R.drawable.bloque26_10};
        int img_bloque27[]={R.drawable.bloque27,R.drawable.bloque27_2,R.drawable.bloque27_3,R.drawable.bloque27_4,R.drawable.bloque27_2,R.drawable.bloque27_3,R.drawable.bloque27_4,R.drawable.bloque27_2,R.drawable.bloque27_3,R.drawable.bloque27_4};
        int img_bloque28[]={R.drawable.bloque28,R.drawable.bloque28_2,R.drawable.bloque28_3,R.drawable.bloque28_4,R.drawable.bloque28_5,R.drawable.bloque28_6,R.drawable.bloque28_7,R.drawable.bloque28_8,R.drawable.bloque28_9,R.drawable.bloque28_10};
        int img_bloque30[]={R.drawable.bloque30,R.drawable.bloque30_2,R.drawable.bloque30_3,R.drawable.bloque30_4,R.drawable.bloque30_5,R.drawable.bloque30_6,R.drawable.bloque30_7,R.drawable.bloque30_8,R.drawable.bloque30_9,R.drawable.bloque30_10};
        int img_bloque31[]={R.drawable.bloque31,R.drawable.bloque31_2,R.drawable.bloque31_3,R.drawable.bloque31_4,R.drawable.bloque31_5,R.drawable.bloque31_6,R.drawable.bloque31_7,R.drawable.bloque31_2,R.drawable.bloque31_3,R.drawable.bloque31_4};
        int img_bloque32[]={R.drawable.bloque32,R.drawable.bloque32_2,R.drawable.bloque32_3,R.drawable.bloque32_4,R.drawable.bloque32_5,R.drawable.bloque32_2,R.drawable.bloque32_3,R.drawable.bloque32_4,R.drawable.bloque32_5,R.drawable.bloque32_2};
        int img_bloque34[]={R.drawable.bloque34,R.drawable.bloque34_2,R.drawable.bloque34_3,R.drawable.bloque34_4,R.drawable.bloque34_5,R.drawable.bloque34_6,R.drawable.bloque34_2,R.drawable.bloque34_3,R.drawable.bloque34_4,R.drawable.bloque34_5};


        listaDatos=(ListView)findViewById(R.id.lstDatos);

        Lista=new ArrayList<Datos>();
        //id,titulo,descripcion,direccion,transporte,caracteristicas,ubicacion, imagenes, longi,lat
        Lista.add(new Datos(
                /*id*/              1,
                /*titulo*/          "Bloque 1",
                /*descripcion*/     "Ingenierías",
                /*direccion*/       "Av Caracas # 37-63",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la caracas, es el medio de transporte más utilizado por los estudiantes de esta sede.",
                /*caracteristicas*/ "Biblioteca-Correspondencia-Carnetizacion-CIPIS-Emisora",
                /*ubicacion*/       "Esta sede queda ubicada enfrente de la estación de la Av39 donde se encuentran sitios aledaños, como el edificio de RCN Radio, un Subway y los bloques 3 y 15.",
                /*imagenes*/        img_bloque1,
                /*longi*/           4.626147,
                /*lat*/             -74.069265
                ));

        Lista.add(new Datos(
                /*id*/              2,
                /*titulo*/          "Bloque 2",
                /*descripcion*/     "Departamento de comunicaciones",
                /*direccion*/       "Carrera 15 #38-04",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Capilla-oficinas-Gestión Humana",
                /*ubicacion*/       "Para llegar hay que pasar la fotocopiadora y seguir el camino, una vez encuentre la oficina de la Analista de Gestión Humana estará ubicado en el bloque 2.",
                /*imagenes*/        img_bloque2,
                /*longi y lat*/      4.626464, -74.069623

        ));

        Lista.add(new Datos(
                /*id*/              3,
                /*titulo*/          "Bloque 3",
                /*descripcion*/     "Facultad de Derecho",
                /*direccion*/       "Av Caracas # 37-43",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Servicio al estudiante-Cajero BBVA",
                /*ubicacion*/       "Este bloque se encuentra ubicado entre el bloque 4 y el bloque 1 enfrente de la estación de la Av 39.",
                /*imagenes*/        img_bloque3,
                /*longi*/           4.625770, -74.069024

        ));

        Lista.add(new Datos(
                /*id*/              4,
                /*titulo*/          "Bloque 4",
                /*descripcion*/     "Facultad de Ingenierías",
                /*direccion*/       "Av Caracas # 37-15",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Sala de profesores-Coordinadores Ingenierías.",
                /*ubicacion*/       "Se encuentra al lado del bloque 3 enfrente de la estación de la Av39.",
                /*imagenes*/        img_bloque4,
                /*longi*/           4.625779, -74.069231

        ));

        Lista.add(new Datos(
                /*id*/              5,
                /*titulo*/          "Bloque 5",
                /*descripcion*/     "Departamento de Idiomas",
                /*direccion*/       "Calle 37 #14-34",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Salas de informática para realizar trabajos en la plataforma  Rosseta Stone-atención al estudiante niveles de inglés.-Biblioteca-Casilleros-CIFAD ",
                /*ubicacion*/       "Esta bloque queda ubicado detrás del bloque 3.",
                /*imagenes*/        img_bloque5,
                /*longi*/           4.625631, -74.069328

        ));

        Lista.add(new Datos(
                /*id*/              6,
                /*titulo*/          "Bloque 6",
                /*descripcion*/     "Facultad de Odontología",
                /*direccion*/       "Carrera 13a #38-22",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Instalaciones para prestar servicios de odontología.",
                /*ubicacion*/       "Este bloque queda ubicado cerca a la sede 30 de Bienestar y de una cafetería TOSTAO.",
                /*imagenes*/        img_bloque6,
                /*longi*/           4.626329, -74.068015

        ));



        Lista.add(new Datos(
                /*id*/              8,
                /*titulo*/          "Bloque 8",
                /*descripcion*/     "Contaduría publica",
                /*direccion*/       "Carrera 14a #40a-73",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas.",
                /*caracteristicas*/ "Sala de profesores-oficina del Decano de contabilidad-oficinas-salones.",
                /*ubicacion*/       "Este bloque queda ubicado al lado de la funeraria los olivos de la 45 y al frente de la estación de Transmilenio de Calle 45.",
                /*imagenes*/        img_bloque8,
                /*longi*/           4.629936, -74.068748

        ));

        Lista.add(new Datos(
                /*id*/              9,
                /*titulo*/          "Bloque 9",
                /*descripcion*/     "Orientación Psicológica",
                /*direccion*/       "Carrera 14a #40a-65",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas.",
                /*caracteristicas*/ "Orientación Psicológica\n",
                /*ubicacion*/       "Este bloque queda ubicado al lado del bloque 8 muy cerca de un caño. ",
                /*imagenes*/        img_bloque9,
                /*longi*/           4.630140, -74.068682

        ));

        Lista.add(new Datos(
                /*id*/              10,
                /*titulo*/          "Bloque 10",
                /*descripcion*/     "Casa de Extensión",
                /*direccion*/       "Calle 39 #14-18",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Recepción- Mercadeo- Oficina de Egresados- Proyección Social –Internacionalización- INDESCO -Extensión",
                /*ubicacion*/       "Este bloque se encuentra ubicado  al lado del bloque 14 y enfrente del 27. ",
                /*imagenes*/        img_bloque10,
                /*longi*/           4.626820, -74.068998
        ));



        Lista.add(new Datos(
                /*id*/              12,
                /*titulo*/          "Bloque 12",
                /*descripcion*/     "Centro de cómputo",
                /*direccion*/       "Carrera 15 #37-58",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Salas de informática-Centro de computo-institucional.",
                /*ubicacion*/       "Este bloque se encuentra ubicado enseguida del bloque 2.",
                /*imagenes*/        img_bloque12,
                /*longi*/           4.626190, -74.069842

        ));

        Lista.add(new Datos(
                /*id*/              13,
                /*titulo*/          "Bloque 13",
                /*descripcion*/     "Asesora Rectoría",
                /*direccion*/       "Av Caracas #44-21",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas.",
                /*caracteristicas*/ "Asesora Rectoría- Secretaría General- INDESCO -Nacional Editorial- Contaduría Pública.",
                /*ubicacion*/       "Se encuentra ubicado enfrente de la estación de la calle 45.",
                /*imagenes*/        img_bloque13,
                /*longi*/           4.632002, -74.067967

        ));

        Lista.add(new Datos(
                /*id*/              14,
                /*titulo*/          "Bloque 14",
                /*descripcion*/     "Tesorería y DARC",
                /*direccion*/       "Av Caracas #38-45",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Tesorería- DARC- Subdirección Financiera- Contabilidad- Gestión Tecnológica -Subdirección de Desarrollo Institucional- Infraestructura Física- Planeación Dirección de Sede- Subdirección Académica- Subdirección de Proyección.",
                /*ubicacion*/       "Este bloque se encuentra ubicado al lado del bloque 15 y cerca al bloque 10 y 16.",
                /*imagenes*/        img_bloque14,
                /*longi*/           4.626541, -74.068931

        ));

        Lista.add(new Datos(
                /*id*/              15,
                /*titulo*/          "Bloque 15",
                /*descripcion*/     "Audiovisuales",
                /*direccion*/       "Av Caracas #38-27",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Cafetería-Audiovisuales-CISCO-Salas de informática.",
                /*ubicacion*/       "Este bloque queda  ubicado al lado del bloque 34 y 14.Al lado de la cancha.",
                /*imagenes*/        img_bloque15,
                /*longi*/           4.626444, -74.068891

        ));

        Lista.add(new Datos(
                /*id*/              16,
                /*titulo*/          "Bloque 16",
                /*descripcion*/     "Facultad de ciencias administrativas",
                /*direccion*/       "Av Caracas #37-20",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Ciencias Administrativas, Económicas y Afines.",
                /*ubicacion*/       "Este bloque está ubicado enfrente de la estación de Transmilenio de la Av39 al lado de RCN Radio.",
                /*imagenes*/        img_bloque16,
                /*longi*/           4.625477, -74.068840

        ));

        Lista.add(new Datos(
                /*id*/              17,
                /*titulo*/          "Bloque 17",
                /*descripcion*/     "Postgrados",
                /*direccion*/       "Carrera 6 #11-51",
                /*Transporte*/      "La estacion mas cercana de transmilenio es Museo del oro ",
                /*caracteristicas*/ "Postgrados",
                /*ubicacion*/       "Este bloque se encuentra ubicado a un par de cuadras de la estacion del museo del oro",
                /*imagenes*/        img_bloque17,
                /*longi*/           4.598146, -74.074193

        ));

        Lista.add(new Datos(
                /*id*/              18,
                /*titulo*/          "Bloque 18",
                /*descripcion*/     "Tecnologias",
                /*direccion*/       "Diagonal 42 Sur #23-70",
                /*Transporte*/      "La estacion mas cercana de transmilenio es la Calle 40 Sur en donde podemos coger el alimentador 7-2 tunal y bajarnos en la primera parada que nos dejara a una cuadra del bloque.",
                /*caracteristicas*/ "Salones de tecnologia-Ping Pong-Gimnasio",
                /*ubicacion*/       "",
                /*imagenes*/        img_bloque18,
                /*longi*/           4.578702, -74.123886

        ));

        Lista.add(new Datos(
                /*id*/              19,
                /*titulo*/          "Bloque 19",
                /*descripcion*/     "Sociología",
                /*direccion*/       "Carrera 15 #42-26",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas.",
                /*caracteristicas*/ "Sociología",
                /*ubicacion*/       "Este bloque se encuentra ubicado cerca al bloque 8.  ",
                /*imagenes*/        img_bloque19,
                /*longi*/           4.630478, -74.068994

        ));


        Lista.add(new Datos(
                /*id*/              23,
                /*titulo*/          "Bloque 23",
                /*descripcion*/     "Primeros semestres",
                /*direccion*/       "Av Caracas #45a-55",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas.",
                /*caracteristicas*/ "Salones primeros semestres",
                /*ubicacion*/       "Este bloque queda muy cerca  al bloque 13 enfrente de la estación de Transmilenio de la Calle 45.",
                /*imagenes*/        img_bloque23,
                /*longi*/           4.632837, -74.067781

        ));

        Lista.add(new Datos(
                /*id*/              24,
                /*titulo*/          "Bloque 24",
                /*descripcion*/     "Primeros semestres",
                /*direccion*/       "Carrera 15 #37-10",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Salones",
                /*ubicacion*/       "Este bloque queda ubicado al lado del bloque 12.",
                /*imagenes*/        img_bloque24,
                /*longi*/           4.625819, -74.069918

        ));

        Lista.add(new Datos(
                /*id*/              25,
                /*titulo*/          "Bloque 25",
                /*descripcion*/     "Archivo",
                /*direccion*/       "Diagonal 40a#16-44",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Archivo",
                /*ubicacion*/       "Este bloque queda ubicado por la cuadra de la Uninpahu al lado del colegio Champagna.",
                /*imagenes*/        img_bloque25,
                /*longi*/           4.629480, -74.070534

        ));

        Lista.add(new Datos(
                /*id*/              26,
                /*titulo*/          "Bloque 26",
                /*descripcion*/     "Institucionales",
                /*direccion*/       "Calle 44 #15-20",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas.",
                /*caracteristicas*/ "Mercadeo-Administración de empresas-Institucional.",
                /*ubicacion*/       "Este bloque queda ubicado cerca al bloque 19 y de la estación de Transmilenio de la Calle 45.",
                /*imagenes*/        img_bloque26,
                /*longi*/           4.631978, -74.069014

        ));

        Lista.add(new Datos(
                /*id*/              27,
                /*titulo*/          "Bloque 27",
                /*descripcion*/     "Consultorio Jurídico",
                /*direccion*/       "Calle 39 #14-39",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Consultorio Jurídico, Centro de conciliación.",
                /*ubicacion*/       "Este bloque se encuentra ubicado al lado del bloque 14 y enfrente del bloque 10.",
                /*imagenes*/        img_bloque27,
                /*longi*/           4.626844, -74.069181

        ));

        Lista.add(new Datos(
                /*id*/              28,
                /*titulo*/          "Bloque 28",
                /*descripcion*/     "Odontología\n",
                /*direccion*/       "Carrer 13 Bis #43-23",
                /*Transporte*/      "La estación más cercana de Transmilenio es la de Calle 45 ubicada en la Caracas. Otro medio de transporte es el SITP que pasa en la Carrera 13.",
                /*caracteristicas*/ "Cafetería-Audiovisuales-Papelería-Odontología.",
                /*ubicacion*/       "Se encuentra ubicada al lado de una funeraria cerca de la Carrera 13.",
                /*imagenes*/        img_bloque28,
                /*longi*/           4.630934, -74.067182

        ));


        Lista.add(new Datos(
                /*id*/              30,
                /*titulo*/          "Bloque 30",
                /*descripcion*/     "Bienestar",
                /*direccion*/       "Calle 38 #13a-79",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Gimnasio-Baile-Música-Ping-Pong-Eventos.",
                /*ubicacion*/       "Se encuentra cerca al Subway ubicado enfrente de la estación de Transmilenio de la Av 39 y cerca al bloque 6.",
                /*imagenes*/        img_bloque30,
                /*longi*/           4.626031, -74.068111

        ));

        Lista.add(new Datos(
                /*id*/              31,
                /*titulo*/          "Bloque 31",
                /*descripcion*/     "Campus-Psicología",
                /*direccion*/       "Carrera 9a #172-90",
                /*Transporte*/      "Portal Norte-Alimentador San Cristóbal tercera parada.",
                /*caracteristicas*/ "Gimnasio-ping-pong -cancha de futbol-sauna-cancha de baloncesto",
                /*ubicacion*/       "Se encuentra ubicada en la 170 al lado del colegio La Salle y de la Universidad San Buenaventura.",
                /*imagenes*/        img_bloque31,
                /*longi*/           4.751034, -74.031033

        ));

        Lista.add(new Datos(
                /*id*/              32,
                /*titulo*/          "Bloque 32",
                /*descripcion*/     "",
                /*direccion*/       "Diagonal 40 #14-35",
                /*Transporte*/      "Las estaciones más cercanas de Transmilenio son la de la Calle 45 y la Av39.",
                /*caracteristicas*/ "Salones",
                /*ubicacion*/       "Este bloque se encuentra ubicado en la Caracas entre las estaciones de Transmilenio de la Calle 45 y la Av39.Al lado hay un caño.",
                /*imagenes*/        img_bloque32,
                /*longi*/           4.628583, -74.068294

        ));


        Lista.add(new Datos(
                /*id*/              34,
                /*titulo*/          "Bloque 34",
                /*descripcion*/     "Salones",
                /*direccion*/       "Calle 39 #14-29",
                /*Transporte*/      "La estación más cercana de Transmilenio es la Av39 ubicada en la Caracas.",
                /*caracteristicas*/ "Salones",
                /*ubicacion*/       "Este bloque se ubica pasando por la cafetería del bloque 15 hasta llegar a una fuente en donde encontraremos al costado derecho unos baños, si sigues este camino lo encontraras fácilmente. ",
                /*imagenes*/        img_bloque34,
                /*longi*/           4.626834, -74.069096

        ));

        Adaptador miadaptador=new Adaptador(getApplicationContext(),Lista);

        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj=(Datos)parent.getItemAtPosition(position);

                Intent paso=new Intent(getApplicationContext(),DetalleActivity.class);
                paso.putExtra("objeto",(Serializable)obj);
                startActivity(paso);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id=opcion_menu.getItemId();

        if(id==R.id.info){
            ejecutar_info(null);
            return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }

    public void ejecutar_info(View vista){

        Intent i=new Intent(Lista.this, InfoClase.class);
        startActivity(i);
    }

}
