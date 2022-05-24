public class Funcionarios{
    //funcionario: nome, cpf, valor hora trabalhada, hora trabalhada (max. 44h), possui filhos 
    private String nome;
    private String cpf;
    private double valorHora;
    private int cargaHoraria;
    private boolean possuiFilhos;

    public Funcionarios(String nome, String cpf, double valorHora, int cargaHoraria, boolean possuiFilhos) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.cargaHoraria = cargaHoraria;
        this.possuiFilhos = possuiFilhos;
        if (cargaHoraria >= 44) {
            this.cargaHoraria = 44;
        }
        if (valorHora < 0) {
            this.valorHora = 0;
        }
        if (cargaHoraria < 0){
            this.cargaHoraria = 0;
        }
    }

    //construtores, getters, setters, toString

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
        if (valorHora < 0) {
            this.valorHora = 0;
        }
    }

    public int getHoraTrabalhada() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int horaTrabalhada) {
        this.cargaHoraria = horaTrabalhada;
        if (cargaHoraria >= 44) {
            this.cargaHoraria = 44;
        }
    }

    public boolean isPossuiFilhos() {
        return possuiFilhos;
    }

    public void setPossuiFilhos(boolean possuiFilhos) {
        this.possuiFilhos = possuiFilhos;
    }

    @Override
    public String toString() {
        return "Funcionarios [cpf= " + cpf + ", cargaHoraria= " + cargaHoraria + ", nome= " + nome + ", possuiFilhos= "
                + possuiFilhos + ", valorHora =" + valorHora + "]";
    }
    
    //calculo de salario de funcionario

    public double salario(int valorHora, int cargaHoraria) {
        double salario = valorHora * cargaHoraria;
        return salario;
    }
}