package sefakpsz.allInOnce.daos.Product;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sefakpsz.allInOnce.utils.validations.MyNotBlank.MyNotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDao {
    @MyNotBlank
    private String title;

    @NotNull
    private Float price;

    @MyNotBlank
    private String imageURL;

    @NotNull
    private Integer categoryId;
}
