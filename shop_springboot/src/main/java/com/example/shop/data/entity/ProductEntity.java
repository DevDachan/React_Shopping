package com.example.shop.data.entity;

import com.example.shop.data.dto.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "product")
public class ProductEntity {
  @Id
  int id;

  String name;

  int price;

  String detail;

  int deliveryCost;

  String deliveryTime;



  public ProductDTO toDto(){
    return ProductDTO.builder()
        .id(id)
        .name(name)
        .price(price)
        .detail(detail)
        .deliveryTime(deliveryTime)
        .deliveryCost(deliveryCost)
        .build();
  }
}
