package DAO;

import Entity.Persona;

import java.util.ArrayList;

public class PersonaDAO {
    /*creo un atributo arraylist de tipo persona que se llame listpersona y este vacio*/
    private ArrayList<Persona> listPersona= new ArrayList<Persona>();

    /*uso un objeto consultar de tipo persona que pida un entero ID y retorne un objetopersona de tipo persona, para usarse*/
    public Persona Consultar(int ID){
        /*listPersona.add(new Persona(123, "Juan", "Vasquez", "Masculino", "Guzman Barron 128", "juanma9603@gmail.com"));
        listPersona.add(new Persona(456, "Lucas","Vasquez", "Masculino", "Sebastian Lorente 521", "gabriel.94@gmail.com"));*/
       /*creo un objpersona donde guardo la persona que voy a retornar*/
        Persona objPersona = new Persona();
        /*inicio una variable en 0, que recorre el tamaño de la lista contando la cantidad de objetos en ella*/
        for( int i = 0; i<listPersona.size(); i++){
            /*en la listapersona selecciona el item persona, verificando  que el ID obtenido que sea igual al ID consultado*/
            if (listPersona.get(i).getID()==ID){
                /*comprobar con una impresion el item*/
                /*System.out.println(listPersona.get(i));/* solo item el buscado, que se obtiene al comparar con el ID*/

                /*regreso en el if el item encontrado ya verificado; porque en el if, tengo q retornar algo, en este caso el item buscado*/
                return listPersona.get(i);
            }
        }
        /*como parte de la consulta, donde pido el ID a consultar, retorno el item hallado en la lista y guardado en un objeto persona*/
        return objPersona;
    }

    /*uso un metodo registrar, que no retorne nada, pero que pida los datos de un objeto persona de tipo persona*/
    public void Registrar(Persona objPersona){
        /*a la lista persona le agrego un objetopersona*/
        listPersona.add(objPersona);
    }

    /*uso un metodo modificar que no retorne nada, pero que pida un objetopersona de tipo persona*/
    public void Modificar(Persona objPersona){
        /*recorro la listapersona´, en un conteo de cada objeto*/
        for (int i=0;i<listPersona.size();i++) {
            /*del objeto obtenido de la lista, obtengo el ID y lo comparo con el ID que obtengo del objeto obtenido al crear un nuevo objeto*/
            if (listPersona.get(i).getID()==objPersona.getID()){
                /*del objeto obtenido en la lista, asigno al atributo, el mismo atributo obtenido del objeto creado*/
                listPersona.get(i).setFirstName(objPersona.getFirstName());
                listPersona.get(i).setLastName(objPersona.getLastName());
                listPersona.get(i).setGender(objPersona.getGender());
                listPersona.get(i).setAddress(objPersona.getAddress());
                listPersona.get(i).setEmail(objPersona.getEmail());

            }

        }
    }

        /*uso un metodo eliminar que no retorne nada, pero pida el atributo entero ID del objetopersona*/
        public void Eliminar(int ID){

            /*inicio una variable en 0, que recorre el tamaño de la lista contando la cantidad de objetos en ella*/
            for (int i=0;i<listPersona.size();i++){

                /*en la listapersona, selecciona el item persona, verificando  que el ID obtenido que sea igual al ID a eliminar*/
                if (listPersona.get(i).getID()==ID){
                    /*se elimina el item verificado*/
                    listPersona.remove(i);

                    /*imprime un mensaje*/
                    System.out.println("Se ha eliminado");

                }
            }

            /*no entiendo*/

        }


    /*uso el arraylist de tipo persona que se llama listpersona* y retorno de este la listpersona*/
    public ArrayList<Persona> listpersona(){
        return this.listPersona;
    }

}
