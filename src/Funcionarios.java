public class Funcionarios{
    //funcionario: nome, cpf, valor hora trabalhada, hora trabalhada (max. 44h), possui filhos 
    private String nome;
    private String cpf;
    private float valorHora;
    private int cargaHoraria;
    private boolean possuiFilhos;

    public Funcionarios(String nome, String cpf, int valorHora, int horaTrabalhada, boolean possuiFilhos) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.cargaHoraria = horaTrabalhada;
        this.possuiFilhos = possuiFilhos;
        if (cargaHoraria >= 44) {
            this.cargaHoraria = 44;
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

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoraTrabalhada() {
        return cargaHoraria;
    }

    public void setHoraTrabalhada(int horaTrabalhada) {
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

    public float salario(int valorHora, int cargaHoraria) {
        float salario = valorHora * cargaHoraria;
        return salario;
    }
}