package org.talend.designer.camel.spring.core.parsers;

import java.util.Map;

import org.apache.camel.model.OptionalIdentifiedDefinition;

public class DelayComponentParser extends AbstractComponentParser {

	@Override
	protected void parse(OptionalIdentifiedDefinition oid,
			Map<String, String> map) {

	}

	@Override
	public int getType() {
		return DELAY;
	}

}
