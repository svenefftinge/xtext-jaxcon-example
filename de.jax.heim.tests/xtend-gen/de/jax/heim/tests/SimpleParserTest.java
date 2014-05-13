package de.jax.heim.tests;

import com.google.inject.Inject;
import de.jax.heim.RegelspracheInjectorProvider;
import de.jax.heim.regelsprache.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(RegelspracheInjectorProvider.class)
@SuppressWarnings("all")
public class SimpleParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper validator;
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Fenster kann auf, zu");
      _builder.newLine();
      _builder.append("Heizung kann an, aus");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Wenn Fenster.auf dann Heizung.aus");
      _builder.newLine();
      _builder.append("Wenn Heizung.an  dann Fenster.zu");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this.validator.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
