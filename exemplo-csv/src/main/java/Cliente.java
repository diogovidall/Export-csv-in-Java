public class Cliente {

    //Atributos
    private int id;
    private String nome;
    private String sobrenome;
    private String genero;
    private String email;
    private int idade;
    private Double altura;
    private Double pesoAtual;
    private String restricoes;
    private String metasDefinidas;

    public Cliente(int id, String nome, String sobrenome, String genero, String email, int idade, Double altura, Double pesoAtual, String restricoes, String metasDefinidas) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
        this.pesoAtual = pesoAtual;
        this.restricoes = restricoes;
        this.metasDefinidas = metasDefinidas;
    }

    public String getMetasDefinidas() {
        return metasDefinidas;
    }

    public void setMetasDefinidas(String metasDefinidas) {
        this.metasDefinidas = metasDefinidas;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public Double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(Double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", genero='" + genero + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", pesoAtual=" + pesoAtual +
                ", restricoes='" + restricoes + '\'' +
                ", metasDefinidas='" + metasDefinidas + '\'' +
                '}';
    }
}
