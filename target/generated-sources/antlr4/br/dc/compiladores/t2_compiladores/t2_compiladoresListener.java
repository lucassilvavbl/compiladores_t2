// Generated from br\dc\compiladores\t2_compiladores\t2_compiladores.g4 by ANTLR 4.12.0
package br.dc.compiladores.t2_compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t2_compiladoresParser}.
 */
public interface t2_compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(t2_compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(t2_compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(t2_compiladoresParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(t2_compiladoresParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(t2_compiladoresParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(t2_compiladoresParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(t2_compiladoresParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(t2_compiladoresParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(t2_compiladoresParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(t2_compiladoresParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(t2_compiladoresParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(t2_compiladoresParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(t2_compiladoresParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(t2_compiladoresParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(t2_compiladoresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(t2_compiladoresParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(t2_compiladoresParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(t2_compiladoresParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(t2_compiladoresParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(t2_compiladoresParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(t2_compiladoresParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(t2_compiladoresParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(t2_compiladoresParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(t2_compiladoresParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(t2_compiladoresParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(t2_compiladoresParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(t2_compiladoresParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(t2_compiladoresParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(t2_compiladoresParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(t2_compiladoresParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(t2_compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(t2_compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(t2_compiladoresParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(t2_compiladoresParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(t2_compiladoresParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(t2_compiladoresParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(t2_compiladoresParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(t2_compiladoresParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(t2_compiladoresParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(t2_compiladoresParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(t2_compiladoresParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(t2_compiladoresParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(t2_compiladoresParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(t2_compiladoresParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(t2_compiladoresParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(t2_compiladoresParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(t2_compiladoresParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(t2_compiladoresParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(t2_compiladoresParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(t2_compiladoresParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(t2_compiladoresParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(t2_compiladoresParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(t2_compiladoresParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(t2_compiladoresParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(t2_compiladoresParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(t2_compiladoresParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(t2_compiladoresParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(t2_compiladoresParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(t2_compiladoresParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(t2_compiladoresParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(t2_compiladoresParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(t2_compiladoresParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(t2_compiladoresParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(t2_compiladoresParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(t2_compiladoresParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(t2_compiladoresParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(t2_compiladoresParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(t2_compiladoresParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(t2_compiladoresParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(t2_compiladoresParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(t2_compiladoresParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(t2_compiladoresParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(t2_compiladoresParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(t2_compiladoresParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(t2_compiladoresParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(t2_compiladoresParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(t2_compiladoresParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(t2_compiladoresParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(t2_compiladoresParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(t2_compiladoresParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(t2_compiladoresParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(t2_compiladoresParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(t2_compiladoresParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(t2_compiladoresParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(t2_compiladoresParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(t2_compiladoresParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(t2_compiladoresParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(t2_compiladoresParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(t2_compiladoresParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(t2_compiladoresParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(t2_compiladoresParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(t2_compiladoresParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(t2_compiladoresParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(t2_compiladoresParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(t2_compiladoresParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(t2_compiladoresParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(t2_compiladoresParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(t2_compiladoresParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2_compiladoresParser#op_logica_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica_2(t2_compiladoresParser.Op_logica_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2_compiladoresParser#op_logica_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica_2(t2_compiladoresParser.Op_logica_2Context ctx);
}