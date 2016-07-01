package es.co.rys.mplayers;

/**
 * Created by HP1 on 25/06/2016.
 */
public class RegisterData {
    //Variables
    int _id;
    String first_name;
    String last_name;
    String email_id;
    String mobile_number;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    String password;
    // Empty constructor
    public RegisterData(){

    }

    // constructor
    public RegisterData(int id, String first_name, String  last_name,String email_id,String phone_number,String mobile_number){
        this._id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id=email_id;
        this.mobile_number=mobile_number;
    }


    // Recogiendo el id
    public int getID(){
        return this._id;
    }

    // haciendo un set del id
    public void setID(int id){
        this._id = id;
    }

    public String getfirstName() {
        return first_name;
    }

    //Nombre
    public void setfirstName(String first_name){
        this.first_name =first_name;
    }
    //Apellido

    public String getlastName() {

        return last_name;
    }
    public void setlastName(String last_name){
        this.last_name =last_name;
    }
    //Emal
    public String getEmailId() {

        return email_id;
    }
    public void setEmailId(String email_id){
        this.email_id =email_id;
    }

    //movil
    public String getMobNo() {

        return  mobile_number;
    }

    public void setMobNo(String mobile_number){
        this.mobile_number=mobile_number;
    }
}
