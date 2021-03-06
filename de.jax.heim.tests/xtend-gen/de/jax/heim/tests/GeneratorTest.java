package de.jax.heim.tests;

import de.jax.heim.RegelspracheInjectorProvider;
import de.jax.heim.regelsprache.Model;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(RegelspracheInjectorProvider.class)
@SuppressWarnings("all")
public class GeneratorTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private IGenerator generator;
  
  @Test
  public void testGenerator() {
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
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generator.doGenerate(_eResource, fsa);
      Map<String, Object> _allFiles = fsa.getAllFiles();
      int _size = _allFiles.size();
      Assert.assertEquals(3, _size);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package mein.heim;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import java.util.Scanner;");
      _builder_1.newLine();
      _builder_1.append("import mein.heim.Fenster;");
      _builder_1.newLine();
      _builder_1.append("import mein.heim.Heizung;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class __synthetic0RegelMaschine {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public static void main(final String[] args) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("new __synthetic0RegelMaschine().run();");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public void run() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("Scanner sc = new Scanner(System.in);");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\"Haussimulator aktiviert. Folgende Befehle stehen zur Verfügung : \");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\" - Fenster auf\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\" - Fenster zu\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\" - Heizung an\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\" - Heizung aus\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\"Warte auf Eingabe...\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("while(sc.hasNextLine()) {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("String command = sc.nextLine();");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("String[] split = command.split(\" \");");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if (split[0].equals(\"Fenster\")) {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if (split[1].equals(\"auf\")) {");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("trigger(Fenster.auf);");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("} else ");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if (split[1].equals(\"zu\")) {");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("trigger(Fenster.zu);");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("} else ");
      _builder_1.newLine();
      _builder_1.append("                ");
      _builder_1.append("{");
      _builder_1.newLine();
      _builder_1.append("                ");
      _builder_1.append("System.err.println(\"Der Zustand \"+split[1]+\" ist für das Gerät \"+split[0]+\" nicht definiert.\");");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if (split[0].equals(\"Heizung\")) {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if (split[1].equals(\"an\")) {");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("trigger(Heizung.an);");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("} else ");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if (split[1].equals(\"aus\")) {");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("trigger(Heizung.aus);");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("} else ");
      _builder_1.newLine();
      _builder_1.append("                ");
      _builder_1.append("{");
      _builder_1.newLine();
      _builder_1.append("                ");
      _builder_1.append("System.err.println(\"Der Zustand \"+split[1]+\" ist für das Gerät \"+split[0]+\" nicht definiert.\");");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("System.out.println(\"Warte auf Eingabe...\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("protected void trigger(final Enum<?> event) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("System.out.println(\"Signal \'\"+event.getClass().getSimpleName()+\" \"+event+\"\' eingegangen.\");");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("if (event == Fenster.auf) {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("trigger(dann_2());");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("if (event == Heizung.an) {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("trigger(dann_3());");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public Heizung dann_2() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return Heizung.aus;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public Fenster dann_3() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return Fenster.zu;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String, Object> _allFiles_1 = fsa.getAllFiles();
      Object _get = _allFiles_1.get("DEFAULT_OUTPUTmein/heim/__synthetic0RegelMaschine.java");
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
