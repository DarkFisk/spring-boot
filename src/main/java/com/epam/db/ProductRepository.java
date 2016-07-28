package com.epam.db;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Set;

/**
 * Created by Drudyak on 7/25/16.
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    Set<Product> findByName(String name);
}
