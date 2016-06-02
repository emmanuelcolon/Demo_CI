package com.Main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ecolon on 1/6/2016.
 */
public class ModuloB_Test {


    @Test
    public void test(){

        ModuloB modulob = new ModuloB();

        assertEquals("El resultado debe ser 2",2,modulob.return_dos());

    }

}
