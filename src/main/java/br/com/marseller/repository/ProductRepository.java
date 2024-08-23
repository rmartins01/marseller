package br.com.marseller.repository;

import org.springframework.data.repository.ListCrudRepository;

import br.com.marseller.model.Product;

public interface ProductRepository extends ListCrudRepository<Product, Long> {

}
