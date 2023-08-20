package com.ecommerce.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Size {
	
	private String name;
	private Integer quantity;
	
	
	
}
