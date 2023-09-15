package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import exception.MenosDeQuatroItensException;
import model.Pais;

public class PaisDao{
    private List<Pais> listaDePaises;

    public PaisDao() {
        listaDePaises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        listaDePaises.add(pais);
    }

    public List<Pais> obterListaDePaises() {
        return listaDePaises;
    }


    public boolean removerPais(String nomePaisRemover) {
        for (Pais pais : listaDePaises) {
            if (pais.getNome().equalsIgnoreCase(nomePaisRemover)) {
                listaDePaises.remove(pais);
                return true;
            }
        }
        return false;
    }

    public void limparListaDePaises() {
        listaDePaises.clear();
    }

    
    
    public Pais getPrimeiroPais() throws NoSuchElementException {
        if (listaDePaises.isEmpty()) {
            throw new NoSuchElementException("A lista está vazia. Não é possível pegar o primeiro elemento.");
        }
        return listaDePaises.get(0);
    }

    public Pais getTerceiroPais() throws NoSuchElementException {
        if (listaDePaises.size() < 3) {
            throw new NoSuchElementException("A lista não contém pelo menos 3 elementos.");
        }
        return listaDePaises.get(2);
    }

    public Pais getQuartoPais() throws MenosDeQuatroItensException {
        if (listaDePaises.size() < 4) {
            throw new MenosDeQuatroItensException("A lista não contém pelo menos 4 elementos.");
        }
        return listaDePaises.get(3);
    }
}