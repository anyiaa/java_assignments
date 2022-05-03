package lv.tsi.webshop.resource;

import lv.tsi.webshop.model.ProductModel;
import lv.tsi.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;

import java.util.List;
import java.util.Optional;

public class ProductResource {
    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getProducts() {
        Iterable<ProductModel> iterable = productRepository.findAll();
        List<ProductModel> list = Streamable.of(iterable).toList();

        return list;
    }

    public Optional<ProductModel> getProduct(Long id) {
        Optional<ProductModel> product = productRepository.findById(id);

        return product;
    }
}
