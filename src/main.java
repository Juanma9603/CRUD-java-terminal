import DAO.PersonaDAO;
import DAO.VehiculoDAO;
import Entity.Persona;
import Entity.Vehiculo;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

/* TENER EN CUENTA
permiso|tipo de dato a devolver|nombre(tipo de dato|nombre){
no tengo return, cuando es void
si return(nombre del dato,vacio= return del dato vacio, clase vacia, cuando obtengo un dato)
}
public int numero(int numero){
 return numero;
}
public String nombre(){
 return "";
}
public Persona obtener(){
 return new Persona();
}
public boolean abrir(boolean abrir){
 return abrir;
}
String nombre="";
* */

public class main {
    public static void main(String[] args) {
        /*creo objetos globales que son variables globales y estan vacias, que puedan ser usados en el main*/
        Persona objpersona= new Persona();
        PersonaDAO PersonaDao = new PersonaDAO();
        Vehiculo objvehiculo = new Vehiculo();
        VehiculoDAO VehiculoDAO = new VehiculoDAO();
        /*creo un scanner que reciba datos desde la terminal "siempre esta pidiendo datos", para ser utilizado en todo el main*/
        Scanner scanner = new Scanner(System.in);
        /*creo una variable boleana para se usada en el while, este permite salir de un ciclo infito del uso del programa, indicandome que salido de el*/
        boolean Escoger=true;

        while (Escoger) {

            /*pido mediante String(carteles que indiquen) que datos requiero*/
            System.out.println("1. Persona");
            System.out.println("2. Vehiculo");
            System.out.println("3. Salir");
            System.out.println("Cual escoges");

            /*uso una variable entera que pueda ser leida por la terminal, llamandola option para saber cual dato fue escogido*/
            int option = scanner.nextInt();

            switch (option) {
                /*utilizo swicth, para seguir un resultado que se halla generado a partir de la decision tomada, a partir de la variable "option"*/
                case 1:
                    /*presento las nuevas decisiones a tomar en el caso 1, mediante cadenas de texto que se muestren en la terminal*/
                    System.out.println("Has escogido Persona");
                    System.out.println("1. Consultar");
                    System.out.println("2. Registrar");
                    System.out.println("3. Modificar");
                    System.out.println("4. Eliminar");
                    System.out.println("5. Listar");
                    System.out.println("Usa alguno");

                    /*uso otra variable entera que se leida y conocer la decision tomada*/
                    int option1 = scanner.nextInt();
                    switch (option1) {
                        /*vuelvo a utilizar un swicth para seguir el resultado de la desicion tomada, a partir de la variable "option1"*/
                        case 1:
                            /*mediante cadena de texto indico los datos que necesito*/
                            System.out.println("Consultar");
                            System.out.println("Cual es el DNI a consultar?");

                            /*guardo en una variable de tipo persona que se llamo consultado el resultado de utilizar el metodo
                            consultar del PersonaDAO, obteniendo con scanner un ID solicitado*/
                            Persona consultado = PersonaDao.Consultar(scanner.nextInt());
                            /*imprimo en la terminal la variable con el metodo toString convirtiendo la variable en una cadena de texto*/
                            System.out.println(consultado.toString());

                            /*acabo con la option:1, con el control de variable break para terminar con el bucle*/
                            break;
                        case 2:
                            /*inicializo una variable objeto persona, donde se añadira una nueva persona*/
                            objpersona = new Persona();
                            /*pido mediante cadena de texto datos*/
                            System.out.println("Registrar");
                            System.out.println("Cual es el DNI de la persona a consultar?");
                            /*asigno el atributo entero al objpersona; es un dato entero desde la terminal mediante scanner*/
                            objpersona.setID(scanner.nextInt());
                            System.out.println("Cuál es tu Nombre?");
                            /*asigno el atributo String al objpersona; es un dato de cadena de texto desde la terminal*/
                            objpersona.setFirstName(scanner.next());
                            System.out.println("Cual es tu Apellido?");
                            objpersona.setLastName(scanner.next());
                            System.out.println("Cual es tu Genero?");
                            objpersona.setGender(scanner.next());
                            System.out.println("Cual es tu Direccion?");
                            objpersona.setAddress(scanner.next());
                            System.out.println("Cual es tu correo?");
                            objpersona.setEmail(scanner.next());

                            /*imprimo el objpersona mediante el metodo toString conviritiendolo en una cadena de texto*/
                            System.out.println(objpersona.toString());
                            /*uso de PersonaDao el metodo registrar, enviandole el objpersona*/
                            PersonaDao.Registrar(objpersona);


                            /*acabo con la option:2, con el control de variable break para terminar con el bucle*/
                            break;
                        case 3:
                            System.out.println("Modificar");
                            /*creo un objetopersona donde guardo los datos de la persona que se van a modificar*/
                            objpersona=new Persona();
                            System.out.println("Cual es el DNI");
                            objpersona.setID(scanner.nextInt());
                            System.out.println("Cual es el nombre");
                            objpersona.setFirstName(scanner.next());
                            System.out.println("Cual es el apellido");
                            objpersona.setLastName(scanner.next());
                            System.out.println("Cual es su genero");
                            objpersona.setGender(scanner.next());
                            System.out.println("Cual es la direccion");
                            objpersona.setAddress(scanner.next());
                            System.out.println("Cual es su Email");
                            objpersona.setEmail(scanner.next());

                            /*uso el metodo modificar de PersonaDao, enviandole los datos de la persona creada*/
                            PersonaDao.Modificar(objpersona);


                            /*acabo con la option:3, con el control de variable break para terminar con el bucle*/
                            break;
                        case 4:
                            System.out.println("Eliminar");
                            System.out.println("Cual es el DNI de la persona a eliminar?");

                            /*llamo al metodo elminar de PersonaDao y  le indico el atributo que me pide*/
                            PersonaDao.Eliminar(scanner.nextInt());

                            /*acabo con la option:4, con el control de variable break para terminar con el bucle*/
                            break;
                        case 5:
                            /*presento la lista de los objetospersona guardados en la lispersona*/
                            System.out.println("Listar");
                            /*uso una nueva variable arraylist de tipo persona que se llame lista y se encuentre vacia*/
                            ArrayList<Persona> lista = new ArrayList<>();
                            /*a la variable lista le asigno el los datos de PersonaDao de su listpersona*/
                            lista= PersonaDao.listpersona();

                            /*utilizo una logica saber cuantos objetos hay en la lista, contandolos*/
                            for (int i=0; i<lista.size();i++) {
                                /*System.out.println(i);     queria saber la cantidad de objetos contados*/

                                /*imprimi cada variable lista; de la lista de personas guardadas, mientras se se contaba, usando el metodo toString convirtiendo cada variable en cadena de texto */
                                System.out.println(lista.get(i).toString());
                            }
                            /*acabo con la option:5, con el control de variable break para terminar con el bucle*/
                            break;
                        /*uso una option default donde si se utiliza otra option q no este indicada, vuelva a mostrar el mensaje escoge, y tome una decision con las propuestas*/
                        default:
                            System.out.println("Escoge");

                    }

                    /*acabo con la option:default, con el control de variable break para terminar con el bucle*/
                    break;
                case 2:
                    System.out.println("Has escogido Vehiculo");
                    System.out.println("1. Consultar");
                    System.out.println("2. Registrar");
                    System.out.println("3. Modificar");
                    System.out.println("4. Eliminar");
                    System.out.println("5. Listar");
                    System.out.println("Usa alguno");

                    int option2 = scanner.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("Consultar");
                            System.out.println("Cual es el numero del Motor");

                            Vehiculo consultado=VehiculoDAO.Consultar(scanner.nextInt());
                            System.out.println(consultado.toString());
                            break;
                        case 2:
                            System.out.println("Registrar");
                            objvehiculo=new Vehiculo();
                            System.out.println("Cual es el numero de Motor?");
                            objvehiculo.setID(scanner.nextInt());
                            System.out.println("Cual es la Marca del Vehiculo?");
                            objvehiculo.setMarca(scanner.next());
                            System.out.println("Cual es el Modelo?");
                            objvehiculo.setModelo(scanner.next());
                            System.out.println("Cual es el Color?");
                            objvehiculo.setColor(scanner.next());
                            System.out.println("Cual es el Año?");
                            objvehiculo.setAnio(scanner.nextInt());

                            System.out.println(objvehiculo.toString());
                            VehiculoDAO.Registrar(objvehiculo);
                            break;
                        case 3:
                            objvehiculo=new Vehiculo();
                            System.out.println("Modificar");
                            System.out.println("Cual es el numero de Motor?");
                            objvehiculo.setID(scanner.nextInt());
                            System.out.println("Cual es la Marca del Vehiculo?");
                            objvehiculo.setMarca(scanner.next());
                            System.out.println("Cual es el Modelo?");
                            objvehiculo.setModelo(scanner.next());
                            System.out.println("Cual es el Color?");
                            objvehiculo.setColor(scanner.next());
                            System.out.println("Cual es el Año?");
                            objvehiculo.setAnio(scanner.nextInt());

                            VehiculoDAO.Modificar(objvehiculo);

                            break;
                        case 4:
                            System.out.println("Eliminar");
                            System.out.println("Cual es el numero de Motor del vehiculo a eliminar?");
                            VehiculoDAO.Eliminar(scanner.nextInt());

                            break;
                        case 5:
                            System.out.println("Listar");
                            ArrayList<Vehiculo> lista1= new ArrayList<>();
                            lista1=VehiculoDAO.listVehiculo();

                            for (int j=0; j<lista1.size();j++){
                                System.out.println(lista1.get(j).toString());
                            }

                            break;
                        default:
                            System.out.println("Escoge");

                    }
                    break;
                case 3:
                    Escoger=false;
                    System.out.println("Saliste");
                    break;
                default:
                    System.out.println("Solo puedes escoger entre las 2 opciones");
                    break;
            }

        }








    }
}
