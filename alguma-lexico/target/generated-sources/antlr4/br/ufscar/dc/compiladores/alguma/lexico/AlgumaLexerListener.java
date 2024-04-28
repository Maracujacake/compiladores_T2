// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaLexer.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.alguma.lexico;

import br.ufscar.dc.compiladores.alguma.lexico.Arquivo;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaLexerParser}.
 */
public interface AlgumaLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaLexerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaLexerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlgumaLexerParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlgumaLexerParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(AlgumaLexerParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(AlgumaLexerParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(AlgumaLexerParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(AlgumaLexerParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AlgumaLexerParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AlgumaLexerParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(AlgumaLexerParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(AlgumaLexerParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(AlgumaLexerParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(AlgumaLexerParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaLexerParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaLexerParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(AlgumaLexerParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(AlgumaLexerParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(AlgumaLexerParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(AlgumaLexerParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(AlgumaLexerParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(AlgumaLexerParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(AlgumaLexerParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(AlgumaLexerParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlgumaLexerParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlgumaLexerParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(AlgumaLexerParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(AlgumaLexerParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlgumaLexerParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlgumaLexerParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(AlgumaLexerParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(AlgumaLexerParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaLexerParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaLexerParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaLexerParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaLexerParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(AlgumaLexerParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(AlgumaLexerParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(AlgumaLexerParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(AlgumaLexerParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(AlgumaLexerParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(AlgumaLexerParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(AlgumaLexerParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(AlgumaLexerParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(AlgumaLexerParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(AlgumaLexerParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(AlgumaLexerParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(AlgumaLexerParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(AlgumaLexerParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(AlgumaLexerParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(AlgumaLexerParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(AlgumaLexerParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(AlgumaLexerParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(AlgumaLexerParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(AlgumaLexerParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(AlgumaLexerParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(AlgumaLexerParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(AlgumaLexerParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(AlgumaLexerParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(AlgumaLexerParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(AlgumaLexerParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(AlgumaLexerParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(AlgumaLexerParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(AlgumaLexerParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(AlgumaLexerParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(AlgumaLexerParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(AlgumaLexerParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(AlgumaLexerParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaLexerParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaLexerParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlgumaLexerParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlgumaLexerParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(AlgumaLexerParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(AlgumaLexerParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(AlgumaLexerParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(AlgumaLexerParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(AlgumaLexerParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(AlgumaLexerParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(AlgumaLexerParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(AlgumaLexerParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(AlgumaLexerParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(AlgumaLexerParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(AlgumaLexerParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(AlgumaLexerParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(AlgumaLexerParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(AlgumaLexerParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(AlgumaLexerParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(AlgumaLexerParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlgumaLexerParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlgumaLexerParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(AlgumaLexerParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(AlgumaLexerParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(AlgumaLexerParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(AlgumaLexerParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(AlgumaLexerParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(AlgumaLexerParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(AlgumaLexerParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(AlgumaLexerParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(AlgumaLexerParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(AlgumaLexerParser.Op_logico_2Context ctx);
}