package com.example.InteriorsECM.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    private LocalDateTime order_date;
    Double total_price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToMany(mappedBy = "orders")
    List<Product> products;
}
