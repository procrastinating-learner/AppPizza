
package com.example.pizzahub.service;

import com.example.pizzahub.classes.Produit;
import com.example.pizzahub.dao.IDao;

import java.util.ArrayList;
import java.util.List;


public class ProduitService implements IDao <Produit>{
    private List<Produit> produits= new ArrayList<>();
    public static ProduitService instance;

    @Override
    public boolean create(Produit produit) {
        return produits.add(produit);
    }
    public static ProduitService getInstance(){
        if(instance == null)
            instance =  new ProduitService();
        return instance;
    }

    @Override
    public boolean update(Produit produit) {
        return false;
    }

    @Override
    public boolean delete(Produit produit) {
        return produits.remove(produit);
    }

    @Override
    public Produit findById(int i) {
        for(Produit p:produits){
            if(p.getId()==i)
                return p;
        }
        return null;

    }
    public List<Produit> findAll(){
        return produits;
    }
}
