package sefakpsz.allInOnce.entities;

import jakarta.persistence.*;
import lombok.*;
import sefakpsz.allInOnce.enums.Order.OrderStatus;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    private Integer id;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToMany(
            cascade = {
                    CascadeType.REMOVE
            })
    @JoinTable(
            name = "product_orders",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    Set<Product> products;

    private LocalDateTime createdDate = LocalDateTime.now();
    private LocalDateTime modifiedDate = LocalDateTime.now();
}
