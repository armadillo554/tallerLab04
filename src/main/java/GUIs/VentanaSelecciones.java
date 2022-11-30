package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSelecciones extends Ventana implements ActionListener {
    private JLabel etiquetaElegirSeleccion;
    private JLabel etiquetaRankingFIFA;
    private JButton jugadores;
    private JButton salir;
    private JComboBox seleccion;
    private ImageIcon iconoSeleccion;

    public VentanaSelecciones(){
        etiquetaElegirSeleccion=this.generarEtiqueta("Chose team: ", 30, 40, 75, 20);
        etiquetaRankingFIFA=this.generarEtiqueta("Ranking FIFA: ", 30, 130, 110, 20);
        jugadores=this.generarBoton("Players", 100, 300, 125, 30);
        salir=this.generarBoton("Exit", 400, 300, 110, 30 );

        jugadores.addActionListener(this);
        salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jugadores) {

        }else {
            this.dispose();
        }
    }
}