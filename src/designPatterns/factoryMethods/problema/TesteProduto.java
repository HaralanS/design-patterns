package designPatterns.factoryMethods.problema;

import designPatterns.factoryMethods.Produto;
import designPatterns.factoryMethods.ProdutoDigital;
import designPatterns.factoryMethods.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
