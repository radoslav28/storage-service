package com.onlineshop.storage.api.operations.sales.get.byitem;

import com.onlineshop.storage.api.base.ProcessorInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetSalesByItemInput implements ProcessorInput {

    @UUID
    @NotBlank
    private String itemId;
}
