package com.example.jarblack.uccv01;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

public class Adaptador2 extends BaseAdapter{

    Context context;
    List<Carreras> ListaObjetos;

    public Adaptador2(Context contexto, List<Carreras> listaObjetos) {
        this.context = contexto;
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
        LayoutInflater inflate=LayoutInflater.from(context);
        vista=inflate.inflate(R.layout.items_lista_carreras,null);

        ImageView imagen=(ImageView)vista.findViewById(R.id.img);
        TextView titulo=(TextView)vista.findViewById(R.id.title);
        int img=R.drawable.mini_logo;

        titulo.setText(ListaObjetos.get(position).getCarrera().toString());
        imagen.setImageResource(img);



        return vista;
    }
}
