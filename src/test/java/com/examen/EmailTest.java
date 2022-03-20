package com.examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmailTest {
    @Test
    public void gettersTest() throws Exception{
        Email e=new Email("jdbolivar@ieshlanz.es");
        assertEquals("jdbolivar", e.getNombreUsuario());
        assertEquals("ieshlanz.es", e.getDominio());
    }
    
    @Test (expected = Exception.class)
    public void ConstructorTest() throws Exception{
        Email e=new Email("@gmail.com");
    }

    @Test
    public void crearCorreoCorporativoTest1() throws Exception{
        Email e=Email.crearCorreoCorporativo("Juan Diego Bolívar Ramos");
        assertEquals("jdbr", e.getNombreUsuario());
    }
    @Test

    public void crearCorreoCorporativoTest2() throws Exception{
        Email e=Email.crearCorreoCorporativo("Juan Diego Bolívar Ramos");
        List<String> dominios = new ArrayList<>();
        dominios.add("gmail.com");
        dominios.add("hotmail.com");
        dominios.add("ieshlanz.es");
        assertTrue(dominios.contains(e.getDominio()));
    }


}
