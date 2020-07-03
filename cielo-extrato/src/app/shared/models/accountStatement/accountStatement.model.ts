
import { ListaControleLancamento } from './listaControleLancamento.model';
import { TotalControleLancamento } from './totalControleLancamento.model';
export class AccountStatement {
  constructor(

    public totalControleLancamento: TotalControleLancamento,
    public listaControleLancamento: ListaControleLancamento[],
    public indice: number,
    public tamanhoPagina: number,
    public totalElements: number
  ) {}

}

