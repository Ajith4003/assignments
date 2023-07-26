package ajith1;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wather {
private String main;
private String description;
private int id;
@JsonAlias("icon")
private String icon;



}
