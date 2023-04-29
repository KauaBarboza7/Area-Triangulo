import java.util.Scanner;


 class AreaTrapezio {
	 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite o valor da base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A area do trapezio e: " + area);
    }
}

