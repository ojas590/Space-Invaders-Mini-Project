import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        SpaceInvaders spaceInvaders = new SpaceInvaders();
        frame.add(spaceInvaders);

        spaceInvaders.addKeyListener(spaceInvaders);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        spaceInvaders.requestFocusInWindow();
    }
}

