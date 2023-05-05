public class Pessoa {

    private String nome, sobrenome, endereco, cidade, UF;
    private int idade;

    public Pessoa(
        String nome,
        String sobrenome,
        String endereco,
        String cidade,
        String UF,
        int idade) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.endereco = endereco;
            this.cidade = cidade;
            this.UF = UF;
            this.idade = idade;
        }
        public String getNome(){
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getSobrenome(){
            return sobrenome;
        }
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
        public String getEndereco(){
            return endereco;
        }
        public void setEndereco(String endereco){
            this.endereco = endereco;
        }
        public String getCidade(){
            return cidade;
        }
        public void setCidade(String cidade){
            this.cidade = cidade;
        }   
        public String getUF() {
            return UF;
        }
        public void setUF(String UF) {
            this.UF = UF;
        }
        public int getIdade(){
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
    public static void main(String[] args) {

        Pessoa alunoPessoa = new Pessoa("Rafael", "Vieira Ferreira",
            "Rua Bonfim, 222 - Peret", "Três Pontas", "MG", 30);

        System.out.println(alunoPessoa.getNome());
        System.out.println(alunoPessoa.getSobrenome());
        System.out.println(alunoPessoa.getEndereco());
        System.out.println(alunoPessoa.getCidade());
        System.out.println(alunoPessoa.getUF());
        System.out.println(alunoPessoa.getIdade());

        Pessoa alunoProfessor = new Pessoa("Alberane Lúcio", "Thiago da Cunha", 
            "Avenida Alzira Barra Gazzola, 650 - Aeroporto", "Varginha", "MG", 30);

        System.out.println(alunoProfessor.getNome());
        System.out.println(alunoProfessor.getSobrenome());
        System.out.println(alunoProfessor.getEndereco());
        System.out.println(alunoProfessor.getCidade());
        System.out.println(alunoProfessor.getUF());
        System.out.println(alunoProfessor.getIdade());
    }
    
}

