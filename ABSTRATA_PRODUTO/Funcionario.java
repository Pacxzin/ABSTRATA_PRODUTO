package ABSTRATA_PRODUTO

//interface Funcionario / o método calcularBonus
public interface Funcionario {
    double calcularBonus(); // Método para calcular o bônus do funcionario
}

// Classe do funcionário assalariado
public class FuncionarioAssalariado implements Funcionario {
    // Bônus fixo para funcionários assalariados
    private static final double BONUS_FIXO = 5000.00;

    // Implementa o método calcularBonus para retornar o bônus fixo
    @Override
    public double calcularBonus() {
        return BONUS_FIXO; // Retorna o valor fixo de R$ 5.000,00
    }
}

// Classe do funcionário horista
public class FuncionarioHorista implements Funcionario {
    // Atributo que armazena o total anual recebido pelo funcionário
    private double totalAnualRecebido;

    // Construtor que recebe o total anual recebido
    public FuncionarioHorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido; // Inicializa o atributo
    }

    //método calcularBonus para 10% do recebido
    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10; // Retorna 10% do total anual
    }
}

// Classe main
public class Main {
    public static void main(String[] args) {
        //cria a instância de FuncionarioAssalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado();
        // mostra o bonus do func.
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());

        // Cria uma instância de FuncionarioHorista com um total anual de R$ 60.000,00
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista(60000.00);
        // mostra o bonus do func.
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}
