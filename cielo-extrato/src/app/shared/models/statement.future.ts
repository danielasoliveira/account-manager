import { AccountFutureStatementResponse, Transaction } from './statement.future.response';

export class StatementFuture {
  balanceOfPeriod: string;
  formatedTransactionDate: string;
  description: string;
  documentNumber: number;
  transactionType: string;
  formatedBalance: string;
  future: Transaction;

  constructor(futureStatementResponse: AccountFutureStatementResponse) {
    this.setFuture(futureStatementResponse);
  }

  setFuture(futureStatementResponse) {
    this.future = futureStatementResponse.transactions;
  }
}
