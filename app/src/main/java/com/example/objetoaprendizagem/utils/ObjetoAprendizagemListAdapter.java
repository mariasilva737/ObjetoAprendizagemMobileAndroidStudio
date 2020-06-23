package com.example.objetoaprendizagem.utils;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.objetoaprendizagem.Entidade.ObjetoDeAprendizagem;
import com.example.objetoaprendizagem.R;

import java.util.List;

public class ObjetoAprendizagemListAdapter extends ArrayAdapter<ObjetoDeAprendizagem> {
    private Activity context;
    private List<ObjetoDeAprendizagem> objetoAprendizagemList;

    public ObjetoAprendizagemListAdapter(Activity context, List<ObjetoDeAprendizagem> objetoAprendizagemList){
        super (context, R.layout.layout_oa_item, objetoAprendizagemList);
        this.context = context;
        this.objetoAprendizagemList = objetoAprendizagemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_oa_item, null, true);

        TextView textviewtituloadapter = (TextView) listViewItem.findViewById(R.id.textviewtituloadapter);
        TextView textviewautoradapter = (TextView) listViewItem.findViewById(R.id.textviewautoradapter);

        ObjetoDeAprendizagem objetoaprendizagem = objetoAprendizagemList.get(position);
        textviewtituloadapter.setText(objetoaprendizagem.getTitulo());
        textviewautoradapter.setText(objetoaprendizagem.getAutor());

        return listViewItem;
    }

}
