package com.baha.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baha.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
