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
    System.out.println("sua bateria precisa ser recarregada");
}
System.out.println();
}

public void girarDireita(int xD){
    System.out.println("Seu Robô deu passos para a direita");
    if(xD % 2 == 0 ){
        carga = carga -10;
        System.out.println("sua bateria tem carga de "+carga + "%");
        System.out.println("Sorria para a foto ");
    }
    if(carga <= 20){
        System.out.println("sua bateria precisa ser recarregada");
    }
    System.out.println();
}

public void passoFrente(int xF) {
    
    System.out.println("Seu Robô deu passos para frente");
    if(xF % 2 == 0 ){
        carga = carga -10;
        System.out.println("sua bateria tem carga de "+carga + "%");
        System.out.println("Sorria para a foto ");
    }
    if(carga <= 20){
        System.out.println("sua bateria precisa ser recarregada");
    }
    System.out.println();
}

public void passoTras(int xT) {
    System.out.println("Seu Robô deu passos para trás");
    if(xT % 2 == 0 ){
        carga = carga -10;
        System.out.println("sua bateria tem carga de "+carga + "%");
        System.out.println("Sorria para a foto ");
    }
    if(carga <= 20){
        System.out.println("sua bateria precisa ser recarregada");
    }
    System.out.println();
}



}
