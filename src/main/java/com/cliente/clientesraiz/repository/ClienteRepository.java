package com.cliente.clientesraiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cliente.clientesraiz.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}