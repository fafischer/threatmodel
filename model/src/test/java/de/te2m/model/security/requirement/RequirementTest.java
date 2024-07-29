package de.te2m.model.security.requirement;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Link;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RequirementTest {
	@Test
	public void builder(){
		ID id = new ID("abc");
		Description description = new Description("bla");
		Link link = new Link("https://bla/abc");
		assertNotNull(id);
		Requirement req = Requirement.builder().id(id).description(description).externalLink(link).build();
		assertNotNull(req);
	}
}