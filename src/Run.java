/**
 * Created by Victor on 29/5/16.
 */
public class Run {
    public static void main(String[] args) {
        Computer server = Factory.getComputer(Computer.Type.SERVER, "100", "100");

        Computer pc = Factory.getComputer(Computer.Type.PC, "300", "300");
    }
}
