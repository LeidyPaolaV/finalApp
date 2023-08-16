package com.example.turismofinal.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turismofinal.R;

import java.util.ArrayList;

public class AdaptadorHotel extends RecyclerView.Adapter<AdaptadorHotel.viewHolder> {

    //atributo del adaptador
    public ArrayList<moldes.MoldeHotel> ListaHoteles;

    //constructores del adapatador
    public AdaptadorHotel(){
    }

    @NonNull
    @Override
    public AdaptadorHotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null, false);
        return new viewHolder (vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHotel.viewHolder holder, int position) {
        holder.actualizarDatos(ListaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaHoteles.size();
    }

    public AdaptadorHotel(ArrayList<moldes.MoldeHotel> ListaHoteles){
        this.ListaHoteles = ListaHoteles;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
                    fotoHotel=itemView.findViewById(R.id.fotoListaHotel);
                    nombreHotel=itemView.findViewById(R.id.nombreHotel);
                     precioHotel=itemView.findViewById(R.id.precioHotel);
                             contactoHotel=itemView.findViewById(R.id.contactoListaHotel);
        }

        public void actualizarDatos(moldes.MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getprecioHotel);
            contactoHotel.setText(moldeHotel.getcontactoHotel);

        }
    }
}

