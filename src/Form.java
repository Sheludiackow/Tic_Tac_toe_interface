import javax.swing.*;
import java.awt.*;

/**
 * Created by Programmer on 02.03.2017.
 */
public class Form extends JFrame {
    public Form(){
        setTitle("Test Window");  // Текст в шапке окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Чтобы программа полностью перестовала работать при нажатии крестика
        setBounds(600,200,400,400);   // Сдвоеный метод, для проставления размеров окна и его положения
        JButton[] jbs = new JButton [5];  // Создали кнопки
            for (int i = 0; i < jbs.length; i++) {
                jbs [i] = new JButton("#"+i);
        }
        setLayout(new BorderLayout()); // Как кнопки будут выглядеть на экране
        add(jbs[0],BorderLayout.EAST);
        add(jbs[1],BorderLayout.WEST);
        add(jbs[2],BorderLayout.NORTH);
        add(jbs[3],BorderLayout.SOUTH);
        add(jbs[4],BorderLayout.CENTER);
        setVisible(true); // Для того чтоб окно появилось
    }
}
