public class Robo {
  int carga;

public Robo() {
    carga = 100;
}

public void girarEsquerda(int xE){

System.out.println("Seu Robô deu passos para a esquerda");
if(xE % 2 == 0 ){
    carga = carga -10;
    System.out.println("sua bateria tem carga de "+carga + "%");
    System.out.println("Sorria para a foto ");
}
if(carga <= 20){
    System.out.println("sua bateria precisa ser recarre");
}
System.out.println();
}

public void girarDireita(){
    System.out.println("Seu Robô deu passos para a direita");
}

public void passoFrente() {
    
    System.out.println("Seu Robô deu passos para frente");
}

public void passoTras() {
    System.out.println("Seu Robô deu passos para trás");
}



}