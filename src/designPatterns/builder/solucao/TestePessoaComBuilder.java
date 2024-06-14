package designPatterns.builder.solucao;

import designPatterns.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder().nome("Haralan")
                .sobreNome("Santana")
                .documento("4589952488")
                .email("haralansantana@gmail.com")
                .apelido("Hara")
                .dataNascimento(LocalDate.of(1989, 9, 8))
                .build();

        Pessoa pessoa2 = new Pessoa.PessoaBuilder().nome("Joao")
                .sobreNome("Silva")
                .documento("4581468488")
                .email("joaosilva@email.com")
                .apelido("Jo")
                .dataNascimento(LocalDate.of(1975, 8, 15))
                .build();



        System.out.println(pessoa);
        System.out.println(pessoa2);
    }
}
