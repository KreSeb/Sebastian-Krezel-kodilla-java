package BraveKnight;

public class Process {
    public static void main (String[] Args){
        Knight knight = new Knight();
        knight.telingStrory(new DeadIslandQuest());
        knight.telingStrory(new EliteKnightQuest());
    }
}
