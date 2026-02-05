package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

 private final ProductoService service;

 public ProductoController(ProductoService service) {
  this.service = service;
 }

 @GetMapping
 public List<Producto> listar() {
  return service.listar();
 }

 @PostMapping
 public Producto crear(@RequestBody Producto p) {
  return service.guardar(p);
 }

 @GetMapping("/{id}")
 public Producto obtener(@PathVariable Long id) {
  return service.buscar(id);
 }

 @DeleteMapping("/{id}")
 public void eliminar(@PathVariable Long id) {
  service.eliminar(id);
 }
}
