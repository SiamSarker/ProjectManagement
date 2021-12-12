package problem1;

import java.util.Scanner;

public class Club {
    private String name;
    private int total_num_of_players;

    public Club() {
    }

    public Club(String name, int total_num_of_players) {
        this.name = name;
        this.total_num_of_players = total_num_of_players;

        Player p1[] = new Player[total_num_of_players];
        for (int i = 0; i<total_num_of_players; i++)
            addPlayer(p1[i]);

    }

    void addPlayer(Player s)
    {
        Scanner sc1 = new Scanner(System.in);
            s = new Player(sc1.next(), sc1.nextDouble(), sc1.nextInt());
            s.print();
    }

    void print()
    {

    }

    void deletePlayer()
    {

    }

}
