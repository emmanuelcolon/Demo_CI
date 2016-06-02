package com.Main;

/**
 * Created by Ecolon on 1/6/2016.
 */
public class ModuloB {

    public ModuloB() {
    }

    public int return_dos(){

        int resultado;

        ModuloA moduloa = new ModuloA();

        resultado = moduloa.return_num() + moduloa.return_num();

        return resultado;
    }
}
