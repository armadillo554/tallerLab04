package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJugadores extends Ventana implements ActionListener {
    private JLabel etiquetaFormacion;
    private JButton editarJugador;
    private JButton guardarCambios;
    private JButton volver;

    public VentanaJugadores(){
        this.setSize(650, 550);
        etiquetaFormacion=this.generarEtiqueta("Official formation", 30, 40, 150, 20);
        editarJugador=this.generarBoton("Edit player", 50, 450, 125, 30);
        guardarCambios=this.generarBoton("Save changes", 250, 450, 125, 30);
        volver=this.generarBoton("Back", 450, 450, 110,30);

        editarJugador.addActionListener(this);
        guardarCambios.addActionListener(this);
        volver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==editarJugador){

        } else if (e.getSource()==guardarCambios) {

        }else {
            new VentanaSelecciones();
        }
    }
}