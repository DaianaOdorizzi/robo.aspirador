package robo_aspirador;

public class Robo {
    private Funcao funcao;

    public void setFuncao (Funcao funcao) {
        this.funcao = funcao;
    }

    public void aspirar() {
        funcao.aspirar();
    }

}
