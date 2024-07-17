package com.inovation.productecommercy.domain.product;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "product")
@EqualsAndHashCode(of = "id")
@Entity(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private String id;

   private String name;

   private Number price_in_cents;
}
