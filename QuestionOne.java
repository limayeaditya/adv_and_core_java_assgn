import java.util.*;

public class QuestionOne {

    public static void main(String[] args) {
        
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        argList.stream()
        .forEach(e->System.out.format("%s ",e));

        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}