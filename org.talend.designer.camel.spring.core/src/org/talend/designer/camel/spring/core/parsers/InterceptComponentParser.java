package org.talend.designer.camel.spring.core.parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.model.InterceptDefinition;
import org.apache.camel.model.OptionalIdentifiedDefinition;

public class InterceptComponentParser extends AbstractComponentParser {

	private List<InterceptDefinition> ids = new ArrayList<InterceptDefinition>();

	@Override
	protected void parse(OptionalIdentifiedDefinition oid,
			Map<String, String> map) {
		ids.add((InterceptDefinition) oid);
	}

	public boolean hasProcessed(InterceptDefinition id) {
		return ids.contains(id);
	}

	@Override
	public int getType() {
		return INTERCEPT;
	}

	public void clear() {
		ids.clear();
	}

}
