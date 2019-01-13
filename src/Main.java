public class Main {

    public static void main(String[] args){

        for (String i:args) {
            System.out.println("Привет, " + i + "!");
        }
        System.out.println("ololo");
        System.out.println("NewBranch1");

        DoNothing lazy = new DoNothing();

        lazy.doNothing();

        DoSomeThing busy = new DoSomeThing();

        busy.doSomeThing();

    }
}
