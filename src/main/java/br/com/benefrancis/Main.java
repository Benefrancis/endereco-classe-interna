package br.com.benefrancis;

import br.com.benefrancis.model.Endereco;

public class Main {

    public static void main(String[] args) {
        Endereco e = new Endereco();


        Endereco.Pais pais = e.new Pais("Brasil");
        Endereco.Estado estado = e.new Estado("São Paulo", pais);
        Endereco.Cidade cidade = e.new Cidade("Osasco", estado);

        e.setCep(e.new CEP("06086-120"))
                .setBairro("Vila Osasco")
                .setCidade(cidade)
                .setComplemento("Ap 81-A")
                .setLogradouro("Rua Adolpho Bozzi")
                .setNumero("505");

        System.out.println(e);
    }
}