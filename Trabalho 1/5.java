// Classe Data
class Data {
    private int dia;
    private int mes;
    private int ano;


    // Construtor da classe Data
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    // Métodos getter e setter para dia
    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    // Métodos getter e setter para mês
    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    // Métodos getter e setter para ano
    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    // Método para exibir a data no formato dia/mês/ano
    public void exibeData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}


// Classe DataTeste para demonstrar as capacidades da classe Data
public class DataTeste {
    public static void main(String[] args) {
        // Criando um objeto da classe Data
        Data data = new Data(15, 5, 2024);
        
        // Exibindo a data
        System.out.print("Data inicial: ");
        data.exibeData();


        // Alterando os valores da data
        data.setDia(20);
        data.setMes(12);
        data.setAno(2025);


        // Exibindo a data alterada
        System.out.print("Data alterada: ");
        data.exibeData();
    }
}
