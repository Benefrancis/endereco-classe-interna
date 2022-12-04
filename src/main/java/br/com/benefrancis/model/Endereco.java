package br.com.benefrancis.model;

import javax.swing.*;

public class Endereco {

    private CEP cep;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private Cidade cidade;

    public Endereco() {
        super();
    }

    public Endereco(Endereco.CEP cep, String logradouro, String numero, String complemento, String bairro,
                    Endereco.Cidade cidade) {
        super();
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public CEP getCep() {
        return cep;
    }

    public Endereco setCep(CEP cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Endereco setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" [cep=").append(cep).append(", logradouro=").append(logradouro).append(", numero=")
                .append(numero).append(", complemento=").append(complemento).append(", bairro=").append(bairro)
                .append(", cidade=").append(cidade).append("]");
        return builder.toString();
    }

    public class Cidade {

        private String nome;

        private Estado estado;

        public Cidade() {
            super();
        }

        public Cidade(String nome, Endereco.Estado estado) {
            this.nome = nome;
            this.estado = estado;
        }

        public String getNome() {
            return nome;
        }

        public Cidade setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Estado getEstado() {
            return estado;
        }

        public Cidade setEstado(Estado estado) {
            this.estado = estado;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(" [nome=").append(nome).append(", estado=").append(estado).append("]");
            return builder.toString();
        }

    }

    public class Estado {

        private String nome;

        private Pais pais;

        public Estado() {
            super();
        }

        public Estado(String nome, Endereco.Pais pais) {
            super();
            this.nome = nome;
            this.pais = pais;
        }

        public String getNome() {
            return nome;
        }

        public Estado setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Pais getPais() {
            return pais;
        }

        public Estado setPais(Pais pais) {
            this.pais = pais;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(" [nome=").append(nome).append(", pais=").append(pais).append("]");
            return builder.toString();
        }

    }

    public class Pais {

        private String nome;

        public Pais() {
            super();
        }

        public Pais(String nome) {
            super();
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public Pais setNome(String nome) {
            this.nome = nome;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(" [nome=").append(nome).append("]");
            return builder.toString();
        }

    }

    public class CEP implements Validavel<String> {

        private String codigoDeEnderecamentoPostal;

        public CEP(String cep) {
            if (validar(cep)) {
                this.codigoDeEnderecamentoPostal = cep;
            } else {
                JOptionPane.showMessageDialog(null, "O CEP " + cep + " é inválido!");
                throw new RuntimeException("O CEP " + cep + " é inválido!");
            }

        }

        @Override
        public boolean validar(String t) {
            return t.matches("[0-9]{5}-[0-9]{3}");
        }

        @Override
        public String toString() {
            return codigoDeEnderecamentoPostal;
        }
    }
}
