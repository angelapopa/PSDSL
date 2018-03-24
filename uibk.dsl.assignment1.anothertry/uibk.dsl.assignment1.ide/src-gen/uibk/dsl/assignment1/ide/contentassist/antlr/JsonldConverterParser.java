/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uibk.dsl.assignment1.ide.contentassist.antlr.internal.InternalJsonldConverterParser;
import uibk.dsl.assignment1.services.JsonldConverterGrammarAccess;

public class JsonldConverterParser extends AbstractContentAssistParser {

	@Inject
	private JsonldConverterGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalJsonldConverterParser createParser() {
		InternalJsonldConverterParser result = new InternalJsonldConverterParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getEntityAccess().getGroup_4_1(), "rule__Entity__Group_4_1__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEnumAccess().getGroup_3(), "rule__Enum__Group_3__0");
					put(grammarAccess.getEnumAccess().getGroup_3_1(), "rule__Enum__Group_3_1__0");
					put(grammarAccess.getEnumItemAccess().getGroup(), "rule__EnumItem__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_4_0(), "rule__Entity__FeaturesAssignment_4_0");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_4_1_1(), "rule__Entity__FeaturesAssignment_4_1_1");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0(), "rule__Property__NameAssignment_0");
					put(grammarAccess.getPropertyAccess().getManyAssignment_2(), "rule__Property__ManyAssignment_2");
					put(grammarAccess.getPropertyAccess().getOneAssignment_3(), "rule__Property__OneAssignment_3");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_4(), "rule__Property__TypeAssignment_4");
					put(grammarAccess.getEnumAccess().getNameAssignment_1(), "rule__Enum__NameAssignment_1");
					put(grammarAccess.getEnumAccess().getFeaturesAssignment_3_0(), "rule__Enum__FeaturesAssignment_3_0");
					put(grammarAccess.getEnumAccess().getFeaturesAssignment_3_1_1(), "rule__Enum__FeaturesAssignment_3_1_1");
					put(grammarAccess.getEnumItemAccess().getNameAssignment_0(), "rule__EnumItem__NameAssignment_0");
					put(grammarAccess.getEnumItemAccess().getTypeAssignment_2(), "rule__EnumItem__TypeAssignment_2");
					put(grammarAccess.getEntityAccess().getUnorderedGroup_4(), "rule__Entity__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JsonldConverterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JsonldConverterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}