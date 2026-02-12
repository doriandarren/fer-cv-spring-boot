package com.porfolio.my_porfolio_backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skills {
    private Long id;
    private String name;
    private String levelPercentage;
    private String iconClass;
    private String personalInfoId;
}
