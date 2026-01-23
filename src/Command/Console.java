package Command;

import GameLogic.Character;
import GameLogic.GameLoop;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private HashMap<String, Command> commands;
    private Scanner scanner;
    private Character character;
    private GameLoop gameLoop;



    public Console(Character character,GameLoop gameLoop){
        scanner = new Scanner(System.in);
        commands = new HashMap<>();
        this.character = character;
        this.gameLoop = gameLoop;
    }

    public void inicializator(){
        commands.put("help",new Help(commands));
        commands.put("move",new Move(character));
        commands.put("stop",new Stop());



    }
    public void execute() {
        System.out.print(" ~ > ");
        String command = scanner.nextLine();


        String[] cm = command.trim().toLowerCase().split(" ");
        if(commands.containsKey(cm[0])) {
            if (cm.length<3){
                Command com = commands.get(cm[0]);

                if (cm.length !=1) {
                    System.out.println(com.execute(cm[1]));

                }else{
                    System.out.println(com.execute(""));
                }
                gameLoop.setExit(commands.get(cm[0]).exit());
            }else {
                System.out.println("too many parameters");
                return;
            }


        }else {
            System.out.println("command not found");
        }

    }



    }
