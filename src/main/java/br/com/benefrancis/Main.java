package br.com.benefrancis;

import br.com.benefrancis.model.Endereco;

public class Main {

    public static void main(String[] args) {
        Endereco e = new Endereco();

        e.setCep(e.new CEP("06086-120"));
        e.setBairro("Vila Osasco");

        Endereco.Pais pais = e.new Pais("Brasil");
        Endereco.Estado estado = e.new Estado("São Paulo", pais);
        Endereco.Cidade cidade = e.new Cidade("Osasco", estado);

        e.setCidade(cidade);
        e.setComplemento("Ap 81-A");
        e.setLogradouro("Rua Adolpho Bozzi");
        e.setNumero("505");
        System.out.println(e);
    }
}