package designPatterns.prototype.problema;

import designPatterns.prototype.Botao;
import designPatterns.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul(){
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
