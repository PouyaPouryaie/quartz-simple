package ir.bigz.quartzsimple.web.model;

import lombok.Data;

@Data
public class FilterRequest {

    private Boolean active;
    private String zipFilter;

    public FilterRequest() { }
}
