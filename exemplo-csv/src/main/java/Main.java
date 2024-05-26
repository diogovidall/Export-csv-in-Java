import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void gravarArquivoCsv(List<Cliente> clientes, String nomeArquivoCsv){
        FileWriter arquivo = null;
        Formatter saida = null;
        Boolean isFailed = false;

        nomeArquivoCsv += ".csv"; //Acrescentando a extensão CSV para o nomeArquivoCSV

        try {
            arquivo = new FileWriter(nomeArquivoCsv);
            saida = new Formatter(arquivo);
        }
        catch (IOException ioException){
            ioException.printStackTrace();

            System.exit(1);
        }
        try {
            for (Cliente cliente : clientes) {
                saida.format("%d;%s;%s;%s;%s;%d;%.2f;%.2f;%s;%s\n",
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getSobrenome(),
                        cliente.getGenero(),
                        cliente.getEmail(),
                        cliente.getIdade(),
                        cliente.getAltura(),
                        cliente.getPesoAtual(),
                        cliente.getRestricoes(),
                        cliente.getMetasDefinidas());
            }
        }
        catch (FormatterClosedException formatterClosedException){
            formatterClosedException.printStackTrace();
            isFailed = true;
        }
        finally {
            saida.close();

            try {
                arquivo.close();
            }
            catch (IOException ioException){
                isFailed = true;
            }
            if (isFailed){
                System.exit(1);
            }
        }
    }

    public static void lerAquivoCsv(String nomeArquivoCsv){
        FileReader arquivo = null;
        Scanner entrada = null;
        Boolean isFailed = false;

        nomeArquivoCsv += ".csv";

        try {
        arquivo = new FileReader(nomeArquivoCsv);
        entrada = new Scanner(arquivo).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException fileNotFoundException){

            System.out.println("Arquivo não encontrado!");
            fileNotFoundException.printStackTrace();

            System.exit(1);
        }
        try {
            System.out.printf("%s %s %s %s %s %s %s, %s, %s, %s", "Id", "Nome", "Sobrenome", "Gênero", "Email", "Idade", "Altura", "Peso Atual", "Restrições", "Metas Definidas\n");

            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                String sobrenome = entrada.next();
                String genero = entrada.next();
                String email = entrada.next();
                int idade = entrada.nextInt();
                Double altura = entrada.nextDouble();
                Double pesoAtual = entrada.nextDouble();
                String restricoes = entrada.next();
                String metasDefinidas = entrada.next();

                System.out.printf("%s %s %s %s %s %s %s, %s, %s, %s\n", id,nome,sobrenome,genero,email,idade,altura,pesoAtual,restricoes,metasDefinidas);
            }
        }
        catch (NoSuchElementException noSuchElementException){
            System.out.println("Erro na leitura do arquivo");
            noSuchElementException.printStackTrace();
            isFailed = true;
        }
    }

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1, "Bosonaro", "Pereira", "Masculino", "luiz@email.com", 45, 1.80, 85.0, "Olegeanosas", "Perda de Peso"));
        clientes.add(new Cliente(2, "Lula", "Guga", "Masculino", "lula@email.com", 100, 1.30, 44.0, "Carne", "Ficar marombinha"));

        gravarArquivoCsv(clientes, "relatorio_semanal_cadastro_usuarios"); // --> C:\\nomePasta
        lerAquivoCsv("relatorio_semanal_cadastro_usuarios");

    }
}
