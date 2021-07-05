package Entity;

public class Vehiculo {
    private int ID;
    private String Marca;
    private String Modelo;
    private String Color;
    private int Anio;

    public Vehiculo(){
        this.ID=0;
        this.Marca="";
        this.Modelo="";
        this.Color="";
        this.Anio=0;
    }

    public Vehiculo(int ID, String Marca, String Modelo, String Color, int Anio){
        this.ID=ID;
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.Color=Color;
        this.Anio=Anio;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public int getID(){
        return this.ID;
    }

    public void setMarca(String Marca){
        this.Marca=Marca;
    }

    public String getMarca(){
        return this.Marca;
    }

    public void setModelo(String Modelo){
        this.Modelo=Modelo;
    }

    public String getModelo(){
        return this.Modelo;
    }

    public void setColor(String Color){
        this.Color=Color;
    }

    public String getColor(){
        return this.Color;
    }

    public void setAnio(int Anio){
        this.Anio=Anio;
    }

    public int getAnio(){
        return this.Anio;
    }


    @Override
    public String toString(){
        return "ID: "+ID+" Marca: "+Marca+" Modelo: "+Modelo+" Color: "+Color+" Año: "+Anio;
    }
}
