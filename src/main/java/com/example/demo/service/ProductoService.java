package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {

 private final ProductoRepository repo;

 public ProductoService(ProductoRepository repo) {
  this.repo = repo;
 }

 public List<Producto> listar() {
  return repo.findAll();
 }

 public Producto guardar(Producto p) {
  return repo.save(p);
 }

 public Producto buscar(Long id) {
  return repo.findById(id).orElseThrow(() -> new RuntimeException("No encontrado"));
 }

 public void eliminar(Long id) {
  repo.deleteById(id);
 }
}
