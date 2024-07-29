import robo_aspirador.*;

public class Test {
    public static void main(String[] args) {

        Funcao aspirar = new FuncaoAspirar();
        Funcao desligar = new FuncaoDesligar();
        Funcao ligar = new FuncaoLigar();

        Robo robo = new Robo();
        robo.setFuncao(ligar);
        robo.aspirar();
        robo.aspirar();
        robo.setFuncao(aspirar);
        robo.aspirar();
        robo.setFuncao(desligar);
        robo.aspirar();
        robo.aspirar();
        robo.aspirar();


    }
}