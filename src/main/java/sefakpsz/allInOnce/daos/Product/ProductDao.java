package sefakpsz.allInOnce.daos.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sefakpsz.allInOnce.daos.Category.CategoryDao;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDao {
    private Integer id;
    private String title;
    private Float price;
    private String imageURL;
    private CategoryDao category;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
