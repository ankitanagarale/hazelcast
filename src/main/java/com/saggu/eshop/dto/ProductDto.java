/* (C)2023 */
package com.saggu.eshop.dto;
 
import java.io.Serializable;
 
public record ProductDto(String productId, String name, double price, String description)
        implements Serializable {
 
    public ProductDto(String name, double price, String description) {
        this(null, name, price, description);
    }
}
