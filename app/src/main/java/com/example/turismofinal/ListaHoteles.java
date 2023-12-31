package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turismofinal.adaptadores.AdaptadorHotel;
import com.example.turismofinal.Moldes.M;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<moldes.MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);

    }
    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel casa Benigno", "$80000 COP", "3107099476",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel caña de azùcar", "$150000 COP", "3225457893",R.drawable.hotel2));
        listaHoteles.add(new MoldeHotel("Hotel flor de durazno", "$180000 COP", "3152635846",R.drawable.hotel3));
        listaHoteles.add(new MoldeHotel("Hotel la campera", "$200000 COP", "3053425935",R.drawable.hotel4));
        listaHoteles.add(new MoldeHotel("Hotel villas vieja", "$350000 COP", "3286471200",R.drawable.hotel5));
        listaHoteles.add(new MoldeHotel("Hotel campestre", "$110000 COP", "3117891003",R.drawable.hotel6));
    }
}



