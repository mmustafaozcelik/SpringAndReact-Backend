package com.mmustafa.northwind.business.abstracts;

import java.util.List;

import com.mmustafa.northwind.core.utilities.results.DataResult;
import com.mmustafa.northwind.core.utilities.results.Result;
import com.mmustafa.northwind.entities.concretes.Product;
import com.mmustafa.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAllSorted();
	
	DataResult<List<Product>> getAll(int pageNo , int pageSize);
	
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName , int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName , int categoryId);
	
	DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory_CategoryId(String productName , int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
}
