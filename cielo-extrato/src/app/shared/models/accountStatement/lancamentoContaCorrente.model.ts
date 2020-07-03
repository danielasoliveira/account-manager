import { DadosDomicilioBancario } from './dadosDomicilioBancarios.model';

export class LancamentoContaCorrenteCliente {
    constructor(
        public numeroRemessaBanco: number,
        public nomeSituacaoRemessa: string,
        public dadosDomicilioBancario: DadosDomicilioBancario,
        public nomeTipoOperacao: string,
        public dadosAnaliticoLancamentoFinanceiroCliente: any[]
    ){}
}