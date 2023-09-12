package sefakpsz.allInOnce.daos.Order;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sefakpsz.allInOnce.enums.Order.OrderStatus;
import sefakpsz.allInOnce.utils.validations.MyNotBlank.MyNotBlank;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderUpdateStatusDao {
    @NotNull
    private Integer id;

    @MyNotBlank
    private OrderStatus status;
}
