package proyectoso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica extends JFrame {
    private SimuladorAlmacen simulador;
    private JTextArea textArea;

    public InterfazGrafica() {
        simulador = new SimuladorAlmacen();
        configurarVentana();
    }

    private void configurarVentana() {
        setTitle("Simulador de Almacén");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem generarPedidos = new JMenuItem("Generar Pedido");
        generarPedidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pedido pedido = new GeneradorPedidos().generarPedido();
                Resultado resultado = simulador.procesarPedido(pedido);
                textArea.append(resultado.toString() + "\n");
            }
        });

        JMenuItem guardarResultados = new JMenuItem("Guardar Resultados");
        guardarResultados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simulador.guardarResultados("resultados.txt");
            }
        });

        menu.add(generarPedidos);
        menu.add(guardarResultados);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        InterfazGrafica ventana = new InterfazGrafica();
        ventana.setVisible(true);
    }
}
