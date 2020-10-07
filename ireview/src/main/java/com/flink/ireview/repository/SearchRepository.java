package com.flink.ireview.repository;

import com.flink.ireview.model.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<Search,Long> {
}
