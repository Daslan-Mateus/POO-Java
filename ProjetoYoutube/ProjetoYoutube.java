public class ProjetoYoutube {
    
   //NESTE CÓDIGO EXISTE RELAÇÃO DE COMPOSIÇÃO
    public static void main(String[] args) {
        Video myVideo[] = new Video[2];
        myVideo[0] = new Video("Teste 1");
        myVideo[0].setCurtidas(2);
        myVideo[0].setReproduzindo(true);
        myVideo[1] = new Video("Teste 2");

        Gafanhoto p[] = new Gafanhoto[2];
        p[0] = new Gafanhoto("daslan", 23, "Masculino", "das@123");
        p[1] = new Gafanhoto("Kamylla", 24, "Feminina", "kamyz@13");

        Visualizacao visu[] = new Visualizacao[2];
        visu[0] = new Visualizacao(p[0], myVideo[0]);

        System.out.println(visu[0]);

    }
}
