package moldes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.turismofinal.R;

public class MoldeHotel extends AppCompatActivity {

    private String nombre;

    private String precio;

    private String telefono;

    private Integer foto;

    public MoldeHotel (){
        //constructor vacio
    }

    public MoldeHotel (String nombre, String precio,String telefono,Integer foto){
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
    }//constructor lleno

    public String getNombre (){return nombre;}


}
