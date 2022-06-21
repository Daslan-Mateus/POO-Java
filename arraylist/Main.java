public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Daslan Mateus");
        Pessoa p2 = new Pessoa(2, "Lucas Mateus");
        Pessoa p3 = new Pessoa(3, "Kamylla");
        Pessoa p4 = new Pessoa(4, "Dayane");

        PessoaDao x = new PessoaDao();
        x.adicionar(p1);
        x.adicionar(p2);
        x.adicionar(p3);
        x.adicionar(p4);
        System.out.println(x.getAll());
        x.remover(p2);
        System.out.println(x.getAll());
        System.out.println(x.getByid(1));
        

        

       

    }
}