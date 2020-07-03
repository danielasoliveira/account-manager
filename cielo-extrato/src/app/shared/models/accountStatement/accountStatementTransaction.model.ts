import { LancamentoContaCorrenteCliente } from './lancamentoContaCorrente.model';
export class AccountStatementTransaction {
  constructor(
    public lancamentoContaCorrenteCliente: LancamentoContaCorrenteCliente,
    public dataEfetivaLancamento: string,
    public dataLancamentoContaCorrenteCliente: string,
    public numeroEvento: number,
    public descricaoGrupoPagamento: string,
    public codigoIdentificadorUnico: string,
    public nomeBanco: string,
    public quantidadeLancamentoRemessa: number,
    public numeroRaizCNPJ: string,
    public numeroSufixoCNPJ: string,
    public valorLancamentoRemessa: number,
    public dateLancamentoContaCorrenteCliente: any,
    public dateEfetivaLancamento: any
  ) {}
}
