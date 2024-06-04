A)
import java.util.Date;


public class EntradaDeCinema {
    private Date dataDoFilme;
    private String horario;
    private int sala;
    private double valor;


    // Construtor para inicializar todos os atributos
    public EntradaDeCinema(Date dataDoFilme, String horario, int sala, double valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }


    // Métodos getter e setter para cada atributo
    public Date getDataDoFilme() {
        return dataDoFilme;
    }


    public void setDataDoFilme(Date dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public int getSala() {
        return sala;
    }


    public void setSala(int sala) {
        this.sala = sala;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public static void main(String[] args) {
        // Exemplo de uso do construtor
        Date dataDoFilme = new Date();
        EntradaDeCinema entrada = new EntradaDeCinema(dataDoFilme, "19:00", 1, 25.0);


        // Exibindo informações da entrada de cinema
        System.out.println("Data do Filme: " + entrada.getDataDoFilme());
        System.out.println("Horário: " + entrada.getHorario());
        System.out.println("Sala: " + entrada.getSala());
        System.out.println("Valor: R$ " + entrada.getValor());
    }
}






B)
import java.util.Date;


public class EntradaDeCinema {
    private Date dataDoFilme;
    private String horario;
    private int sala;
    private double valor;


    public EntradaDeCinema(Date dataDoFilme, String horario, int sala, double valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }


    public Date getDataDoFilme() {
        return dataDoFilme;
    }


    public void setDataDoFilme(Date dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public int getSala() {
        return sala;
    }


    public void setSala(int sala) {
        this.sala = sala;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    // Método para calcular desconto com base na data de nascimento do cliente
    public double calculaDesconto(Data dataNascimento) {
        // Supondo que a classe Data esteja definida e tenha um método para obter o ano de nascimento
        int anoNascimento = dataNascimento.getAno();


        // Obtendo o ano atual
        Date dataAtual = new Date();
        int anoAtual = dataAtual.getYear() + 1900;


        // Calculando a idade do cliente
        int idade = anoAtual - anoNascimento;


        // Aplicando desconto de 50% se a idade for menor que 12 anos
        if (idade < 12) {
            return valor * 0.5;
        } else {
            return valor;
        }
    }


    public static void main(String[] args) {
        Date dataDoFilme = new Date();
        EntradaDeCinema entrada = new EntradaDeCinema(dataDoFilme, "19:00", 1, 25.0);


        Data dataNascimentoCliente = new Data(2010, 5, 10); // Exemplo de data de nascimento


        double valorComDesconto = entrada.calculaDesconto(dataNascimentoCliente);
        System.out.println("Valor com Desconto: R$ " + valorComDesconto);
    }
}


// Classe Data (exemplo simplificado para demonstração)
class Data {
    private int ano;
    private int mes;
    private int dia;


    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }


    public int getAno() {
        return ano;
    }


    public int getMes() {
        return mes;
    }


    public int getDia() {
        return dia;
    }
}




C)
import java.util.Date;


public class EntradaDeCinema {
    private Date dataDoFilme;
    private String horario;
    private int sala;
    private double valor;


    public EntradaDeCinema(Date dataDoFilme, String horario, int sala, double valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }


    public Date getDataDoFilme() {
        return dataDoFilme;
    }


    public void setDataDoFilme(Date dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public int getSala() {
        return sala;
    }


    public void setSala(int sala) {
        this.sala = sala;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    // Método para calcular desconto com base na data de nascimento do cliente
    public double calculaDesconto(Data dataNascimento) {
        // Supondo que a classe Data esteja definida e tenha um método para obter o ano de nascimento
        int anoNascimento = dataNascimento.getAno();


        // Obtendo o ano atual
        Date dataAtual = new Date();
        int anoAtual = dataAtual.getYear() + 1900;


        // Calculando a idade do cliente
        int idade = anoAtual - anoNascimento;


        // Aplicando desconto de 50% se a idade for menor que 12 anos
        if (idade < 12) {
            return valor * 0.5;
        } else {
            return valor;
        }
    }


    public static void main(String[] args) {
        Date dataDoFilme = new Date();
        EntradaDeCinema entrada = new EntradaDeCinema(dataDoFilme, "19:00", 1, 25.0);


        Data dataNascimentoCliente = new Data(2010, 5, 10); // Exemplo de data de nascimento


        double valorComDesconto = entrada.calculaDesconto(dataNascimentoCliente);
        System.out.println("Valor com Desconto: R$ " + valorComDesconto);
    }
}


// Classe Data (exemplo simplificado para demonstração)
class Data {
    private int ano;
    private int mes;
    private int dia;


    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }


    public int getAno() {
        return ano;
    }


    public int getMes() {
        return mes;
    }


    public int getDia() {
        return dia;
    }
}




D)
import java.util.Date;


public class EntradaDeCinema {
    private Date dataDoFilme;
    private String horario;
    private int sala;
    private double valor;


    public EntradaDeCinema(Date dataDoFilme, String horario, int sala, double valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }


    public Date getDataDoFilme() {
        return dataDoFilme;
    }


    public void setDataDoFilme(Date dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public int getSala() {
        return sala;
    }


    public void setSala(int sala) {
        this.sala = sala;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    // Método para calcular desconto com base na data de nascimento do cliente
    public double calculaDesconto(Data dataNascimento) {
        // Supondo que a classe Data esteja definida e tenha um método para obter o ano de nascimento
        int anoNascimento = dataNascimento.getAno();


        // Obtendo o ano atual
        Date dataAtual = new Date();
        int anoAtual = dataAtual.getYear() + 1900;


        // Calculando a idade do cliente
        int idade = anoAtual - anoNascimento;


        // Aplicando desconto de 50% se a idade for menor que 12 anos
        if (idade < 12) {
            return valor * 0.5;
        } else {
            return valor;
        }
    }


    // Método para calcular desconto de acordo com o horário do filme
    public double calculaDescontoHorario() {
        // Obtendo a hora atual
        Date dataAtual = new Date();
        int horaAtual = dataAtual.getHours();


        // Convertendo o horário do filme para horas (exemplo: "15:30" -> 15)
        int horaFilme = Integer.parseInt(horario.split(":")[0]);


        // Aplicando desconto de 10% se o horário do filme for antes das 16 horas
        if (horaFilme < 16) {
            return valor * 0.9;
        } else {
            return valor;
        }
    }


    public static void main(String[] args) {
        Date dataDoFilme = new Date();
        EntradaDeCinema entrada = new EntradaDeCinema(dataDoFilme, "15:30", 1, 25.0);


        Data dataNascimentoCliente = new Data(2010, 5, 10); // Exemplo de data de nascimento


        double valorComDescontoIdade = entrada.calculaDesconto(dataNascimentoCliente);
        double valorComDescontoHorario = entrada.calculaDescontoHorario();


        System.out.println("Valor com Desconto de Idade: R$ " + valorComDescontoIdade);
        System.out.println("Valor com Desconto de Horário: R$ " + valorComDescontoHorario);
    }
}


// Classe Data (exemplo simplificado para demonstração)
class Data {
    private int ano;
    private int mes;
    private int dia;


    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }


    public int getAno() {
        return ano;
    }


    public int getMes() {
        return mes;
    }


    public int getDia() {
        return dia;
    }
}




E)
