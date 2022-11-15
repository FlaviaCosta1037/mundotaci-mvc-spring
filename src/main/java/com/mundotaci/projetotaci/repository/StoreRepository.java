package com.mundotaci.projetotaci.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mundotaci.projetotaci.entities.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findByStoreId(Long storeId);
    List<Store> findByNameStore(String nameStore);
}
