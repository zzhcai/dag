package app;

import javax.swing.*;

public class WhiteBoardGUI {

    public static JFrame frame;
    public static LobbyPane lobby;

    public static void setUp() {
        frame = new JFrame("Draw and Guess");
        frame.setSize(1200, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new WelcomePane());
//        frame.add(lobbyScreen());
//        frame.add(new GuessPane());
        frame.add(new DrawPane());
        frame.setVisible(true);
    }

    private static JPanel lobbyScreen() {
        Room[] rooms = new Room[8];
        rooms[0] = new Room("Example 1", 1, 5);
        rooms[1] = new Room("Example 2", 4, 5);
        rooms[2] = new Room("Example 3", 10, 10);
        rooms[3] = new Room("Example 4", 1, 10);
        rooms[4] = new Room("Example 5", 3, 10);
        rooms[5] = new Room("Example 6", 6, 10);
        rooms[6] = new Room("Example 7", 7, 10);
        rooms[7] = new Room("Example 8", 9, 10);
        lobby = new LobbyPane(rooms);

        return lobby;
    }
}
