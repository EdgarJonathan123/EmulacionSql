/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author jonathan
 */
public class pestana extends JScrollPane {

    private JTextPane texto;
    private String name;
    public TextLineNumber textolinea;
    private String ruta;

    public pestana(JTextPane _texto, String name, String ruta) {
        super(_texto);
        this.texto = _texto;
        this.name = name;
        textolinea = new TextLineNumber(texto);
        this.ruta = ruta;
        this.setRowHeaderView(textolinea);  
    }

    public Boolean rutaEndWith(String ext) {

        String[] part = ruta.split(".");

        if (part[1].equals(ext)) {
            return true;
        }
        return false;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto.getText();
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto.setText(texto);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
