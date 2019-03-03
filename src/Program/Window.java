package Program;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Window extends JFrame implements ActionListener {
    private final JPanel panel = new JPanel();
    private final JLabel titulo = new JLabel("Recetas");
    private final JTextArea bienvenida = new JTextArea("Bienvenidos a Recetas Magicas, una aplicación en donde encontrarás muchas recetas para ocasiones especiales. Disfruta!");
    private final JButton ir_recetas = new JButton("Ir a Recetas >");
    private JScrollPane barra = new JScrollPane(this.bienvenida);

    public Window() {
        iniciarComponentes();
        setTitle("Recetas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        
    }
    
    private void iniciarComponentes(){
        try {
            panel.setLayout(null);
            panel.setBackground(Color.darkGray);
            
            super.add(panel);
            
            titulo.setFont(new Font("Arial Blank", Font.PLAIN, 25));
            agregarComponentes(titulo, 100, 5, 400, 50);
            agregarComponentes(bienvenida, 50, 50, 200, 180);
            agregarComponentes(ir_recetas, 20, 250, 100, 20);
            barra = new JScrollPane(bienvenida);
            barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            
            panel.add(titulo);
            panel.add(bienvenida);
            panel.add(ir_recetas);
            
            agregarComponentes(barra, 50, 50, 200, 180);
            
        } catch (Exception e) {
        }
    }
    
    public void agregarComponentes(Component componente, int x, int y, int ancho, int alto){
        try {
            panel.add(componente);
            componente.setBounds(x, y, ancho, alto);
        } catch (Exception e) {
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
        public void Nimbus() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public JTextArea getBienvenida() {
        return bienvenida;
    }

    public JButton getIr_recetas() {
        return ir_recetas;
    }

    public JScrollPane getBarra() {
        return barra;
    }
    
}
