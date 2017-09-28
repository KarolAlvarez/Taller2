package co.i014114.www.taller2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import co.i014114.www.taller2.Models.MyCountry;
import co.i014114.www.taller2.R;


/**
 * Created by root on 27/09/17.
 */

public class MyAdapterCountry extends RecyclerView.Adapter<MyAdapterCountry.ViewHolder> {


    List<MyCountry> countryList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public MyAdapterCountry(List<MyCountry> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    @Override
    public MyAdapterCountry.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)

        View item2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        MyAdapterCountry.ViewHolder viewHolder = new MyAdapterCountry.ViewHolder(item2);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(MyAdapterCountry.ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes


        holder.id_item2_area_country.setText("AREA: " + countryList.get(position).getArea());
        holder.id_item2_name_country.setText("PAIS: " + countryList.get(position).getName());
        holder.id_item2_internet_domain_country.setText("DOMINIO DE INTERNET: " + countryList.get(position).getDominioInternet());
        holder.id_item2_pref_tel_country.setText("PREFIJO TELEFONICO: +" + countryList.get(position).getPrefijoTelefonico());
        holder.id_item2_hab_country.setText("Nᵒ DE HABITANTES: " + countryList.get(position).getNumeroHabitantes());
        holder.id_item2_abbreviation_country.setText("ABREVIACIÓN: " + countryList.get(position).getAlphacode());
        holder.id_item2_capital_country.setText("CAPITAL: " + countryList.get(position).getCapital());

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView id_item2_area_country,
                id_item2_internet_domain_country,
                id_item2_pref_tel_country,
                id_item2_hab_country,
                id_item2_abbreviation_country,
                id_item2_capital_country,
                id_item2_name_country;


        public ViewHolder(View item) {
            super(item);
            id_item2_area_country = (TextView) item.findViewById(R.id.id_item2_area_country);
            id_item2_internet_domain_country = (TextView) item.findViewById(R.id.id_item2_internet_domain_country);
            id_item2_pref_tel_country = (TextView) item.findViewById(R.id.id_item2_pref_tel_country);
            id_item2_hab_country = (TextView) item.findViewById(R.id.id_item2_hab_country);
            id_item2_abbreviation_country = (TextView) item.findViewById(R.id.id_item2_abbreviation_country);
            id_item2_capital_country = (TextView) item.findViewById(R.id.id_item2_capital_country);
            id_item2_name_country = (TextView) item.findViewById(R.id.id_item2_name_country);

        }
    }


}


