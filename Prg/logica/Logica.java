package logica;

import biblioteca.LE;
import datos.Trabajadores;

public class Logica {

    // wtf (?)
    int senti = 0;

    public Trabajadores[] init(){
        int x = LE.leerInt("Ingrese cantidad de trabajadores");

        Trabajadores[] tra = new Trabajadores[x];

        for(int i = 0 ; i < tra.length ; i++  ){
            tra[i] = new Trabajadores(); 
        }

        return tra;
    }

    private Trabajadores[] ingreso( Trabajadores[] tra, int vector ){

        String txt_n = LE.leerString("1.) Ingrese NOMBRE del trabajador   # "+vector);
        String txt_a = LE.leerString("2.) Ingrese APELLIDO del trabajador # "+vector);
        double txt_s = LE.leerDouble("2.) Ingrese SUELDO del trabajador # "+vector);

        tra[vector].setNombre(txt_n);
        tra[vector].setApellido(txt_a);
        tra[vector].setSueldo(txt_s);

        senti++;
        return tra;
    }

    // Sobrecarga de metodos
    private Trabajadores[] ingreso(Trabajadores[] tra){

        for(int x = 0; x < tra.length; x++){
            ingreso(tra,x);
        }

        // Wtf (?)

        return tra;
    }

    private void mostrar(Trabajadores[] tra){
        String txt = "";
        for(int j = 0 ; j < senti; j++ ){

            txt += tra[j].getNA()+"\n";

        }

        LE.mostrarInformacion("Celefer", "Trabajadores", txt , "ok", null);
    }


    // Menu
    public void menu(Trabajadores[] tra){

        boolean salida = true;
        int op = 0;

        String  txt =  "Ingrese una opcion " +"\n";
                txt += "[1] Ingresar"+"\n";
                txt += "[2] Mostrar"+"\n";
                txt += "[3] Salir"+"\n";

        while(salida){

            op = LE.leerInt(txt);

            switch(op){

                case 1:
                    ingreso(tra);
                    break;
                case 2:
                    mostrar(tra);
                    break;
                case 3:
                    salida = false;
                    break; 
            }
        }
    }





}