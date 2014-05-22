package modele;

/**
 * Created by schuma on 22/05/14.
 */
public class CPU {
    public void freeze() {
        System.out.println("Attention ca freeze");
    }
    public void jump(long position) {
        System.out.println("Je fais un saut en position : " +position);
    }
    public void execute() {
        System.out.println("J'execute des taches");
    }
}
