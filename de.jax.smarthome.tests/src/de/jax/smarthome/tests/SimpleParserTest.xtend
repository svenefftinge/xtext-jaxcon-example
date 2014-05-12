package de.jax.smarthome.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.jax.smarthome.RegelSpracheInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import de.jax.smarthome.regelSprache.Model
import de.jax.smarthome.regelSprache.Regel
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(RegelSpracheInjectorProvider)
class SimpleParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject ValidationTestHelper validator
	
	@Test
	def void testParsing() {
		val model = '''
			Das Fenster kann auf, zu
			Die Heizung kann an, aus
			
			Wenn das Fenster auf ist, muss die Heizung aus.
			Wenn die Heizung an ist, muss das Fenster zu.
		'''.parse
		validator.assertNoErrors(model)
		val regel1 = model.definitionen.get(2) as Regel
		val regel2 = model.definitionen.get(3) as Regel
		assertEquals("auf", regel1.wenn.name)
		assertEquals("aus", regel1.dann.name)
		assertEquals("an", regel2.wenn.name)
		assertEquals("zu", regel2.dann.name)
	}
}