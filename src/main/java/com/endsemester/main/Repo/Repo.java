package com.endsemester.main.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endsemester.main.Entity.UserType;

public interface Repo extends JpaRepository<UserType, Integer> {
    List<UserType> findAll();
}
