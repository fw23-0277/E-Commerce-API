package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "descroption")
	private String description;
	
	@Column(name = "price")
	private Integer price;
	
	
	@Column(name = "descountPrice")
	private Integer discountPrice;
	
	
	@Column(name = "discount_present")
	private Integer discountPresent;
	
	private Integer quantity;
	
	private String Brand;
	
	private String color;
	
	
	@Embedded
	@ElementCollection
	@Column(name =  "sizes")
	private Set<Size> sizes = new HashSet<>();
	
	
	@Column(name = "image_url")
	private String imageUrl;
	
	
	@OneToMany(mappedBy = "product" , cascade = CascadeType.ALL,orphanRemoval = true)
	private  List<Rating> ratings = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "product" , cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Review> reviews = new  ArrayList<>();
	
	
	@Column(name = "num_ratings")
	private Integer numRatings;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	private LocalDateTime createdAt;
	
	
	
	
	
}
