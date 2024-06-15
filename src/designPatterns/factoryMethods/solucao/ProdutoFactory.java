package designPatterns.factoryMethods.solucao;

import designPatterns.factoryMethods.Produto;
import designPatterns.factoryMethods.ProdutoDigital;
import designPatterns.factoryMethods.ProdutoFisico;
import designPatterns.factoryMethods.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo de produto nao disponivel");

        }
    }
}
