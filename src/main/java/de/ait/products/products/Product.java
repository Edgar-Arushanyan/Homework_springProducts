package de.ait.products.products;

import lombok.*;


@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;
    private String product;
    private int quantity;
}
