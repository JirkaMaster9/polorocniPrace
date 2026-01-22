package Command;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private HashMap<String, Command> commands;
    private Scanner scanner;

    public Console(){

        scanner = new Scanner(System.in);
        commands = new HashMap<>();
    }
    public void inicializator(){
        commands.put("help",new Help());
        commands.put("move",new Move());

    }
    public void execute() {
        System.out.print(" ~ > ");
        String command = scanner.nextLine();


        String[] cm = command.trim().toLowerCase().split(" ");
        if(commands.containsKey(cm[0])) {
            Command com = commands.get(cm[0]);
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
