package DAO;

import Entity.Vehiculo;

import java.util.ArrayList;

public class VehiculoDAO {
    private ArrayList<Vehiculo> listVehiculo = new ArrayList<>();

    public Vehiculo Consultar(int ID){
        Vehiculo objvehiculo=new Vehiculo();
        for (int i=0;i<listVehiculo.size();i++)
            if (listVehiculo.get(i).getID()==ID){
                return listVehiculo.get(i);
            }
        return new Vehiculo();
    }

    public void Registrar(Vehiculo objVehiculo){
        listVehiculo.add(objVehiculo);
    }

    public void Modificar(Vehiculo objVehiculo){
        for (int i=0;i<listVehiculo.size();i++){
            if (listVehiculo.get(i).getID()==objVehiculo.getID()){
                listVehiculo.get(i).setMarca(objVehiculo.getMarca());
                listVehiculo.get(i).setModelo(objVehiculo.getModelo());
                listVehiculo.get(i).setColor(objVehiculo.getColor());
                listVehiculo.get(i).setAnio(objVehiculo.getAnio());
            }
        }
    }

    public void Eliminar(int ID){
        for (int i=0;i<listVehiculo.size();i++){
            if (listVehiculo.get(i).getID()==ID){
                listVehiculo.remove(i);

                System.out.println("Se ha eliminado");
            }
        }

    }

    public ArrayList<Vehiculo> listVehiculo(){
        return this.listVehiculo;
    }
}
