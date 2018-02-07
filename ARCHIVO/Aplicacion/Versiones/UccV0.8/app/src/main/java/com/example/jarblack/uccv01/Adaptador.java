package com.example.jarblack.uccv01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jarblack on 18/11/2017.
 */

public class Adaptador extends BaseAdapter{

    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }


    @Override
    public int getCount() {
        return ListaObjetos.size();//retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista=convertView;
        LayoutInflater inflate=LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.itemlistview,null);

        ImageView imagen=(ImageView)vista.findViewById(R.id.imagen);
        TextView titulo=(TextView)vista.findViewById(R.id.titulo);
        TextView detalle=(TextView)vista.findViewById(R.id.detalle);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getCaracteristicas().toString());
        int imagenes[]=ListaObjetos.get(position).getImagenes();
        imagen.setImageResource(imagenes[0]);


        return vista;
    }
}
