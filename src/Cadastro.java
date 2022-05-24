import java.util.Scanner;
public class Cadastro {
    private int f;

    public int getF() {
        return f;
    }
    public void setF(int f) {
        this.f = f;
    }
    
    public static void menuOpcoes(int input) {
        if (input == 1) {
            cadastrar();
        }
        if (input == 2) { 
            listar(); 
        }
        if (input == 3) { 
            remover(); 
        }
        if (input == 4) {
            ranking();  
        }
        if (input == 5) {  
            editSalario();
        }
        if (input == 6) { 
            porcentFilhos();
        }
        if (input == 0) {  
            sair();
        }
    }
    //menu de opcoes
    public static void menu() {
        System.out.println("SISTEMA DE FUNCIONÁRIOS\n");
        System.out.println("[1]Cadastrar novo funcionário");
        System.out.println("[2]Listar funcionários");
        System.out.println("[3]remover funcionário");
        System.out.println("[4]Ranking salários");
        System.out.println("[5]editar salário");
        System.out.println("[6]Funcionários com filhos");
        System.out.println("[0]Sair");
        System.out.println("digite o numero para acessar o metodo:\n> ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input < 0 || input > 6) {
            System.out.println("DIGITE UM NÚMERO VÁLIDO!\n> ");
            input = sc.nextInt();
        }
        menuOpcoes(input);
    }
    //cadastrar funcionario
    public static void cadastrar() {
        System.out.println("CADASTRAR FUNCIONÁRIO\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome\n>\n");
        String nome = sc.nextLine();
        System.out.println("Digite o cpf no formato ***.***.***.**\n> \n");
        String cpf = sc.nextLine();
        System.out.println("Digite a o valor da hora trabalhada\n> \n");
        Double valorHora = sc.nextDouble();
        System.out.println("Digite a carga horária semanal\n> \n");
        int cargaHoraria = sc.nextInt();
        System.out.println("Possui filhos?\nDigite s ou n\n> ");
        String input = sc.nextLine();
        while (input.toLowerCase() != "s" || input.toLowerCase() != "n") {
            System.out.println("digite s ou n!");
            input = sc.nextLine();
        }
        boolean filhos;
        if (input.toLowerCase() == "s") {
            filhos = true;
        }
        if (input.toLowerCase() == "n") {
            filhos = false;
        }




    }
    //listar funcionarios cadastrados
    public static String listar() {
        String lista = "";
        return lista;
    }
    //remover um funcionario a partir do cpf
    public static void remover() {
        
    }

    //funcionario com maior salarios
    public static void ranking() {
        
    }
    //editar o salario pelo cpf
    public static void editSalario() {
        
    }

    //porcentagem de funcionarios que possuem filhos
    public static void porcentFilhos() {
        
    }
    //sair 
    public static void sair() {
        
    }

    //main
    public static void main(String[] args) {
        //iniciar 5 funcionarios
        Funcionarios f1 = new Funcionarios("Enzo", "132.443.657.90", 9, 30, false);
        Funcionarios f2 = new Funcionarios("Bento", "846.154.908.12", 12.5, 40, true);
        Funcionarios f3 = new Funcionarios("Carlos", "131.123.124.14", 30, 50, false);
        Funcionarios f4 = new Funcionarios("Isa", "032.567.124.64", 20.5, 30, true);
        Funcionarios f5 = new Funcionarios("Valdemir", "123.233.554.21", 40, 35, true);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);


    }
}
