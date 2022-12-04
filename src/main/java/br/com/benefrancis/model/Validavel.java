package br.com.benefrancis.model;

@FunctionalInterface
public interface Validavel<T> {

    public boolean validar(T t);

}
