package es.co.rys.muonplayers.dto;

/**
 * Created by HP1 on 21/06/2016.
 */
public class Usuarios {

    private int id;
    private String usuario;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String modelo) {
        this.usuario = modelo;
    }

    public Usuarios (int id, String usuario, String password)
    {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }

    public Usuarios (String usuario)
    {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
