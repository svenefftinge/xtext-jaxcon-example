package de.jax.smarthome.tests;

import com.google.inject.Inject;
import de.jax.smarthome.RegelSpracheInjectorProvider;
import de.jax.smarthome.regelSprache.Definition;
import de.jax.smarthome.regelSprache.Model;
import de.jax.smarthome.regelSprache.Regel;
import de.jax.smarthome.regelSprache.Zustand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(RegelSpracheInjectorProvider.class)
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
      _builder.append("Das Fenster kann auf, zu");
      _builder.newLine();
      _builder.append("Die Heizung kann an, aus");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Wenn das Fenster auf ist, muss die Heizung aus.");
      _builder.newLine();
      _builder.append("Wenn die Heizung an ist, muss das Fenster zu.");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this.validator.assertNoErrors(model);
      EList<Definition> _definitionen = model.getDefinitionen();
      Definition _get = _definitionen.get(2);
      final Regel regel1 = ((Regel) _get);
      EList<Definition> _definitionen_1 = model.getDefinitionen();
      Definition _get_1 = _definitionen_1.get(3);
      final Regel regel2 = ((Regel) _get_1);
      Zustand _wenn = regel1.getWenn();
      String _name = _wenn.getName();
      Assert.assertEquals("auf", _name);
      Zustand _dann = regel1.getDann();
      String _name_1 = _dann.getName();
      Assert.assertEquals("aus", _name_1);
      Zustand _wenn_1 = regel2.getWenn();
      String _name_2 = _wenn_1.getName();
      Assert.assertEquals("an", _name_2);
      Zustand _dann_1 = regel2.getDann();
      String _name_3 = _dann_1.getName();
      Assert.assertEquals("zu", _name_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
