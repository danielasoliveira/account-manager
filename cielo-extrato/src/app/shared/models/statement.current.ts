import { AccountStatement } from './accountStatement/accountStatement.model';
import { AccountStatementTransaction } from './accountStatement/accountStatementTransaction.model';

export class Statement {
  balanceOfPeriod: string;
  formatedTransactionDate: string;
  description: string;
  documentNumber: number;
  transactionType: string;
  formatedBalance: string;
  current: AccountStatementTransaction;

  constructor(statementResponse: AccountStatement) {
    this.setCurrent(statementResponse);
  }

  setCurrent(statementResponse) {
    this.current = statementResponse.transactions;
  }
}
