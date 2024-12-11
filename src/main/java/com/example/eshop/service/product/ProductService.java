package com.example.eshop.service.product;

import com.example.eshop.exeption.ProductNotFountException;
import com.example.eshop.model.Product;
import com.example.eshop.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
    private ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() ->new ProductNotFountException("Product not found with this id"));
    }

    @Override
    public Void updateProduct(Product product, Long id) {
        return null;
    }

    @Override
    public Void deleteProductById(Long id) {
//        productRepository.deleteProduct(id).orElseThrow(()-> new ProductDeleteFailedException("Product delete failed"));
        productRepository.findById(id).ifPresentOrElse(productRepository ::delete, ()-> {throw new ProductDeleteFailedException("Product delete failed");});
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }


}
