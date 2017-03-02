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
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS)); // Как кнопки будут выглядеть на экране
        JButton[] jbs = new JButton [5];  // Создали кнопки
            for (int i = 0; i < jbs.length; i++) {
                jbs [i] = new JButton("#"+i);
                jbs [i].setAlignmentY(Component.CENTER_ALIGNMENT); // Вызываем Layout и выравниваем по Y
        }

        add(jbs[0]);
        add(jbs[1]);
        add(jbs[2]);
        add(jbs[3]);
        add(jbs[4]);
        setVisible(true); // Для того чтоб окно появилось
    }
}
