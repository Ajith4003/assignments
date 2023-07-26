package ajith1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class WatherListdeseriazer  extends StdDeserializer<List<Wather>> {

	public WatherListdeseriazer() {
		
		super(ArrayList.class);
		
	}

	@Override
	public List<Wather> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
		
		
		List< Wather>watherList= new ArrayList<Wather>();
		JsonNode node =p.getCodec().readTree(p);
		if(node.isArray()) {
			for(JsonNode wathernode:node) {
				int id=wathernode.get("id").asInt();
				String main=wathernode.get("main").asText();
				String description =wathernode.get("description").asText();
				String icon=wathernode.get("ocon").asText();
			wather	wather1=new wather(id,main,description,icon);
			WatherList.add(wather1);	
				
				
			}	
		}
		return watherList;
	}

}
