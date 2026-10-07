import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        boolean runAgain = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<chessOpening> listOfChessOpenings = new ArrayList<>();
        listOfChessOpenings.add(new chessOpening("Ruy Lopez", "e4 e5 Nf3 Nc6 Bb5"));
        listOfChessOpenings.add(new chessOpening("Sicilian Defense", "e4 c5"));
        listOfChessOpenings.add(new chessOpening("Queen's Gambit", "d4 d5 c4"));
        listOfChessOpenings.add(new chessOpening("Italian Game", "e4 e5 Nf3 Nc6 Bc4"));
        listOfChessOpenings.add(new chessOpening("French Defense", "e4 e6 d4 d5"));
        listOfChessOpenings.add(new chessOpening("Caro-Kann Defense", "e4 c6 d4 d5"));
        listOfChessOpenings.add(new chessOpening("English Opening", "c4"));
        listOfChessOpenings.add(new chessOpening("King's Indian Defense", "d4 Nf6 c4 g6"));
        listOfChessOpenings.add(new chessOpening("London System", "d4 d5 Bf4"));
        listOfChessOpenings.add(new chessOpening("Nimzo-Indian Defense", "d4 Nf6 c4 e6 Nc3 Bb4"));
        listOfChessOpenings.add(new chessOpening("Scandinavian Defense", "e4 d5"));
        listOfChessOpenings.add(new chessOpening("Pirc Defense", "e4 d6 d4 Nf6"));
        listOfChessOpenings.add(new chessOpening("Slav Defense", "d4 d5 c4 c6"));
        listOfChessOpenings.add(new chessOpening("Queen's Indian Defense", "d4 Nf6 c4 e6 Nf3 b6"));
        listOfChessOpenings.add(new chessOpening("Catalan Opening", "d4 Nf6 c4 e6 g3"));
        listOfChessOpenings.add(new chessOpening("Grunfeld Defense", "d4 Nf6 c4 g6 Nc3 d5"));
        listOfChessOpenings.add(new chessOpening("Dutch Defense", "d4 f5"));
        listOfChessOpenings.add(new chessOpening("Reti Opening", "Nf3"));
        listOfChessOpenings.add(new chessOpening("King's Gambit", "e4 d5 f4"));
        listOfChessOpenings.add(new chessOpening("Scotch Game", "e4 e5 Nf3 Nc6 d4"));
        while(runAgain){
            int randomInt = (int)(Math.random() * listOfChessOpenings.size());
            System.out.println("Chess Line: " + listOfChessOpenings.get(randomInt).getChessLine());
            System.out.print("(Enter 'End' to quit) Chess Opening Name: ");
            String inputOpening = scanner.nextLine();
            if(inputOpening.equals("End")){
                runAgain = false;
                System.out.println("You have quit the program.");
            }else{
                while(!(inputOpening.equals(listOfChessOpenings.get(randomInt).getName()))){
                    if(inputOpening.equals("End")){
                        runAgain = false;
                        System.out.println("You have quit the program.");
                        break;
                    }
                    System.out.println("Incorrect");
                    System.out.print("Chess Opening Name: ");
                    inputOpening = scanner.nextLine();
                }
            }
        }
    }
}

public class chessOpening{
    private String name;
    private String chessLine;
    
    public chessOpening(String name, String chessLine){
        this.name = name;
        this.chessLine = chessLine;
    }
    public String getName(){
        return name;
    }
    public String getChessLine(){
        return chessLine;
    }
}
