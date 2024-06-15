package designPatterns.prototype.problema;

import designPatterns.prototype.Botao;
import designPatterns.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho(){
        setCor("Vermelha");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
