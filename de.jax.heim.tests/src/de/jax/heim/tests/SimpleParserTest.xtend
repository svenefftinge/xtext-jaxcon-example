package de.jax.heim.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.jax.heim.RegelspracheInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import de.jax.heim.regelsprache.Model
import org.junit.Test
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(RegelspracheInjectorProvider)
class SimpleParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject ValidationTestHelper validator
	
	@Test def void testParsing() {
		val model = '''
			Fenster kann auf, zu
			Heizung kann an, aus
			
			Wenn Fenster.auf dann Heizung.aus
			Wenn Heizung.an  dann Fenster.zu
		'''.parse
		
		validator.assertNoErrors(model)
	} 
}