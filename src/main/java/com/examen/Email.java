package com.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Email {
    private String nombreUsuario;
    private String dominio;


    public Email(String correo) throws Exception {
        if(validarCorreo(correo)){
            int j=0;
            nombreUsuario="";
            for (int i = 0; i < correo.length(); i++) {
                if(correo.charAt(i)!='@'){
                    nombreUsuario+=correo.charAt(i);
                }else{
                    j=i;
                    i=correo.length();
                }
            }

            dominio=correo.substring(j+1);
        }else throw new Exception("Correo electronico no valido");
    }


    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDominio() {
        return this.dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String toString() {
        return nombreUsuario+"@"+dominio;
    }


    private boolean validarCorreo(String correo){
        int arroba=0;
        for (int i = 0; i < correo.length(); i++) {
            if(correo.charAt(i)==' ') return false;
            else if(correo.charAt(i)=='@'){
                arroba++;
                if(arroba>1||i==0||i>(correo.length()-4)) return false;
            }else if(arroba==1&&correo.charAt(i)=='.'&&correo.charAt(i-1)!='@'&&i<correo.length()-1) return true;
        }
        return false;
    }

    public static Email crearCorreoCorporativo(String nombre) throws Exception{
        String nombreDeUsuario="";
        boolean e=true;
        String nombreMinus= nombre.toLowerCase();
        for (char letra : nombreMinus.toCharArray()) { 
            if(e) nombreDeUsuario+=letra;
            e=false;
            if(letra==' ') e=true;
    
        }

        List<String> dominios = new ArrayList<>();
        dominios.add("gmail.com");
        dominios.add("hotmail.com");
        dominios.add("ieshlanz.es");

        String email=nombreDeUsuario+"@"+dominios.get((new Random()).nextInt(dominios.size()));

        return new Email(email);
    }
}
