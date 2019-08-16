/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datos;

import Analisis.TablaError;
import Logica.OpRel;
import Logica.Reportes.Literal;
import Logica.Simbolo;
import Logica.TipoDato;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class Archivo {

    private LinkedList<String> claves;
    private LinkedList<Registro> registros;

    public Archivo(LinkedList<String> claves, LinkedList<Registro> registros) {

        this.claves = claves;
        this.registros = registros;

    }

    public LinkedList<String> getClaves() {
        return claves;
    }

    public void setClaves(LinkedList<String> claves) {
        this.claves = claves;
    }

    public LinkedList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(LinkedList<Registro> registros) {
        this.registros = registros;
    }

    public String Imprimir() {

        String result = "";
        if ((claves != null) && (registros != null)) {

            result += "CLaves = [ ";
            for (String clave : claves) {
                result += clave + ", ";
            }
            result += " ]";
            result += "\nNumero de Registros = " + registros.size();
        }

        return result;
    }

    public void mostrarConsola() {

        System.out.println("----------------Claves------");

        System.out.println("\n----------------Registros------");

        for (Registro registro : registros) {

            registro.Imprimir();
        }

    }

    public int Contar() {

        return registros.size();

    }

    public Simbolo Sumar(Literal clave) {

        Simbolo result = new Simbolo(TipoDato.error, null);

        int index = claves.indexOf(clave.valor.toString());

        if (registros.get(0).get(index).tipo.compareTo(TipoDato.numerico) == 0) {
            Double actual = 0.0;

            for (int i = 0; i < registros.size(); i++) {
                Registro registro = registros.get(i);
                Simbolo simb = registro.get(index);
                actual += Double.parseDouble(simb.valor.toString());
            }
            result.tipo = TipoDato.numerico;
            result.valor = actual.toString();
        } else {
            TablaError er = TablaError.getInstance();
            String descripcion = "Se esperaba una clave de Tipo numerica";
            er.setError(clave.valor.toString(), clave.linea, clave.columna, "Reporte: Semantico", descripcion);
        }

        return result;
    }

    public Simbolo Promedio(Literal clave) {

        Simbolo result = new Simbolo(TipoDato.error, null);

        int index = claves.indexOf(clave.valor.toString());

        if (registros.get(0).get(index).tipo.compareTo(TipoDato.numerico) == 0) {
            Double actual = 0.0;

            for (int i = 0; i < registros.size(); i++) {
                Registro registro = registros.get(i);
                Simbolo simb = registro.get(index);
                actual += Double.parseDouble(simb.valor.toString());
            }

            actual = actual / registros.size();

            result.tipo = TipoDato.numerico;
            result.valor = actual.toString();
        } else {
            TablaError er = TablaError.getInstance();
            String descripcion = "Se esperaba una clave de Tipo numerica";
            er.setError(clave.valor.toString(), clave.linea, clave.columna, "Reporte: Semantico", descripcion);
        }

        return result;
    }

    public Simbolo ContarSi(Literal clave1, Literal clave2, OpRel rel) {

        Simbolo result = new Simbolo(TipoDato.error, null);

        switch (rel) {

            //>
            case mayorque:

                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor > comp) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);

                }

                break;

            //<
            case menorque:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor < comp) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);

                }

                break;

            //>=
            case mayorigual:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor >= comp) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);

                }

                break;

            //<=
            case menorigual:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor <= comp) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);

                }

                break;

            //==
            case dobleigual:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor == comp) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);

                } else {
                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        String valor = simb.valor.toString();
                        String comp = clave2.valor.toString();

                        if (valor.equals(comp)) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);
                }

                break;

            //>
            case negacion:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor != comp) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);

                } else {
                    int index = claves.indexOf(clave1.valor.toString());

                    int cont = 0;

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        String valor = simb.valor.toString();
                        String comp = clave2.valor.toString();

                        if (!valor.equals(comp)) {
                            cont++;
                        }
                    }

                    result.tipo = TipoDato.numerico;
                    result.valor = String.valueOf(cont);
                }
                break;

        }

        return result;

    }

    public Simbolo ObtenerSi(Literal clave1, Literal clave2, OpRel rel) {

        Simbolo result = new Simbolo(TipoDato.error, null);
        LinkedList<Registro> data = new LinkedList<>();

        switch (rel) {

            //>
            case mayorque:

                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor > comp) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);

                }

                break;

            //<
            case menorque:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor < comp) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);

                }

                break;

            //>=
            case mayorigual:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor >= comp) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);

                }

                break;

            //<=
            case menorigual:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor <= comp) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);

                }

                break;

            //==
            case dobleigual:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor == comp) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);

                } else {
                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        String valor = simb.valor.toString();
                        String comp = clave2.valor.toString();

                        if (valor.equals(comp)) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);
                }

                break;

            //>
            case negacion:
                if (esNumero(clave2) && esColNumerica(clave1)) {

                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        int valor = Integer.parseInt(simb.valor.toString());
                        int comp = Integer.parseInt(clave2.valor.toString());

                        if (valor != comp) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);

                } else {
                    int index = claves.indexOf(clave1.valor.toString());

                    for (int i = 0; i < registros.size(); i++) {
                        Registro registro = registros.get(i);
                        Simbolo simb = registro.get(index);

                        String valor = simb.valor.toString();
                        String comp = clave2.valor.toString();

                        if (!valor.equals(comp)) {
                            data.add(registro);
                        }
                    }

                    result.tipo = TipoDato.cadena;
                    result.valor = obtenerCadena(data, index);
                }
                break;

        }

        return result;

    }

    public String obtenerCadena(LinkedList<Registro> data, int index) {
        String result = "";

        String clave = claves.get(index);
        result += "[\n";

        for (Registro registro : data) {
           result+= registro.obtenerCadena(clave);
        }
        result += "\n]";

        return result;
    }

    public Boolean esColNumerica(Literal clave) {

        int index = claves.indexOf(clave.valor.toString());

        //miramos si el priemer registro en es a posicion es de tipo numerico
        if (registros.get(0).get(index).tipo.compareTo(TipoDato.numerico) == 0) {
            return true;
        } else {
            TablaError er = TablaError.getInstance();
            String descripcion = "Se esperaba una clave de Tipo numerica";
            er.setError(clave.valor.toString(), clave.linea, clave.columna, "Reporte: Semantico", descripcion);

            return false;
        }

    }

    public Boolean esNumero(Literal clave) {

        Boolean esnumero = clave.tipo.compareTo(TipoDato.numerico) == 0;

        if (esnumero) {
            return true;
        } else {

            TablaError er = TablaError.getInstance();
            String descripcion = "Se esperaba una clave de Tipo numerica";
            er.setError(clave.valor.toString(), clave.linea, clave.columna, "Reporte: Semantico", descripcion);
            return false;
        }

    }

}
