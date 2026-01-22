package Command;

import GameLogic.Character;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private HashMap<String, Command> commands;
    private Scanner scanner;
    private Character character;



    public Console(Character character){
        scanner = new Scanner(System.in);
        commands = new HashMap<>();
        this.character = character;
    }

    public void inicializator(){
        commands.put("help",new Help());
        commands.put("move",new Move(character));



    }
    public void execute() {
        System.out.print(" ~ > ");
        String command = scanner.nextLine();


        String[] cm = command.trim().toLowerCase().split(" ");
        if(commands.containsKey(cm[0])) {

            Command com = commands.get(cm[0]);
            if (commands.get(command) instanceof Move move){
                move.setCharacter(character);
            }
            if (cm.length>2){
                System.out.println("too many parameters");
                return;
            }
            if (cm.length !=1) {
                System.out.println(com.execute(cm[1]));
//              isExit = commands.get(command).exit();
            }else{
                System.out.println(com.execute(""));
            }

        }else {
        System.out.println("command not found");
        }

    }



    }
