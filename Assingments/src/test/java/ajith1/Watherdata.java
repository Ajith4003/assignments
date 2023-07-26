package ajith1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Watherdata {

private int cod;
private double message;
private int cnt;
@JsonAlias("list")
private List<WatherEntery>list;
private City city;   



	

}
