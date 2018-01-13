import java.util.Scanner;

public class Ecker_SpeedCalculartor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double intervalLength = 0.5;

        double currentSpeed;
        double startSpeed;
        double speedChange;

        double currentDistance = 0;
        double distance;
        double time = 0;

        System.out.println("Ziel mit steigender Geschwindigkeit ansteuern: ");
        System.out.print("Startgeschwindigkeit: ");
        startSpeed = scanner.nextDouble();

        System.out.print("GeschwindigkeitsZuwachs: ");
        speedChange = scanner.nextDouble();

        System.out.print("Entfernung: ");
        distance = scanner.nextDouble();

        currentSpeed = startSpeed;

        while (distance > currentDistance) {
            currentDistance += currentSpeed * intervalLength;
            time += intervalLength;
            currentSpeed += speedChange;
        }
        System.out.println(time);
    }
}
