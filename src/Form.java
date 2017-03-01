import javax.swing.*;

/**
 * Created by Programmer on 02.03.2017.
 */
public class Form extends JFrame {
    public Form(){
        setTitle("Test Window");  // Текст в шапке окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Чтобы программа полностью перестовала работать при нажатии крестика
        setBounds(600,200,400,400);   // Сдвоеный метод, для проставления размеров окна и его положения
        setVisible(true); // Для того чтоб окно появилось
    }
}
