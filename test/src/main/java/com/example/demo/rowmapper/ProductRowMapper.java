package com.example.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProduct_id(rs.getInt("product_id"));
		product.setProduct_name(rs.getString("product_name"));
		product.setCategory(rs.getString("category"));
		product.setImage_url(rs.getString("image_url"));
		product.setPrice(rs.getInt("price"));
		product.setStock(rs.getInt("stock"));
		product.setDescription(rs.getString("description"));
		product.setCreated_date(rs.getDate("created_date"));
		product.setLast_modified_date(rs.getDate("last_modified_date"));
		return product;
	}
	

}
