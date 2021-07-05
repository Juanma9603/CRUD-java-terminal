package Entity;


import java.io.Serializable;

public class Persona {
    private int ID;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String Address;
    private String Email;

    public Persona (){
        this.ID=0;
        this.FirstName="";
        this.LastName="";
        this.Gender="";
        this.Address="";
        this.Email="";

    }

    public Persona(int ID, String FirstName, String LastName, String Gender, String Adress, String Email) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Address = Address;
        this.Email = Email;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public int getID(){
        return this.ID;
    }

    public  void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getFirstName(){
        return this.FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public String getLastName(){
        return this.LastName;
    }

    public void setGender(String Gender){
        this.Gender=Gender;
    }

    public String getGender(){
        return this.Gender;
    }

    public void setAddress(String Address){
        this.Address=Address;
    }

    public String getAddress(){
        return this.Address;
    }

    public void setEmail(String Email){
        this.Email=Email;
    }

    public String getEmail(){
        return this.Email;
    }


    @Override
    public String toString(){
        return "ID: "+ID+"FirstName: "+FirstName+"LastName: "+LastName+" Gender: "+Gender+" Address: "+Address+" Email: "+Email;
    }
}
